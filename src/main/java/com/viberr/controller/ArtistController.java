package com.viberr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viberr.model.Artist;

@RestController
public class ArtistController {

	@RequestMapping(path={"/v1/artists/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getArtist(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/artists?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getArtistsForGivenIds(@RequestParam("ids") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/artists/{id}/albums"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAlbumsForTheArtist(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/artists/{id}/top-tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTopTracksByArtistId(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	

	@RequestMapping(path={"/v1/artists/{id}/related-artists"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getArtistRelatedArtists(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	
}
