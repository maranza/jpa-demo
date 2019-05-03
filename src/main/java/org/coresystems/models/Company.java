package org.coresystems.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="companies")
@Data
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="company_id")
	private Integer id;

	@Column(name = "name")
	private String name;

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="company_id", referencedColumnName="company_id")
//	List<Programmer> programmers;
	
//	@OneToMany
//	@JoinColumn(name="company_id", referencedColumnName="company_id",
//	insertable=false, updatable=false)
//	List<Programmer> programmers;
}
