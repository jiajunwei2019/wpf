package com.jiajunwei.senior1.week1.domain;

public class Goodskind {

	private int jid;
	private String jname;
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	@Override
	public String toString() {
		return "Goodskind [jid=" + jid + ", jname=" + jname + "]";
	}
	public Goodskind(int jid, String jname) {
		super();
		this.jid = jid;
		this.jname = jname;
	}
	public Goodskind() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
