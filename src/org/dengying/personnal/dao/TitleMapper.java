package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Title;

public interface TitleMapper {
	//查找全部
	public int queryCounter();
	public List<Title> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//增加title
	public void append(Title title);
	
	//修改title
	public void replace(Title title);
	
	//删除title
	public void remove(int Titleno);
	
}
