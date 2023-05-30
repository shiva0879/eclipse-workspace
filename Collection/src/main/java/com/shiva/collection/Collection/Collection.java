package com.shiva.collection.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	List<Integer> cid;
	Set<String>   cname;
	Map<Integer, String> ccount;
	public List<Integer> getCid() {
		return cid;
	}
	public void setCid(List<Integer> cid) {
		this.cid = cid;
	}
	public Set<String> getCname() {
		return cname;
	}
	public void setCname(Set<String> cname) {
		this.cname = cname;
	}
	public Map<Integer, String> getCcount() {
		return ccount;
	}
	public void setCcount(Map<Integer, String> ccount) {
		this.ccount = ccount;
	}

}
