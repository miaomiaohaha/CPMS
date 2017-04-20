package org.dengying.index.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 进入主界面
 * */
@Controller
public class IndexController {
	@RequestMapping("/top")
	public String goTop(){
		return "login/top";
	}
	@RequestMapping("/manu")
	public String goManu(){
		return "login/manu";
	}
	@RequestMapping("/main")
	public String goView(){
		return "login/view";
	}
	@RequestMapping("/foot")
	public String goFoot(){
		return "login/foot";
	}
	@RequestMapping("/personnalindex")
	public String goPersonnalIndex(){
		return "personnal/pindex";
	}
	@RequestMapping("/salaryindex")
	public String goSalaryIndex(){
		return "salary/sindex";
	}
	@RequestMapping("/sysindex")
	public String goSysIndex(){
		return "sys/sysindex";
	}
	@RequestMapping("/userindex")
	public String goUserIndex(){
		return "user/uindex";
	}
	
}
