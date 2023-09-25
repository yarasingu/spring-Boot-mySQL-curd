package com.yarisingu.curdoperations.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class PgmanDto {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private long mobile;
	@Column(unique = true)
	private String email;
	private String gender;
    @Column(unique = true)
	private long adharCard;
    @Column(unique = true)
	private String panCard;
	private int roomNo;
	private double roomPrice;
	private Date dob;
    private Date dateJoin;
    private Date dateEnd;
}
