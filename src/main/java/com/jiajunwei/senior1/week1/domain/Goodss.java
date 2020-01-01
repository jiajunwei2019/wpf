package com.jiajunwei.senior1.week1.domain;

public class Goodss {

	private int id;
	private String name;
	private String ename;
	private int bid;
	private int lid;
	private String chi;
	private String dj;
	private String sj;
	private String bq;
	private String dfilev;
	private String bname;
	private String jname;
	@Override
	public String toString() {
		return "Goodss [id=" + id + ", name=" + name + ", ename=" + ename + ", bid=" + bid + ", lid=" + lid + ", chi="
				+ chi + ", dj=" + dj + ", sj=" + sj + ", bq=" + bq + ", dfilev=" + dfilev + ", bname=" + bname
				+ ", jname=" + jname + "]";
	}
	public Goodss(int id, String name, String ename, int bid, int lid, String chi, String dj, String sj, String bq,
			String dfilev, String bname, String jname) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.bid = bid;
		this.lid = lid;
		this.chi = chi;
		this.dj = dj;
		this.sj = sj;
		this.bq = bq;
		this.dfilev = dfilev;
		this.bname = bname;
		this.jname = jname;
	}
	public Goodss() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getChi() {
		return chi;
	}
	public void setChi(String chi) {
		this.chi = chi;
	}
	public String getDj() {
		return dj;
	}
	public void setDj(String dj) {
		this.dj = dj;
	}
	public String getSj() {
		return sj;
	}
	public void setSj(String sj) {
		this.sj = sj;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getDfilev() {
		return dfilev;
	}
	public void setDfilev(String dfilev) {
		this.dfilev = dfilev;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	
}
