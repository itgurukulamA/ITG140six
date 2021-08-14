package com.example.demo.jdbc;

public class Joindata {
	String name;
	String cname1;
	String cretaedby;
	String status;
	String tname;
	int tid;
	String resourcename;
	public Joindata(String name ,String cname1,String createdby,String status,String tname,int tid,String resourcename) {
		this.name=name;
		this.cname1=cname1;
		this.cretaedby=createdby;
		this.status=status;
		this.tname=tname;
		this.tid=tid;
		this.resourcename=resourcename;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname1() {
		return cname1;
	}
	public void setCname1(String cname1) {
		this.cname1 = cname1;
	}
	public String getCretaedby() {
		return cretaedby;
	}
	public void setCretaedby(String cretaedby) {
		this.cretaedby = cretaedby;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	

}
