package org.dengying.personnal.model;

public class Title {
	private int titleno;
	private int eno;
	private String ename;
	private String epname;
	private String titledate;
	private String titlename;
	private String titleway;
	public int getTitleno() {
		return titleno;
	}
	public void setTitleno(int titleno) {
		this.titleno = titleno;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpname() {
		return epname;
	}
	public void setEpname(String epname) {
		this.epname = epname;
	}
	public String getTitledate() {
		return titledate;
	}
	public void setTitledate(String titledate) {
		this.titledate = titledate;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public String getTitleway() {
		return titleway;
	}
	public void setTitleway(String titleway) {
		this.titleway = titleway;
	}
	public Title() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Title(int titleno, int eno, String ename, String epname,
			String titledate, String titlename, String titleway) {
		super();
		this.titleno = titleno;
		this.eno = eno;
		this.ename = ename;
		this.epname = epname;
		this.titledate = titledate;
		this.titlename = titlename;
		this.titleway = titleway;
	}
	@Override
	public String toString() {
		return "Title [titleno=" + titleno + ", eno=" + eno + ", ename="
				+ ename + ", epname=" + epname + ", titledate=" + titledate
				+ ", titlename=" + titlename + ", titleway=" + titleway
				+ ", getTitleno()=" + getTitleno() + ", getEno()=" + getEno()
				+ ", getEname()=" + getEname() + ", getEpname()=" + getEpname()
				+ ", getTitledate()=" + getTitledate() + ", getTitlename()="
				+ getTitlename() + ", getTitleway()=" + getTitleway()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
}
