package com.devsuperior.listgames.repository;

import com.devsuperior.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
