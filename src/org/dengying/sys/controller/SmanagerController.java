package org.dengying.sys.controller;

import java.util.List;

import net.sf.json.JSONArray;

import org.dengying.sys.model.Department;
import org.dengying.sys.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * 进入系统管理界面
 */
@Controller
public class SmanagerController {
	@Autowired
	private SysService sservice;
	
	
	//跳到smanager界面
	@RequestMapping("/sys/smanager")
	public String gosmanager(){
		return "sys/manager";
	}
	
    /** 
     * 获取部门树形列表 
     */  
    @RequestMapping(value = "/smanager/show", method = RequestMethod.POST)  
    @ResponseBody 
    public List<Department> getTree(){  
        List<Department> root = sservice.findById("1");  //获取根节点（获取的值存到list中）  
        JSONArray jsonArray = JSONArray.fromObject(buildTree(root));  
        System.out.println(jsonArray.toString());  
        return buildTree(root);  
    }  
    public List<Department> buildTree(List<Department> root){  
        for(int i=0;i<root.size();i++){  
            List<Department> children = sservice.findByPid(root.get(i).getId()); //查询某节点的子节点（获取的是list）  
            buildTree(children);      
            root.get(i).setChildren(children);  
        }  
        return root;  
    }  
      
	/*
	//按条件查询Employee
	@RequestMapping("/sys/manager/findCatialAccount")
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
	@RequestMapping(value="/sys/manager/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertEmployee(Employee employee){
		System.out.println(employee.toString());
		pservice.save(employee,0);
	}
	
	//修改Employee
	@RequestMapping(value="/sys/manager/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifyEmployee(Employee employee){
		System.out.println(employee.toString());
		pservice.save(employee,1);
	}
 
	//删除Employee
	@RequestMapping(value="/sys/manager/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeEmployee(int eno){
		pservice.omit(eno);
	}*/
	
	
}
