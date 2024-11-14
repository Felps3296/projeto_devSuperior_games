package com.devsuperior.listgames.controller;

import com.devsuperior.listgames.dto.GameDTO;
import com.devsuperior.listgames.dto.GameMinDTO;
import com.devsuperior.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {

        GameDTO result = gameService.findById(id);
        return result;
    }

}
