package com.softelse.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.movies.entities.Score;
import com.softelse.movies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
