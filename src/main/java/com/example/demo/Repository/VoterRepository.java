package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, String> {
    Optional<Voter> findByEmail(String email);
}
