package com.po;

public class Daiyu {
	
	







	private String id ;
	private String operator ;
	private String detail ;
	private String date;
	private String code ;
	private String ps ;
	private String danghao;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getDanghao() {
		return danghao;
	}
	public void setDanghao(String danghao) {
		this.danghao = danghao;
	}
	
	
	public Daiyu(){
		
	}
	
	
		
	public Daiyu(String id, String operator, String detail, String date,
			String code, String ps, String danghao) {
		super();
		this.id = id;
		this.operator = operator;
		this.detail = detail;
		this.date = date;
		this.code = code;
		this.ps = ps;
		this.danghao = danghao;
	}
	
	
	
	
	

}
