package org.dengying.login.dao;

import org.dengying.login.model.Actors;

public interface LoginMapper {
	
	//查看密码跟用户是否正确
	public int isValid(Actors actors);
	//查看权限是否正确
	public int isExisted(Actors actors);
	//查找id
	public int queryId(Actors actors);
}
