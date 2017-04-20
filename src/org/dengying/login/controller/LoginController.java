package org.dengying.login.controller;

import javax.servlet.http.HttpSession;

import org.dengying.login.model.Actors;
import org.dengying.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 进入登录界面
 * */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String goLogin(){
		return "login/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String show(Model model,Actors actors,HttpSession session){
		int v = loginService.queryActor(actors);
		if (v > 0) {
			int e = loginService.isExisted(actors);
			if(e > 0){
				actors.setUserid(loginService.queryId(actors));
				session.setAttribute("actors",actors);
				return "login/index";
			}else{
				return "login/error_2";
			}
		}else{
			return "login/error_1";
		}
	}
	
}
