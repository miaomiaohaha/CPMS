package org.dengying.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.dengying.sys.dao.SysMapper;
import org.dengying.sys.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysService {
	@Autowired
	public SysMapper sysmapper;

	public List<Department> findById(String id) {
		return sysmapper.findById(id);
	}

	public List<Department> findByPid(String pid) {
		return sysmapper.findByPid(pid);
	}
}
