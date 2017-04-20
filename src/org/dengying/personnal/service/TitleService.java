package org.dengying.personnal.service;

import java.util.List;


import org.dengying.personnal.dao.TitleMapper;
import org.dengying.personnal.model.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TitleService {
	@Autowired
	public TitleMapper ttmapper;
	
	//����ȫ����ְ��������¼
	public int findCounter() {
		return ttmapper.queryCounter();
	}
	
	public List<Title> queryAll(int fromIndex, int toIndex){
		return ttmapper.findAll(fromIndex,toIndex);
	}

	
	//�����޸ļ�¼
	public void save(Title title, int i) {
		//i==0���� add
		//i==1���� modify
		if(i==0){
			ttmapper.append(title);
		}else{
			ttmapper.replace(title);
		}
		
		
	}

	//ɾ����¼
	public void omit(int titleno) {
		ttmapper.remove(titleno);
	}
	
}
