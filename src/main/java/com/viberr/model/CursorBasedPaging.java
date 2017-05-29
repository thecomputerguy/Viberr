package com.viberr.model;

import java.util.List;

public class CursorBasedPaging {

	private String href;
	private List<Object> items;
	private Integer limit;
	private String next;
	private Cursor cursors;
	private Integer total;
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<Object> getItems() {
		return items;
	}
	public void setItems(List<Object> items) {
		this.items = items;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public Cursor getCursors() {
		return cursors;
	}
	public void setCursors(Cursor cursors) {
		this.cursors = cursors;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
