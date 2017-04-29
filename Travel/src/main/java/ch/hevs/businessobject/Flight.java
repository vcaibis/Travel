package ch.hevs.businessobject;

import javax.persistence.Entity;
import javax.persistence.PostPersist;
import javax.persistence.Table;

import businessObject.DestinationArrival;
import businessObject.DestinationDepart;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;


public class Flight {
	
	private long id;
	private int  flightNumber;
	private int  passengersNumber;
	private float duration; 
	private float departure; 
	private float timeArrival; 	
	private String airline;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getPassengersNumber() {
		return passengersNumber;
	}

	public void setPassengersNumber(int passengersNumber) {
		this.passengersNumber = passengersNumber;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public float getDeparture() {
		return departure;
	}

	public void setDeparture(float departure) {
		this.departure = departure;
	}

	public float getTimeArrival() {
		return timeArrival;
	}

	public void setTimeArrival(float timeArrival) {
		this.timeArrival = timeArrival;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}


	
	//constructors
	public Flight(){
		
	}
	
	public Flight(int flightNumber, int passengersNumber, float duration, float departure, float timeArrival,
			String airline){
		
	}
	
	
	
	
	
	
}
