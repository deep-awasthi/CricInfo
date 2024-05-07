package com.example.deepawasthi.Cricinfo.Controller;

import com.example.deepawasthi.Cricinfo.Model.MatchEntity;
import com.example.deepawasthi.Cricinfo.Service.CricketServiceImpl;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/cricket")
public class MatchController {

    @Autowired
    private CricketServiceImpl cricketService;

    @GetMapping("/all")
    public ResponseEntity<List<MatchEntity>> getAllMatches(){
        return new ResponseEntity<>(this.cricketService.getAllmatches(), HttpStatus.OK);
    }

    @GetMapping("/live/{matchId}")
    public ResponseEntity<?> getLiveMatchScores(@PathVariable("matchId") int matchId) throws InterruptedException{
        return new ResponseEntity<>(this.cricketService.getLiveMatchScores(matchId), HttpStatus.OK);
    }
}
