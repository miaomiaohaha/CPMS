package org.dengying.login.service;

import org.dengying.login.dao.LoginMapper;
import org.dengying.login.model.Actors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;
	//�����Ƿ���ڸ��û�
	public int queryActor(Actors actors) {
		  return  loginMapper.isValid(actors);
	}
	//����Ȩ���Ƿ�����
	public int isExisted(Actors actors) {
		// TODO Auto-generated method stub
		return loginMapper.isExisted(actors);
	}
	//����id
	public int queryId(Actors actors) {
		return loginMapper.queryId(actors);
	}

}
