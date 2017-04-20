package org.dengying.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.login.model.Actors;

public interface UserMapper {
	//查找所有操作员
	public List<Actors> query(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	//查询总条数
	public int queryCounter();
	//增加数据
	public void append(Actors ac);
	//修改数据
	public void replace(Actors ac);
	//删除数据
	public void delete(int userid);
	//查询一条数据
	public List<Actors> queryOne(int userid);
}
