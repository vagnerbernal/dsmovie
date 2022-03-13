package com.vabec.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vabec.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
