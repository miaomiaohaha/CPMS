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
	
	//查找全部的职称评定记录
	public int findCounter() {
		return ttmapper.queryCounter();
	}
	
	public List<Title> queryAll(int fromIndex, int toIndex){
		return ttmapper.findAll(fromIndex,toIndex);
	}

	
	//保存修改记录
	public void save(Title title, int i) {
		//i==0代表 add
		//i==1代表 modify
		if(i==0){
			ttmapper.append(title);
		}else{
			ttmapper.replace(title);
		}
		
		
	}

	//删除记录
	public void omit(int titleno) {
		ttmapper.remove(titleno);
	}
	
}
