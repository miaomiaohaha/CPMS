package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Exam;

public interface ExamMapper {
	//����ȫ��
	public int queryCounter();
	public List<Exam> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//����exam
	public void append(Exam exam);
	
	//�޸�exam
	public void replace(Exam exam);
	
	//ɾ��exam
	public void remove(int examno);
	
}
