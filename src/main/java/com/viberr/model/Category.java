package com.viberr.model;

import java.util.List;

public class Category {

	private String href;
	private List<Image> icon;
	private String id;
	private String name;
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<Image> getIcon() {
		return icon;
	}
	public void setIcon(List<Image> icon) {
		this.icon = icon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
