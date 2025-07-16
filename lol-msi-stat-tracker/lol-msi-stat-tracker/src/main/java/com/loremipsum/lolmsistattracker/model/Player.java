package com.loremipsum.lolmsistattracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private String role;
    private String team;
    private Double kda;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Player(){}
    public Player(String playerName, String role, String team, Double kda)
    {
        this.playerName = playerName;
        this.role = role;
        this.team = team;
        this.kda = kda;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getKda() {
        return kda;
    }

    public void setKda(Double kda) {
        this.kda = kda;
    }
}

