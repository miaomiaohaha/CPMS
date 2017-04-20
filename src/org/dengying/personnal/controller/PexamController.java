package org.dengying.personnal.controller;

import org.dengying.personnal.model.Datagrid;
import org.dengying.personnal.model.Exam;
import org.dengying.personnal.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * ������Ա�����������
 */
@Controller
public class PexamController {
	@Autowired
	private ExamService eservice;
	
	
	//������Ա�����������
	@RequestMapping("/personnal/pexam")
	public String goPexam(){
		return "personnal/exam";
	}
	
	//��ѯ���п�����¼
	@RequestMapping("/personnal/exam/findexam")
	@ResponseBody
	public Datagrid queryAllexam(int rows,int page){
		int fromIndex = rows * (page - 1);
		int toIndex = rows * page;
		Datagrid dg = new Datagrid();
		dg.setRows(eservice.queryAll(fromIndex, toIndex));
		dg.setTotal(eservice.findCounter());
		return dg;
		
	}
	
	//������¼
	@RequestMapping(value="/personnal/exam/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertexam(Exam exam){
		eservice.save(exam,0);
	}
	
	//�޸Ŀ�����¼
	@RequestMapping(value="/personnal/exam/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifyexam(Exam exam){
		eservice.save(exam,1);
	}
 
	//ɾ��������¼
	@RequestMapping(value="/personnal/exam/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removeexam(int examno){
		eservice.omit(examno);
	}
	
	
	
	
	
}
