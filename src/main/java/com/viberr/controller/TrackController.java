package com.viberr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackController {

	@RequestMapping(path={"/v1/tracks/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTrack(@PathVariable("id") String id){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/tracks?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getTracks(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Boolean>(new Boolean(true), HttpStatus.OK);
	}
	
}
