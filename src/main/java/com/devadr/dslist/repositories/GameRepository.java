package com.devadr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devadr.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
