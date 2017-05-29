package com.viberr.model;

import java.time.Instant;

public class SavedAlbum {

	private Instant addedAt;
	private Album albums;
	
	public Instant getAddedAt() {
		return addedAt;
	}
	public void setAddedAt(Instant addedAt) {
		this.addedAt = addedAt;
	}
	public Album getAlbums() {
		return albums;
	}
	public void setAlbums(Album albums) {
		this.albums = albums;
	}
	
	
}
