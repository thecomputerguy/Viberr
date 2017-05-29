package com.viberr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import com.viberr.model.Artist;
import com.viberr.model.User;

@RequestMapping
public class UserController {

	@RequestMapping(path={"/v1/me"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserProfile(){
		
		return new ResponseEntity<User>(new User(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/following"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getFollowedArtists(){
		
		return new ResponseEntity<ArrayList<Artist>>(new ArrayList<Artist>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/following"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> followArtistsOrUsers(@RequestBody String ids){
		
		return new ResponseEntity<ArrayList<Artist>>(new ArrayList<Artist>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/following"}, method = {RequestMethod.DELETE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> unfollowArtistsOrUsers(@RequestBody String ids){
		
		return new ResponseEntity<ArrayList<Artist>>(new ArrayList<Artist>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/following/contains"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> checkIfUserFollowsArtistsOrUsers(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{owner_id}/playlists/{playlist_id}/followers"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> followPlaylist(@PathVariable("owner_id") String ownerId, @PathVariable("playlist_id") String playlistId, @RequestBody Boolean makePlaylistPublic){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{owner_id}/playlists/{playlist_id}/followers"}, method = {RequestMethod.DELETE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> unfollowPlaylist(@PathVariable("owner_id") String ownerId, @PathVariable("playlist_id") String playlistId, @RequestBody Boolean makeItPrivate){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/tracks?ids={ids}"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> saveTracksForUser(@RequestParam(name = "ids",required=false) String ids, @RequestBody List<String> trackIds){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	

	@RequestMapping(path={"/v1/me/tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUsersSavedTracks(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/tracks?ids={ids}"}, method = {RequestMethod.DELETE} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> removeUsersSavedTracks(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/tracks/contains?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUsersSavedTracks(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/albums?ids={ids}"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> saveAlbumsForUser(@RequestParam(name = "ids", required=false) String ids, @RequestBody List<String> albumsIds){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/albums"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getSavedAlbumsForUser(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/albums?ids={ids}"}, method = {RequestMethod.DELETE} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> removeSavedAlbumsForUser(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/albums/contains?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> checkUsersSavedAlbums(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/top/{type}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUsersTopArtistsOrTracks(@PathVariable("type") String type){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUserprofile(@PathVariable("user_id") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUserPlaylist(@PathVariable("user_id") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/playlists"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserPlaylist(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUserPlaylistWithPlaylistId(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getUserPlaylistTracks(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists"}, method = {RequestMethod.POST} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> createUserPlaylist(@PathVariable("user_id") String userId, @RequestBody String playlist){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> createUserPlaylist(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId, @RequestBody String playlist){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/tracks"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> addTracksToUserPlaylist(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId, @RequestPart("uris") String uris, @RequestPart("position") String position){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	

	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/tracks"}, method = {RequestMethod.DELETE} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> removeTracksFromUserPlaylist(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/tracks"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> reorderUserPlaylistTracks(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId, @RequestBody String reordering){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/tracks"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> replaceUserPlaylistTracks(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId, @RequestBody String replace){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/users/{user_id}/playlists/{playlist_id}/followers/contains"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> checkIfUsersFollowPlaylist(@PathVariable("user_id") String userId, @PathVariable("playlist_id") String playlistId){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/recently-played"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserRecentlyPlayedTracks(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/devices"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserAvailableDevices(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserCurrentPlayback(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/currently-playing"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCurrentUserCurrentlyPlayingTrack(){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> transferCurrentUserPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> startOrResumeCurrentUserPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/pause"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> pauseCurrentUserPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/next"}, method = {RequestMethod.POST} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> skipCurrentUserPlaybackToNextTrack(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/previous"}, method = {RequestMethod.POST} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> skipCurrentUserPlaybackToPreviousTrack(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/seek"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> seekToPositionInCurrentlyPlayingTrack(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/repeat"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> setRepeatOnUsersPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/volume"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> setVolumeForUsersPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/me/player/shuffle"}, method = {RequestMethod.PUT} ,produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> toggleShuffleForUserPlayback(@RequestBody String playback){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
}
