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
 * ������Ա��ѵ�������
 */
@Controller
public class PtrainController {
	@Autowired
	private TrainService tservice;
	
	
	//����ְ�������������
	@RequestMapping("/personnal/ptrain")
	public String goPtrain(){
		return "personnal/train";
	}
	
	//��ѯ������ѵ��¼
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
	
	//������¼
	@RequestMapping(value="/personnal/train/add",method=RequestMethod.POST)
	@ResponseBody
	public void insertrain(Train train){
		tservice.save(train,0);
	}
	
	//�޸���ѵ��¼
	@RequestMapping(value="/personnal/train/modify",method=RequestMethod.POST)
	@ResponseBody
	public void modifytrain(Train train){
		tservice.save(train,1);
	}
 
	//ɾ����ѵ��¼
	@RequestMapping(value="/personnal/train/remove",method=RequestMethod.POST)
	@ResponseBody
	public void removetrain(int traino){
		tservice.omit(traino);
	}
	
}
