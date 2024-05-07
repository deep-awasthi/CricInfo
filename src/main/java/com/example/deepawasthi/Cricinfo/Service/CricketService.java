package com.example.deepawasthi.Cricinfo.Service;

import com.example.deepawasthi.Cricinfo.Model.MatchEntity;

import java.util.List;

public interface CricketService {
    List<MatchEntity> getAllmatches();

    MatchEntity getLiveMatchScores(int matchId);
}
