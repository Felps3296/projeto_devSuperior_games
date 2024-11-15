package com.devsuperior.listgames.controller;

import com.devsuperior.listgames.dto.GameListDTO;
import com.devsuperior.listgames.dto.GameMinDTO;
import com.devsuperior.listgames.dto.ReplacementDTO;
import com.devsuperior.listgames.services.GameListService;
import com.devsuperior.listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {

        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findBylist(@PathVariable Long listId) {

        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody  ReplacementDTO body) {

        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
