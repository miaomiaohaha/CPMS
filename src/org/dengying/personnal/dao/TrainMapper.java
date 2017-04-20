package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Train;

public interface TrainMapper {
	//����ȫ��
	public int queryCounter();
	public List<Train> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//����train
	public void append(Train train);
	
	//�޸�train
	public void replace(Train train);
	
	//ɾ��train
	public void remove(int traino);
	
}
