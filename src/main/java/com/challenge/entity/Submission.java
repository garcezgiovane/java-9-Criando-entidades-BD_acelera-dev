package com.challenge.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
