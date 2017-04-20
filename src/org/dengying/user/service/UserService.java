package org.dengying.user.service;

import java.util.List;

import org.dengying.login.model.Actors;
import org.dengying.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	//�������в���Ա
	public List<Actors> queryAll(int fromIndex, int toIndex) {
		List<Actors> lac = userMapper.query(fromIndex,toIndex);
		for(Actors ac:lac){
			if(ac.getLimited() == 0){
				ac.setLimitedStr("����Ա");
			}
			if(ac.getLimited()==1){
				ac.setLimitedStr("��ͨ");
			}
		} 
		return lac;
	}
	
	//��ѯ������
	public int findCounter() {
		return userMapper.queryCounter();
	}
	
	//�޸�����
	public void save(Actors ac, int i) {
		//i==0���� add
		//i==1���� modify
		if(ac.getLimitedStr().equals("����Ա")){
			ac.setLimited(0);
		}else{
			ac.setLimited(1);
		}
		
		if(i==0){
			userMapper.append(ac);
		}else{
			userMapper.replace(ac);
		}
	}
	//ɾ������
	public void remove(int userid) {
		userMapper.delete(userid);
		
	}
	//��ѯһ������
	public List<Actors> queryById(int userid) {
		return userMapper.queryOne(userid);
	}
	

}
