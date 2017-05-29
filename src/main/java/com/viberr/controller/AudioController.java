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
public class AudioController {

	@RequestMapping(path={"v1/audio-analysis/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAudioAnalysisForTrack(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/audio-features/{id}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAudioFeaturesForTrack(@PathVariable("id") String id){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
	@RequestMapping(path={"/v1/audio-features?ids={ids}"}, method = {RequestMethod.GET} ,produces = {MediaType.APPLICATION_JSON_VALUE})
	private ResponseEntity<?> getAudioFeaturesForSeveralTracks(@RequestParam("ids") String ids){
		
		return new ResponseEntity<Artist>(new Artist(), HttpStatus.OK);
	}
	
}
