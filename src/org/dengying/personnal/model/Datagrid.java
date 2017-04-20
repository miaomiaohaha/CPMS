package org.dengying.personnal.model;

import java.util.List;

public class Datagrid {
	private int total;
	private List rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List list) {
		this.rows = list;
	}
	public Datagrid() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Datagrid(int total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
}
