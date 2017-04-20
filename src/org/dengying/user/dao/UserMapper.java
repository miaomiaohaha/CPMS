package org.dengying.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.login.model.Actors;

public interface UserMapper {
	//�������в���Ա
	public List<Actors> query(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	//��ѯ������
	public int queryCounter();
	//��������
	public void append(Actors ac);
	//�޸�����
	public void replace(Actors ac);
	//ɾ������
	public void delete(int userid);
	//��ѯһ������
	public List<Actors> queryOne(int userid);
}
