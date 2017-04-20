package org.dengying.personnal.service;

import java.util.List;

import org.dengying.personnal.dao.TrainMapper;
import org.dengying.personnal.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainService {
	@Autowired
	public TrainMapper tmapper;
	
	//查找全部的培训记录
	public int findCounter() {
		return tmapper.queryCounter();
	}
	
	public List<Train> queryAll(int fromIndex, int toIndex){
		return tmapper.findAll(fromIndex,toIndex);
	}

	
	//保存修改记录
	public void save(Train train, int i) {
		//i==0代表 add
		//i==1代表 modify
		if(i==0){
			tmapper.append(train);
		}else{
			tmapper.replace(train);
		}
		
		
	}

	//删除记录
	public void omit(int examno) {
		tmapper.remove(examno);
	}
	
}
