package com.viberr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

	@RequestMapping(path={"/v1/search?type=album"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> searchForAlbums(@RequestParam("type") String type){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/search?type=artist"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> searchForArtists(@RequestParam("type") String type){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/search?type=playlist"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> searchForPlaylists(@RequestParam("type") String type){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/search?type=track"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> searchForTracks(@RequestParam("type") String type){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
}
