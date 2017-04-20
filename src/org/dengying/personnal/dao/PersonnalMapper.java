package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Employee;

public interface PersonnalMapper {
	//查找全部Employee
	public int queryCounter();
	public List<Employee> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	//按条件查询Employee
	//1.按部门
	public List<Employee> findEPName(String text);
	//2.按编号
	public List<Employee> findENo(int text);
	//3.按职位
	public List<Employee> findEJob(String text);
	//4.按姓名
	public List<Employee> findEName(String text);
	
	
	//增加Employee
	public void append(Employee employee);
	
	//修改Employee
	public void replace(Employee employee);
	
	//删除Employee
	public void remove(int eno);
	
}
