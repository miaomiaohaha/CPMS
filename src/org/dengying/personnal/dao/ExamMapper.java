package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Exam;

public interface ExamMapper {
	//查找全部
	public int queryCounter();
	public List<Exam> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	
	
	//增加exam
	public void append(Exam exam);
	
	//修改exam
	public void replace(Exam exam);
	
	//删除exam
	public void remove(int examno);
	
}
