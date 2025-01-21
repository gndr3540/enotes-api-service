package com.naga.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	
	private Boolean isActive;
	private Boolean isDeleted;
	private Date createdOn;
	private Date updatedOn;
	private Integer createdBy;
	private Integer updatedBy;

}
