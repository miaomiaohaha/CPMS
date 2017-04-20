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
	
	//查找所有操作员
	public List<Actors> queryAll(int fromIndex, int toIndex) {
		List<Actors> lac = userMapper.query(fromIndex,toIndex);
		for(Actors ac:lac){
			if(ac.getLimited() == 0){
				ac.setLimitedStr("管理员");
			}
			if(ac.getLimited()==1){
				ac.setLimitedStr("普通");
			}
		} 
		return lac;
	}
	
	//查询总条数
	public int findCounter() {
		return userMapper.queryCounter();
	}
	
	//修改数据
	public void save(Actors ac, int i) {
		//i==0代表 add
		//i==1代表 modify
		if(ac.getLimitedStr().equals("管理员")){
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
	//删除数据
	public void remove(int userid) {
		userMapper.delete(userid);
		
	}
	//查询一条数据
	public List<Actors> queryById(int userid) {
		return userMapper.queryOne(userid);
	}
	

}
