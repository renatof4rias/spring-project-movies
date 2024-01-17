package com.softelse.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.movies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
