package org.dengying.personnal.model;


public class Exam {
	private int examno;
	private int eno;
	private String ename;
	private String epname;
	private String examdatefrom;
	private String examdateto;
	private String examname;
	private String examresult;
	private String examlevel;
	private int examscore;
	private String remark;
	public int getExamno() {
		return examno;
	}
	public void setExamno(int examno) {
		this.examno = examno;
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
	public String getExamdatefrom() {
		return examdatefrom;
	}
	public void setExamdatefrom(String examdatefrom) {
		this.examdatefrom = examdatefrom;
	}
	public String getExamdateto() {
		return examdateto;
	}
	public void setExamdateto(String examdateto) {
		this.examdateto = examdateto;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getExamresult() {
		return examresult;
	}
	public void setExamresult(String examresult) {
		this.examresult = examresult;
	}
	public String getExamlevel() {
		return examlevel;
	}
	public void setExamlevel(String examlevel) {
		this.examlevel = examlevel;
	}
	public int getExamscore() {
		return examscore;
	}
	public void setExamscore(int examscore) {
		this.examscore = examscore;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int examno, int eno, String ename, String epname,
			String examdatefrom, String examdateto, String examname,
			String examresult, String examlevel, int examscore, String remark) {
		super();
		this.examno = examno;
		this.eno = eno;
		this.ename = ename;
		this.epname = epname;
		this.examdatefrom = examdatefrom;
		this.examdateto = examdateto;
		this.examname = examname;
		this.examresult = examresult;
		this.examlevel = examlevel;
		this.examscore = examscore;
		this.remark = remark;
	}

	
}
