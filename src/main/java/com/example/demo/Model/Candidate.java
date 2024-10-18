package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @Column(name = "candidate_id", unique = true, nullable = false)
    private String candidateId; // Generate custom candidate ID manually
    
    private String name;

	public Candidate(String candidateId, String name) {
		super();
		this.candidateId = candidateId;
		this.name = name;
	}

	public Candidate() {
		super();
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
}


