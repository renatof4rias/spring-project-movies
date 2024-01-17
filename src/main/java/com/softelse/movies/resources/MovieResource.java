package com.softelse.movies.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softelse.movies.dto.MovieDTO;
import com.softelse.movies.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findList(Pageable pageable){
		Page<MovieDTO> result = movieService.findList(pageable);
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
		MovieDTO dto = movieService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
