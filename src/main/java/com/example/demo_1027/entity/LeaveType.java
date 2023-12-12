package com.example.demo_1027.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leave_type")
public class LeaveType {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "type")
	private String type;
}
