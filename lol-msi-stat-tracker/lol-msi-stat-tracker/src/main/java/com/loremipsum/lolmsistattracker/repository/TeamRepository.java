package com.loremipsum.lolmsistattracker.repository;

import com.loremipsum.lolmsistattracker.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long>
{

    public List<Team> findByTeamNameIgnoreCase(String team);


}
