package com.devsuperior.listgames.services;

import com.devsuperior.listgames.dto.GameDTO;
import com.devsuperior.listgames.dto.GameMinDTO;
import com.devsuperior.listgames.entities.Game;
import com.devsuperior.listgames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

        List <Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {

        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
}
