package com.po;

public class Dyhdl {
	private String id ;
	
	//主键 标识每一个入库的人员
	private int onlyid;
	
	
	
	public int getOnlyid() {
		return onlyid;
	}
	public void setOnlyid(int onlyid) {
		this.onlyid = onlyid;
	}
	//东至居保中心
	private String dept ;
	private String detail ;
	private String zhenglidate;
	private String code ;
	private String ps ;
	private String dangantype;
	
	
	private String townid ;
	private String niandu ;
	public String getNiandu() {
		return niandu;
	}
	public void setNiandu(String niandu) {
		this.niandu = niandu;
	}
	private String danghao ;
	private String operator;
	private String beiyong1 ;
	private String beiyong2 ;
	private String beiyong3;
	private String beiyong4;
	private String beiyong5;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getZhenglidate() {
		return zhenglidate;
	}
	public void setZhenglidate(String zhenglidate) {
		this.zhenglidate = zhenglidate;
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
	public String getDangantype() {
		return dangantype;
	}
	public void setDangantype(String dangantype) {
		this.dangantype = dangantype;
	}
	public String getTownid() {
		return townid;
	}
	public void setTownid(String townid) {
		this.townid = townid;
	}
	public String getDanghao() {
		return danghao;
	}
	public void setDanghao(String danghao) {
		this.danghao = danghao;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getBeiyong1() {
		return beiyong1;
	}
	public void setBeiyong1(String beiyong1) {
		this.beiyong1 = beiyong1;
	}
	public String getBeiyong2() {
		return beiyong2;
	}
	public void setBeiyong2(String beiyong2) {
		this.beiyong2 = beiyong2;
	}
	public String getBeiyong3() {
		return beiyong3;
	}
	public void setBeiyong3(String beiyong3) {
		this.beiyong3 = beiyong3;
	}
	public String getBeiyong4() {
		return beiyong4;
	}
	public void setBeiyong4(String beiyong4) {
		this.beiyong4 = beiyong4;
	}
	public String getBeiyong5() {
		return beiyong5;
	}
	public void setBeiyong5(String beiyong5) {
		this.beiyong5 = beiyong5;
	}
	public Dyhdl(String id, String dept, String detail, String zhenglidate,
			String code, String ps, String dangantype, String townid,
			String niandu, String danghao, String operator, String beiyong1,
			String beiyong2, String beiyong3, String beiyong4, String beiyong5,int onlyid) {
		super();
		this.id = id;
		this.dept = dept;
		this.detail = detail;
		this.zhenglidate = zhenglidate;
		this.code = code;
		this.ps = ps;
		this.dangantype = dangantype;
		this.townid = townid;
		this.niandu = niandu;
		this.danghao = danghao;
		this.operator = operator;
		this.beiyong1 = beiyong1;
		this.beiyong2 = beiyong2;
		this.beiyong3 = beiyong3;
		this.beiyong4 = beiyong4;
		this.beiyong5 = beiyong5;
		this.onlyid=onlyid;
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
