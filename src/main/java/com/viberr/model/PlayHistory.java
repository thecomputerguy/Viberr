package com.viberr.model;

import java.time.Instant;

public class PlayHistory {

	private Track track;
	private Instant playedAt;
	private Context context;
	public Track getTrack() {
		return track;
	}
	public void setTrack(Track track) {
		this.track = track;
	}
	public Instant getPlayedAt() {
		return playedAt;
	}
	public void setPlayedAt(Instant playedAt) {
		this.playedAt = playedAt;
	}
	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}
	
	
}
