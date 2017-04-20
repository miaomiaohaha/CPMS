package org.dengying.personnal.service;

import java.util.List;


import org.dengying.personnal.dao.PersonnalMapper;
import org.dengying.personnal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonnalService {
	@Autowired
	public PersonnalMapper personnalmapper;
	
	//查找全部的员工
	public int findCounter() {
		return personnalmapper.queryCounter();
	}
	
	public List<Employee> queryAll(int fromIndex, int toIndex){
		return personnalmapper.findAll(fromIndex,toIndex);
	}
	//按条件查询
	//部门1编号2职位3姓名4
	public List<Employee> query(int con, String text) {
		int te = 0;
		if(con == 1){
			return personnalmapper.findEPName(text);
		}else if(con == 2){
			te = Integer.parseInt(text);
			return personnalmapper.findENo(te);
		}else if(con == 3){
			return personnalmapper.findEJob(text);
		}else if(con == 4){
			return personnalmapper.findEName(text);
		}else{
			return null;
		}
		
	}
	
	//保存修改记录
	public void save(Employee employee, int i) {
		//i==0代表 add
		//i==1代表 modify
		if(i==0){
			personnalmapper.append(employee);
		}else{
			personnalmapper.replace(employee);
		}
		
		
	}

	//删除记录
	public void omit(int eno) {
		personnalmapper.remove(eno);
	}
	
}
