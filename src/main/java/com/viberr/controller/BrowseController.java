package com.viberr.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viberr.model.Album;
import com.viberr.model.Artist;
import com.viberr.model.Category;
import com.viberr.model.Playlist;

@RestController
public class BrowseController {

	@RequestMapping(path={"/v1/browse/featured-playlists"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getListOfFeaturedPlaylists(){
		
		return new ResponseEntity<ArrayList<Playlist>>(new ArrayList<Playlist>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/browse/new-releases"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getListOfNewReleases(){
		
		return new ResponseEntity<ArrayList<Album>>(new ArrayList<Album>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/browse/categories"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getListOfCategories(){
		
		return new ResponseEntity<ArrayList<Category>>(new ArrayList<Category>(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/browse/categories/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCategory(){
		
		return new ResponseEntity<Category>(new Category(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/browse/categories/{id}/playlists"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getCategorysPlaylist(@PathVariable("id") String id){
		
		return new ResponseEntity<ArrayList<Playlist>>(new ArrayList<Playlist>(), HttpStatus.OK);
	}
	
	
}
