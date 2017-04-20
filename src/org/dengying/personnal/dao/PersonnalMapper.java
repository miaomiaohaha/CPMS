package org.dengying.personnal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dengying.personnal.model.Employee;

public interface PersonnalMapper {
	//����ȫ��Employee
	public int queryCounter();
	public List<Employee> findAll(@Param("fromIndex")int fromIndex, @Param("toIndex") int toIndex);
	//��������ѯEmployee
	//1.������
	public List<Employee> findEPName(String text);
	//2.�����
	public List<Employee> findENo(int text);
	//3.��ְλ
	public List<Employee> findEJob(String text);
	//4.������
	public List<Employee> findEName(String text);
	
	
	//����Employee
	public void append(Employee employee);
	
	//�޸�Employee
	public void replace(Employee employee);
	
	//ɾ��Employee
	public void remove(int eno);
	
}
