package com.viberr.model;

import java.util.List;

public class Recommendation {

	private List<RecommendationSeed> seeds;
	private List<Track> tracks;
	public List<RecommendationSeed> getSeeds() {
		return seeds;
	}
	public void setSeeds(List<RecommendationSeed> seeds) {
		this.seeds = seeds;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	
}
