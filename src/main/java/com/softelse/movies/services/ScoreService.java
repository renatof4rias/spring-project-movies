package com.softelse.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softelse.movies.dto.MovieDTO;
import com.softelse.movies.dto.ScoreDTO;
import com.softelse.movies.entities.Movie;
import com.softelse.movies.entities.Score;
import com.softelse.movies.entities.User;
import com.softelse.movies.repositories.MovieRepository;
import com.softelse.movies.repositories.ScoreRepository;
import com.softelse.movies.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private ScoreRepository scoreRepository;

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {

		User user = userRepository.findByEmail(dto.getEmail());

		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Movie movie = movieRepository.findById(dto.getMovieId()).get();

		Score score = new Score();
		score.setUser(user);
		score.setMovie(movie);
		score.setValue(dto.getScore());

		score = scoreRepository.saveAndFlush(score);

		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum += s.getValue();

		}

		double media = sum / movie.getScores().size();

		movie.setScore(media);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.saveAndFlush(movie);
		return new MovieDTO(movie);
	}

}
