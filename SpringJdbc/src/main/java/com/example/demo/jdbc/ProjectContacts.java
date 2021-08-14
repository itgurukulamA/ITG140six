package com.example.demo.jdbc;


public class ProjectContacts {
	int pid;
	int tid;
	String tname;
	String createdby;
	String sdate;
	String edate;
	String resourcename;
	public ProjectContacts() {}
	public ProjectContacts(int pid,int tid,String tname,String createdby,String sdate,String edate,String resourcename) {
		this.pid=pid;
		this.tid=tid;
		this.tname=tname;
		this.createdby=createdby;
		this.sdate=sdate;
		this.edate=edate;
		this.resourcename=resourcename;
	}
	public ProjectContacts(String tname) {
		this.tname=tname;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	
	
}
