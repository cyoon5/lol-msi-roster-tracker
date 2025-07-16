package com.loremipsum.lolmsistattracker.repository;

import com.loremipsum.lolmsistattracker.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long>
{

    public List<Player> findByPlayerNameIgnoreCase(String name);







}
