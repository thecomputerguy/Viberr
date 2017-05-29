package com.viberr.model;

import java.time.Instant;

public class PlaylistTrack {

	private Instant addedAt;
	private User addedBy;
	private Boolean isLocal;
	private Track track;
	public Instant getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(Instant addedAt) {
		this.addedAt = addedAt;
	}
	public User getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(User addedBy) {
		this.addedBy = addedBy;
	}
	public Boolean getIsLocal() {
		return isLocal;
	}
	public void setIsLocal(Boolean isLocal) {
		this.isLocal = isLocal;
	}
	public Track getTrack() {
		return track;
	}
	public void setTrack(Track track) {
		this.track = track;
	}
	
	
}
