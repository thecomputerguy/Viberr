package com.viberr.model;

import java.util.List;

public class Album {

	private String album_type;
	private List<Artist> artists;
	private List<String> available_markets;
	private List<Copyright> copyrights;
	private ExternalId externalIds;
	private ExternalUrl externalUrls;
	private List<String> genres;
	private String href;
	private String id;
	private List<Image> images;
	private String label;
	private String name;
	private Integer popularity;
	private String release_date;
	private String release_date_precision;
	private List<Track> tracks;
	private String type;
	private String uri;
	
	public String getAlbum_type() {
		return album_type;
	}
	public void setAlbum_type(String album_type) {
		this.album_type = album_type;
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	public List<String> getAvailable_markets() {
		return available_markets;
	}
	public void setAvailable_markets(List<String> available_markets) {
		this.available_markets = available_markets;
	}
	public List<Copyright> getCopyrights() {
		return copyrights;
	}
	public void setCopyrights(List<Copyright> copyrights) {
		this.copyrights = copyrights;
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
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getRelease_date_precision() {
		return release_date_precision;
	}
	public void setRelease_date_precision(String release_date_precision) {
		this.release_date_precision = release_date_precision;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
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
