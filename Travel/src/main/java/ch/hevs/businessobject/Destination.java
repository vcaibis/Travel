package ch.hevs.businessobject;

import javax.persistence.Entity;
import javax.persistence.PostPersist;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Embedded;

@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public class Destination{

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String airportName;
	private int gatesNumber;
	
	
	
	//Address
	@Embedded
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	
	// id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	// constructors
	protected Destination() {
	}
	
	
	public Destination(String airportName, int gatesNumber ) {
		this.airportName = airportName;
		this.gatesNumber = gatesNumber;
	}
	
}