package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Voter;
import com.example.demo.Service.VotingService;

@RestController
@RequestMapping("/voting")
public class VotingController {

    @Autowired
    private VotingService votingService;
    
    

    @PostMapping("/register")
    public ResponseEntity<Voter> registerVoter(@RequestBody Voter voter) {
        Voter registeredVoter = votingService.registerVoter(voter);
        return ResponseEntity.ok(registeredVoter);
    }

    @PostMapping("/vote")
    public ResponseEntity<String> castVote(@RequestParam String voterId, @RequestParam String candidateId) {
        votingService.castVote(voterId, candidateId);
        return ResponseEntity.ok("Vote cast successfully");
    }
}
