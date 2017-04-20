package org.dengying.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
 
import org.dengying.login.model.Actors;
import org.dengying.personnal.model.Datagrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.dengying.user.service.UserService;
/*
 * �����û��������
 */
@Controller
public class UmanagerController {
	@Autowired
	private UserService uservice;
	
	
	//����umanager����
	@RequestMapping("/user/umanager")
	public String goUmanager(HttpSession session){
		Actors ac =(Actors) session.getAttribute("actors");
		if(ac.getLimited() == 0){
			return "user/manager";
		}else{
			return "redirect:/main";
		}
		
	}
	@RequestMapping("/user/ulimit")
	public String goLimit(HttpSession session){
		Actors ac =(Actors) session.getAttribute("actors");
		if(ac.getLimited() == 0){
			return "user/limit";
		}
		else{
			return "redirect:/main";
		}
	}
	@RequestMapping("/user/ucifer")
	public String goCifer(){
			return "user/cifer";
	}
	
	//��ѯ���в���Ա
	@RequestMapping("/user/manager/find")
	@ResponseBody
	public Datagrid queryAll(int rows,int page,HttpSession session){
		int fromIndex = rows * (page - 1);
		int toIndex = rows * page;
		Datagrid dg = new Datagrid();
		Actors ac = (Actors) session.getAttribute("actors");
		if(ac.getLimited() ==0){
			dg.setRows(uservice.queryAll(fromIndex, toIndex));
			dg.setTotal(uservice.findCounter());
		}else{
			List<Actors> lac = uservice.queryById(ac.getUserid());
			for(Actors acc:lac){
				if(acc.getLimited() == 0){
					acc.setLimitedStr("����Ա");
				}
				if(acc.getLimited()==1){
					acc.setLimitedStr("��ͨ");
				}
			}
			dg.setRows(lac);
			dg.setTotal(1);
		}
		return dg;
	}
	//����
	@RequestMapping(value="/user/manager/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertUser(Actors ac){
		uservice.save(ac,0);
	}
	
	//�޸�
	@RequestMapping(value="/user/manager/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifyUser(Actors ac){
		uservice.save(ac,1);
	}

	//ɾ��
	@RequestMapping("user/manager/remove")
	public void omit(int userid) {
		uservice.remove(userid);
	}
	
	@RequestMapping("News/limitedStr")
	@ResponseBody
    public String ReturnIsShowData()  
    {  
        String strJson = "[{\"id\":\"����Ա\",\"text\":\"����Ա\"},{\"id\":\"��ͨ\",\"text\":\"��ͨ\"}]";
        return strJson;
         
    }  

}
