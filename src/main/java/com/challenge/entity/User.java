package com.challenge.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 100)
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
	
	@OneToMany(mappedBy = "id.user")
	private List<Submission> submissions;
	
	@OneToMany(mappedBy = "id.user")
	private List<Candidate> candidates;
}
