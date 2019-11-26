package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="voter")
public class VoterCard {

	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	@Exclude									//to avoid overriding of toString()
	@OneToOne(mappedBy = "voterCard")			// denoting by directional
	private Person person;
	
}
