package org.dengying.personnal.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
 
import org.dengying.personnal.service.PersonnalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.dengying.personnal.model.Datagrid;
import org.dengying.personnal.model.Employee;;
/*
 * 进入人事管理界面
 */
@Controller
public class PmanagerController {
	@Autowired
	private PersonnalService pservice;
	
	
	//跳到pmanager界面
	@RequestMapping("/personnal/pmanager")
	public String goPmanager(){
		return "personnal/manager";
	}
	
	//查询所有Employee
	@RequestMapping("/personnal/manager/findAll")
	@ResponseBody
	public Datagrid queryAllPerson(int rows,int page){
		int fromIndex = rows * (page - 1);
		int toIndex = rows * page;
		Datagrid dg = new Datagrid();
		dg.setRows(pservice.queryAll(fromIndex, toIndex));
		dg.setTotal(pservice.findCounter());
		return dg;
		
	}
	
	//按条件查询Employee
	@RequestMapping("/personnal/manager/findCatialAccount")
	@ResponseBody
	public List<Employee> queryPerson(@RequestParam int con,@RequestParam(value="text",required=false,defaultValue="")String text){
		List<Employee> list = new ArrayList<Employee>();
		try {
			text =  URLDecoder.decode(text,"utf-8");
			list = pservice.query(con,text);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return list;	
	}
	
	//新增Employee
	@RequestMapping(value="/personnal/manager/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertEmployee(Employee employee){
		pservice.save(employee,0);
	}
	
	//修改Employee
	@RequestMapping(value="/personnal/manager/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifyEmployee(Employee employee){
		pservice.save(employee,1);
	}
 
	//删除Employee
	@RequestMapping(value="/personnal/manager/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeEmployee(int eno){
		pservice.omit(eno);
	}
	
	
}
