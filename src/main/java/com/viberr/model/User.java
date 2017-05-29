package com.viberr.model;

import java.time.Instant;
import java.util.List;

public class User {

	private Instant birthDate;
	private String country;
	private String displayName;
	private String email;
	private ExternalUrl externalUrls;
	private Follower followers;
	private String href;
	private String id;
	private List<Image> images;
	private String product;
	private String type;
	private String uri;
	public Instant getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ExternalUrl getExternalUrls() {
		return externalUrls;
	}
	public void setExternalUrls(ExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
	}
	public Follower getFollowers() {
		return followers;
	}
	public void setFollowers(Follower followers) {
		this.followers = followers;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
