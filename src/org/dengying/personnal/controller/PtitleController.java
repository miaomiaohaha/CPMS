package org.dengying.personnal.controller;

import org.dengying.personnal.model.Datagrid;
import org.dengying.personnal.model.Title;
import org.dengying.personnal.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * ����ְ�������������
 */
@Controller
public class PtitleController {
	@Autowired
	private TitleService ttservice;
	
	
	//����ְ�������������
	@RequestMapping("/personnal/ptitle")
	public String goPtitle(){
		return "personnal/title";
	}
	
	//��ѯ������ѵ��¼
	@RequestMapping("/personnal/title/findtitle")
	@ResponseBody
	public Datagrid queryAlltitle(int rows,int page){
		int fromIndex = rows * (page - 1);
		int toIndex = rows * page;
		Datagrid dg = new Datagrid();
		dg.setRows(ttservice.queryAll(fromIndex, toIndex));
		dg.setTotal(ttservice.findCounter());
		return dg;
		
	}
	
	//������¼
	@RequestMapping(value="/personnal/title/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertitle(Title title){
		ttservice.save(title,0);
	}
	
	//�޸���ѵ��¼
	@RequestMapping(value="/personnal/title/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifytitle(Title title){
		ttservice.save(title,1);
	}
 
	//ɾ����ѵ��¼
	@RequestMapping(value="/personnal/title/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removetitle(int titleno){
		ttservice.omit(titleno);
	}
	
}
