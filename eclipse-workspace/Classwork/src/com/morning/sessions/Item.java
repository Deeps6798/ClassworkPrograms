package com.morning.sessions;



public class Item {
	
	int iid;
	String iname;
	String idoe;
	int cnt;
	
	Item()
	{
		
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIdoe() {
		return idoe;
	}

	public void setIdoe(String idoe) {
		this.idoe = idoe;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", idoe=" + idoe + ", cnt=" + cnt + "]";
	}

}
