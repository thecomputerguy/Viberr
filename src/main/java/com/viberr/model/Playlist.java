package com.viberr.model;

import java.util.List;

public class Playlist {

	private Boolean collaborative;
	private String description;
	private ExternalUrl externalUrls;
	private Follower followers;
	private String href;
	private String id;
	private List<Image> images;
	private String name;
	private User owner;
	private Boolean playlistStatus;
	private String snapshotId;
	private List<Track> tracks;
	private String type;
	private String uri;
	public Boolean getCollaborative() {
		return collaborative;
	}
	public void setCollaborative(Boolean collaborative) {
		this.collaborative = collaborative;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Boolean getPlaylistStatus() {
		return playlistStatus;
	}
	public void setPlaylistStatus(Boolean playlistStatus) {
		this.playlistStatus = playlistStatus;
	}
	public String getSnapshotId() {
		return snapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
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
