package com.train.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name="railway")
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Category category;
	private LocalTime startTime;
	private LocalTime endTime;
	private String source;
	private String destination;
	private int code;
	private int distance;
	private int frequency;
	
	
	
	
	
	
}
