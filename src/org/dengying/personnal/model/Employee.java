package org.dengying.personnal.model;


public class Employee {
	private int eno;
	private String ename;
	private String epname;
	private String esex;
	private String ebirth;
	private String nation;
	private String registed;
	private String maritalStatus;
	private String education;
	private String id;
	private String ejob;
	private String phone;
	private String mobile;
	private String email;
	private String address;
	private String graduateDate;
	private String graduateSchool;
	private String major;
	private String positionalTitle;
	private String jobDateFrom;
	private String contraceDateFrom;
	private String contraceDateTo;
	private String cardnum;
	private String publicFundnum;
	private int isvaild = 1;
	private String nativePlace; 
	private String politicsStates;
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
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public String getEbirth() {
		return ebirth;
	}
	public void setEbirth(String ebirth) {
		this.ebirth = ebirth;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getRegisted() {
		return registed;
	}
	public void setRegisted(String registed) {
		this.registed = registed;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEjob() {
		return ejob;
	}
	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGraduateDate() {
		return graduateDate;
	}
	public void setGraduateDate(String graduateDate) {
		this.graduateDate = graduateDate;
	}
	public String getGraduateSchool() {
		return graduateSchool;
	}
	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPositionalTitle() {
		return positionalTitle;
	}
	public void setPositionalTitle(String positionalTitle) {
		this.positionalTitle = positionalTitle;
	}
	public String getJobDateFrom() {
		return jobDateFrom;
	}
	public void setJobDateFrom(String jobDateFrom) {
		this.jobDateFrom = jobDateFrom;
	}
	public String getContraceDateFrom() {
		return contraceDateFrom;
	}
	public void setContraceDateFrom(String contraceDateFrom) {
		this.contraceDateFrom = contraceDateFrom;
	}
	public String getContraceDateTo() {
		return contraceDateTo;
	}
	public void setContraceDateTo(String contraceDateTo) {
		this.contraceDateTo = contraceDateTo;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getPublicFundnum() {
		return publicFundnum;
	}
	public void setPublicFundnum(String publicFundnum) {
		this.publicFundnum = publicFundnum;
	}
	public int getIsvaild() {
		return isvaild;
	}
	public void setIsvaild(int isvaild) {
		this.isvaild = isvaild;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getPoliticsStates() {
		return politicsStates;
	}
	public void setPoliticsStates(String politicsStates) {
		this.politicsStates = politicsStates;
	}
	public Employee(int eno, String ename, String epname, String esex,
			String ebirth, String nation, String registed,
			String maritalStatus, String education, String id, String ejob,
			String phone, String mobile, String email, String address,
			String graduateDate, String graduateSchool, String major,
			String positionalTitle, String jobDateFrom,
			String contraceDateFrom, String contraceDateTo, String cardnum,
			String publicFundnum, int isvaild, String nativePlace,
			String politicsStates) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.epname = epname;
		this.esex = esex;
		this.ebirth = ebirth;
		this.nation = nation;
		this.registed = registed;
		this.maritalStatus = maritalStatus;
		this.education = education;
		this.id = id;
		this.ejob = ejob;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.graduateDate = graduateDate;
		this.graduateSchool = graduateSchool;
		this.major = major;
		this.positionalTitle = positionalTitle;
		this.jobDateFrom = jobDateFrom;
		this.contraceDateFrom = contraceDateFrom;
		this.contraceDateTo = contraceDateTo;
		this.cardnum = cardnum;
		this.publicFundnum = publicFundnum;
		this.isvaild = isvaild;
		this.nativePlace = nativePlace;
		this.politicsStates = politicsStates;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", epname="
				+ epname + ", esex=" + esex + ", ebirth=" + ebirth
				+ ", nation=" + nation + ", registed=" + registed
				+ ", maritalStatus=" + maritalStatus + ", education="
				+ education + ", id=" + id + ", ejob=" + ejob + ", phone="
				+ phone + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + ", graduateDate=" + graduateDate
				+ ", graduateSchool=" + graduateSchool + ", major=" + major
				+ ", positionalTitle=" + positionalTitle + ", jobDateFrom="
				+ jobDateFrom + ", contraceDateFrom=" + contraceDateFrom
				+ ", contraceDateTo=" + contraceDateTo + ", cardnum=" + cardnum
				+ ", publicFundnum=" + publicFundnum + ", isvaild=" + isvaild
				+ ", nativePlace=" + nativePlace + ", politicsStates="
				+ politicsStates + "]";
	}
	
}
