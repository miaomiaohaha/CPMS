package org.dengying.sys.dao;

import java.util.List;
import org.dengying.sys.model.Department;


public interface SysMapper {

	public List<Department> findById(String id);

	public List<Department> findByPid(String pid);
}
