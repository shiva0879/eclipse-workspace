package com.shiva.collection;

import java.util.List;
import java.util.Set;

public class Collection {
	List<Book> book;
	Set<Custm> custm;
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public Set<Custm> getCustm() {
		return custm;
	}
	public void setCustm(Set<Custm> custm) {
		this.custm = custm;
	}

}
