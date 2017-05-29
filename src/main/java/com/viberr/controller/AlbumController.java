package com.viberr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viberr.model.Album;

@RestController
public class AlbumController {

	@RequestMapping(path={"/v1/albums/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAlbum(@PathVariable("id") String id){
		
		return new ResponseEntity<Album>(new Album(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/albums?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAlbumsForGivenIds(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Album>(new Album(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/albums/{id}/tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTracksForAlbum(@PathVariable("id") String id){
		
		return new ResponseEntity<Album>(new Album(), HttpStatus.OK);
	}
	
	/*@RequestMapping(path={"/v1/albums/{id}/tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTracksForAlbum(@PathVariable("id") String id){
		
		return new ResponseEntity<Album>(new Album(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/albums/{id}/tracks"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTracksForAlbum(@PathVariable("id") String id){
		
		return new ResponseEntity<Album>(new Album(), HttpStatus.OK);
	}*/
}
