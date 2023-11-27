package com.wissen.security.model;

public class Order {
	
	private Integer Oid;
	
	private String Oname;
	
	private Long cost;

	public Integer getOid() {
		return Oid;
	}

	public void setOid(Integer oid) {
		Oid = oid;
	}

	public String getOname() {
		return Oname;
	}

	public void setOname(String oname) {
		Oname = oname;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Order(Integer oid, String oname, Long cost) {
		super();
		Oid = oid;
		Oname = oname;
		this.cost = cost;
	}

	public Order() {
		super();
	}
	
	

}
