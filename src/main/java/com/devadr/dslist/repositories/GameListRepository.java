package com.devadr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devadr.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
