package com.po;

public class Chayue {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String seeDate;
	private String seeUser;
	private String seeContent;
	private String ps;
	public String getSeeDate() {
		return seeDate;
	}
	public void setSeeDate(String seeDate) {
		this.seeDate = seeDate;
	}
	public String getSeeUser() {
		return seeUser;
	}
	public void setSeeUser(String seeUser) {
		this.seeUser = seeUser;
	}
	public String getSeeContent() {
		return seeContent;
	}
	public void setSeeContent(String seeContent) {
		this.seeContent = seeContent;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public Chayue(int id,String seeDate, String seeUser, String seeContent, String ps) {
		super();
		this.id=id;
		this.seeDate = seeDate;
		this.seeUser = seeUser;
		this.seeContent = seeContent;
		this.ps = ps;
	}
	
	

}
