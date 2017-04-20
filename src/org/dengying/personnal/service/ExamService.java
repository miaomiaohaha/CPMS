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
	
	//����ȫ������ѵ��¼
	public int findCounter() {
		return emapper.queryCounter();
	}
	
	public List<Exam> queryAll(int fromIndex, int toIndex){
		return emapper.findAll(fromIndex,toIndex);
	}

	
	//�����޸ļ�¼
	public void save(Exam exam, int i) {
		//i==0���� add
		//i==1���� modify
		if(i==0){
			emapper.append(exam);
		}else{
			emapper.replace(exam);
		}
		
		
	}

	//ɾ����¼
	public void omit(int examno) {
		emapper.remove(examno);
	}
	
}
