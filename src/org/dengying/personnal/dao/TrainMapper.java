package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Train;

public interface TrainMapper {
	//查找全部
	public int queryCounter();
	public List<Train> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//增加train
	public void append(Train train);
	
	//修改train
	public void replace(Train train);
	
	//删除train
	public void remove(int traino);
	
}
