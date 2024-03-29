package com.challenge.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 100)
	private String name;
	
	@NotNull
	@Size(max = 50)
	private String slug;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;

	@OneToMany(mappedBy = "id.company")
	private List<Candidate> candidates;
}

