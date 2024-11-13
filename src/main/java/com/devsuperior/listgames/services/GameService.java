package com.devsuperior.listgames.services;

import com.devsuperior.listgames.dto.GameMinDTO;
import com.devsuperior.listgames.entities.Game;
import com.devsuperior.listgames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

        List <Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
