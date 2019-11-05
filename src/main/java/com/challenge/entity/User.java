package com.challenge.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "user")
@Data
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 100)
	@Column(name = "full_name")
	private String fullname;
	
	@NotNull
	@Email
	@Size(max = 100)
	private String email;
	
	@NotNull
	@Size(max = 50)
	private String nickname;
	
	@NotNull
	@Size(max = 255)
	private String password;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;
	
	@OneToMany(mappedBy = "userId")
	private List<Submission> submissions;
	
	@OneToMany(mappedBy = "userId")
	private List<Candidate> candidates;
}
