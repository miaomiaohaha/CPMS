package org.dengying.personnal.service;

import java.util.List;


import org.dengying.personnal.dao.ExamMapper;
import org.dengying.personnal.model.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExamService {
	@Autowired
	public ExamMapper emapper;
	
	//查找全部的培训记录
	public int findCounter() {
		return emapper.queryCounter();
	}
	
	public List<Exam> queryAll(int fromIndex, int toIndex){
		return emapper.findAll(fromIndex,toIndex);
	}

	
	//保存修改记录
	public void save(Exam exam, int i) {
		//i==0代表 add
		//i==1代表 modify
		if(i==0){
			emapper.append(exam);
		}else{
			emapper.replace(exam);
		}
		
		
	}

	//删除记录
	public void omit(int examno) {
		emapper.remove(examno);
	}
	
}
