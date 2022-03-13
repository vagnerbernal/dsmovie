package com.vabec.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vabec.dsmovie.entities.Score;
import com.vabec.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
