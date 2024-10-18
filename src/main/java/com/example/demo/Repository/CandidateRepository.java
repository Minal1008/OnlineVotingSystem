package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, String> {
}
