package com.viberr.model;

import java.time.Instant;

public class SavedTrack {

	private Instant addedAt;
	private Track track;
	public Instant getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(Instant addedAt) {
		this.addedAt = addedAt;
	}
	public Track getTrack() {
		return track;
	}
	public void setTrack(Track track) {
		this.track = track;
	}
	
	
}
