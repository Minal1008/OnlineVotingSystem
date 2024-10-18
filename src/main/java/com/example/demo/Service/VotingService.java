package com.example.demo.Service;

import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Candidate;
import com.example.demo.Model.Vote;
import com.example.demo.Model.Voter;
import com.example.demo.Repository.CandidateRepository;
import com.example.demo.Repository.VoteRepository;
import com.example.demo.Repository.VoterRepository;

@Service
public class VotingService {

    @Autowired
    private VoterRepository voterRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private VoteRepository voteRepository;

    public Voter registerVoter(Voter voter) {
        // Generate a custom voter ID and register the voter
        voter.setVoterId(UUID.randomUUID().toString()); // Manual ID generation
        return voterRepository.save(voter);
    }

    public void castVote(String voterId, String candidateId) {
        Voter voter = voterRepository.findById(voterId).orElseThrow();
        Candidate candidate = candidateRepository.findById(candidateId).orElseThrow();
        
        Vote vote = new Vote();
        vote.setVoteId(UUID.randomUUID().toString()); // Manual ID generation
        vote.setVoter(voter);
        vote.setCandidate(candidate);
        
        voteRepository.save(vote);
    }

    // Other methods
}
