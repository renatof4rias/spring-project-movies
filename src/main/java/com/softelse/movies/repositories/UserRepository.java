package com.softelse.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.movies.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
