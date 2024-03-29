package com.challenge.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Submission {

	@NotNull
	private Float score;

	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;

	@EmbeddedId
	private UserChallenge id;
	
}
