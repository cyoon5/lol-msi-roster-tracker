package com.loremipsum.lolmsistattracker.service;

import com.loremipsum.lolmsistattracker.model.Team;
import com.loremipsum.lolmsistattracker.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService
{

    private final TeamRepository teamRepo;

    public TeamService(TeamRepository teamRepo)
    {
        this.teamRepo = teamRepo;
    }

    public Team addTeam(Team team)
    {
       return  teamRepo.save(team);
    }

    public void deleteTeam(Long id)
    {
        teamRepo.deleteById(id);
    }

    public Team updateTeam(Long id, Team updatedTeam)
    {
        Team currentTeam  = teamRepo.findById(id).orElse(null);

        if(currentTeam == null)
            throw new NullPointerException("Team not found with id: " + id);

        currentTeam.setTeamName(updatedTeam.getTeamName());
        currentTeam.setRegion(updatedTeam.getRegion());
        currentTeam.setMembers(updatedTeam.getMembers());

        return teamRepo.save(currentTeam);
    }

    public List<Team> getAllTeams()
    {
        return teamRepo.findAll();
    }

    public List<Team> findByTeamName(String team)
    {
        return teamRepo.findByTeamNameIgnoreCase(team);
    }

}
