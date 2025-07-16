package com.loremipsum.lolmsistattracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;


@Entity
public class Team
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String teamName;
    private List<String> members;
    private String region;

    public Team() {}


    public Team(String teamName, List<String> members, String region)
    {
        this.teamName = teamName;
        this.members = members;
        this.region = region;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
