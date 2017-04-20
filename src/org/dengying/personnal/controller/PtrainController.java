package org.dengying.personnal.controller;

import org.dengying.personnal.model.Datagrid;
import org.dengying.personnal.model.Train;
import org.dengying.personnal.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 进入人员培训管理界面
 */
@Controller
public class PtrainController {
	@Autowired
	private TrainService tservice;
	
	
	//跳到职称评定管理界面
	@RequestMapping("/personnal/ptrain")
	public String goPtrain(){
		return "personnal/train";
	}
	
	//查询所有培训记录
	@RequestMapping("/personnal/train/findtrain")
	@ResponseBody
	public Datagrid queryAlltrain(int rows,int page){
		int fromIndex = rows * (page - 1);
		int toIndex = rows * page;
		Datagrid dg = new Datagrid();
		dg.setRows(tservice.queryAll(fromIndex, toIndex));
		dg.setTotal(tservice.findCounter());
		return dg;
		
	}
	
	//新增记录
	@RequestMapping(value="/personnal/train/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertrain(Train train){
		tservice.save(train,0);
	}
	
	//修改培训记录
	@RequestMapping(value="/personnal/train/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifytrain(Train train){
		tservice.save(train,1);
	}
 
	//删除培训记录
	@RequestMapping(value="/personnal/train/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removetrain(int traino){
		tservice.omit(traino);
	}
	
}
