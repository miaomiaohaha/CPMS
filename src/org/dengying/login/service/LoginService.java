package org.dengying.login.service;

import org.dengying.login.dao.LoginMapper;
import org.dengying.login.model.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;
	//查找是否存在该用户
	public int queryActor(Actors actors) {
		  return  loginMapper.isValid(actors);
	}
	//查找权限是否满足
	public int isExisted(Actors actors) {
		// TODO Auto-generated method stub
		return loginMapper.isExisted(actors);
	}
	//查找id
	public int queryId(Actors actors) {
		return loginMapper.queryId(actors);
	}

}
