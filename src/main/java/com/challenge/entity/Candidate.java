package com.challenge.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Candidate implements Serializable {

	@NotNull
	private Long status;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;

	@EmbeddedId
	private UserAccelerationCompany userAccelerationCompany;


}
