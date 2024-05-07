package com.example.deepawasthi.Cricinfo.Service;

import com.example.deepawasthi.Cricinfo.Model.MatchEntity;
import com.example.deepawasthi.Cricinfo.Repository.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketServiceImpl implements CricketService{

    @Autowired
    private MatchRepo matchRepo;

    @Override
    public List<MatchEntity> getAllmatches() {
        return this.matchRepo.findAll();
    }

    @Override
    public MatchEntity getLiveMatchScores(int matchId) {
        return this.matchRepo.findById(matchId).orElseThrow(()-> new RuntimeException("No Match Found"));
    }
}
