package com.example.demo.jdbc;

public class Projects {
	private int  id;
	private String name;
	private String cname;
	private String  mname;
	private String startdate;
	private String enddate;
	private String status;
	public Projects(int id,String name,String cname,String mname,String startdate,String enddate,String status) {
		this.id=id;
		this.name=name;
		this.cname=cname;
		this.mname=mname;
		this.startdate=startdate;
		this.enddate=enddate;
		this.status=status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
