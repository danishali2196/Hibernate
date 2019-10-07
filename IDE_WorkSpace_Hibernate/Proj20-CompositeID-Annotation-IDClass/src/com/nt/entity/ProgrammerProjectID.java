package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ProgrammerProjectID implements Serializable {
	@Column(name="PRGMRID")
	private int prgmrId;
	@Column(name="PROJID")
	private int projId;

}
