package com.loremipsum.lolmsistattracker.controller;

import com.loremipsum.lolmsistattracker.model.Team;
import com.loremipsum.lolmsistattracker.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController
{
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService)
    {
        this.teamService  = teamService;
    }


    @GetMapping("/teams")
    public List<Team> getAllTeams()
    {
       return  teamService.getAllTeams();
    }

    @PostMapping("/teams")
    public Team add(@RequestBody Team team)
    {
        return teamService.addTeam(team);
    }

    @DeleteMapping( "/teams/{id}")
    public void delete(@PathVariable Long id)
    {
        teamService.deleteTeam(id);
    }

    @PutMapping("/teams/{id}")
    public void update(@PathVariable Long id, @RequestBody Team newTeam)
    {
        teamService.updateTeam(id, newTeam);
    }


}
