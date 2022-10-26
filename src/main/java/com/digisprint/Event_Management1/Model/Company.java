package com.digisprint.Event_Management1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Company {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String organization_name;
	private String organizer_name;
	private int no_of_attendees;
	private int no_of_rooms;
	private String catering;
	private String alcohol;
	private Date date_of_arrival;
	private Date date_of_departure;
	private String phone_no;
	
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getOrganizer_name() {
		return organizer_name;
	}
	public void setOrganizer_name(String organizer_name) {
		this.organizer_name = organizer_name;
	}
	public int getNo_of_attendees() {
		return no_of_attendees;
	}
	public void setNo_of_attendees(int no_of_attendees) {
		this.no_of_attendees = no_of_attendees;
	}
	public int getNo_of_rooms() {
		return no_of_rooms;
	}
	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}
	public String getCatering() {
		return catering;
	}
	public void setCatering(String catering) {
		this.catering = catering;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public Date getDate_of_arrival() {
		return date_of_arrival;
	}
	public void setDate_of_arrival(Date date_of_arrival) {
		this.date_of_arrival = date_of_arrival;
	}
	public Date getDate_of_departure() {
		return date_of_departure;
	}
	public void setDate_of_departure(Date date_of_departure) {
		this.date_of_departure = date_of_departure;
	}
	@Override
	public String toString() {
		return "Company [userid=" + userid + ", organization_name=" + organization_name + ", organizer_name="
				+ organizer_name + ", no_of_attendees=" + no_of_attendees + ", no_of_rooms=" + no_of_rooms
				+ ", catering=" + catering + ", alcohol=" + alcohol + ", date_of_arrival=" + date_of_arrival
				+ ", date_of_departure=" + date_of_departure + ", phone_no=" + phone_no + "]";
	}
	
	
}
