package com.viberr.model;

import java.util.List;

public class Track {

	private Album album;
	private List<Artist> artists;
	private List<String> availableMarkets;
	private Integer diskNumber;
	private Integer durationms;
	private Boolean explicit;
	private ExternalId externalIds;
	private ExternalUrl externalUrls;
	private String href;
	private String id;
	private Boolean isPlayable;
	private TrackLink linkedFrom;
	private String name;
	private Integer popularity;
	private String previewUrl;
	private Integer trackNumber;
	private String type;
	private String uri;
	
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	public List<String> getAvailableMarkets() {
		return availableMarkets;
	}
	public void setAvailableMarkets(List<String> availableMarkets) {
		this.availableMarkets = availableMarkets;
	}
	public Integer getDiskNumber() {
		return diskNumber;
	}
	public void setDiskNumber(Integer diskNumber) {
		this.diskNumber = diskNumber;
	}
	public Integer getDurationms() {
		return durationms;
	}
	public void setDurationms(Integer durationms) {
		this.durationms = durationms;
	}
	public Boolean getExplicit() {
		return explicit;
	}
	public void setExplicit(Boolean explicit) {
		this.explicit = explicit;
	}
	public ExternalId getExternalIds() {
		return externalIds;
	}
	public void setExternalIds(ExternalId externalIds) {
		this.externalIds = externalIds;
	}
	public ExternalUrl getExternalUrls() {
		return externalUrls;
	}
	public void setExternalUrls(ExternalUrl externalUrls) {
		this.externalUrls = externalUrls;
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
	public Boolean getIsPlayable() {
		return isPlayable;
	}
	public void setIsPlayable(Boolean isPlayable) {
		this.isPlayable = isPlayable;
	}
	
	public TrackLink getLinkedFrom() {
		return linkedFrom;
	}
	public void setLinkedFrom(TrackLink linkedFrom) {
		this.linkedFrom = linkedFrom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopularity() {
		return popularity;
	}
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public Integer getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(Integer trackNumber) {
		this.trackNumber = trackNumber;
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
