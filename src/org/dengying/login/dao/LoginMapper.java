package org.dengying.login.dao;

import org.dengying.login.model.Actors;

public interface LoginMapper {
	
	//�鿴������û��Ƿ���ȷ
	public int isValid(Actors actors);
	//�鿴Ȩ���Ƿ���ȷ
	public int isExisted(Actors actors);
	//����id
	public int queryId(Actors actors);
}
