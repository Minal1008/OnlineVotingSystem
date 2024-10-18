package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "voters")
public class Voter {
    
    @Id
    @Column(name = "voter_id", unique = true, nullable = false)
    private String voterId; // Generate custom voter ID manually

    private String name;
    private String email;
	public Voter(String voterId, String name, String email) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.email = email;
	}
	public Voter() {
		super();
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
