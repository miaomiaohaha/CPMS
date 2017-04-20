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
	
	//����ȫ������ѵ��¼
	public int findCounter() {
		return tmapper.queryCounter();
	}
	
	public List<Train> queryAll(int fromIndex, int toIndex){
		return tmapper.findAll(fromIndex,toIndex);
	}

	
	//�����޸ļ�¼
	public void save(Train train, int i) {
		//i==0���� add
		//i==1���� modify
		if(i==0){
			tmapper.append(train);
		}else{
			tmapper.replace(train);
		}
		
		
	}

	//ɾ����¼
	public void omit(int examno) {
		tmapper.remove(examno);
	}
	
}
