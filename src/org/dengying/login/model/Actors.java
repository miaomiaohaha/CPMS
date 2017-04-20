package org.dengying.login.model;

public class Actors {
	private int limited;
	private String limitedStr;
	private int userid;
	private String username;
	private String password;
	
	public int getLimited() {
		return limited;
	}
	public void setLimited(int limited) {
		this.limited = limited;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLimitedStr() {
		return limitedStr;
	}
	public void setLimitedStr(String limitedStr) {
		this.limitedStr = limitedStr;
	}
	public Actors() {
		super();
	}
	@Override
	public String toString() {
		return "Actors [limited=" + limited + ", limitedStr=" + limitedStr
				+ ", userid=" + userid + ", username=" + username
				+ ", password=" + password + "]";
	}
		
}
