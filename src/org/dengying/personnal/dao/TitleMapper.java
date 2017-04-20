package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Title;

public interface TitleMapper {
	//����ȫ��
	public int queryCounter();
	public List<Title> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//����title
	public void append(Title title);
	
	//�޸�title
	public void replace(Title title);
	
	//ɾ��title
	public void remove(int Titleno);
	
}
