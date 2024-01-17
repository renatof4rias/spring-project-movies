package com.softelse.movies.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softelse.movies.dto.MovieDTO;
import com.softelse.movies.dto.ScoreDTO;
import com.softelse.movies.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreResource {

	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = scoreService.saveScore(dto);
		return movieDTO;
	}
}