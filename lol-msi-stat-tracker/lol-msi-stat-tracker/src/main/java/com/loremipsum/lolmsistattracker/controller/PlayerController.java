package com.loremipsum.lolmsistattracker.controller;

import com.loremipsum.lolmsistattracker.model.Player;
import com.loremipsum.lolmsistattracker.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController
{

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers()
    {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{name}")
    public List<Player> getPlayer(@PathVariable String name)
    {
        return playerService.getPlayerByName(name);
    }


    @PostMapping("/players")
    public Player add(@RequestBody Player player)
    {
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/players/{id}")
    public void delete(@PathVariable Long id)
    {
        playerService.deletePlayer(id);
    }

    @PutMapping("/players/{id}")
    public void update(@PathVariable Long id, @RequestBody Player player)
    {
        playerService.updatePlayer(id, player);
    }




}
