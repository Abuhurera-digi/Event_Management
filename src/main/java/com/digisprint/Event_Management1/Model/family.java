package com.digisprint.Event_Management1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String familyname;
	private String address;
	private int no_of_attendees;
	private int no_of_rooms;
	private String catering;
	private String alcohol;
	private Date date_of_arrival;
	private Date date_of_departure;
	private String phone_no;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getFamilyname() {
		return familyname;
	}
	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
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
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "family [userid=" + id + ", familyname=" + familyname + ", Address=" + address + ", no_of_attendees="
				+ no_of_attendees + ", no_of_rooms=" + no_of_rooms + ", catering=" + catering + ", alcohol=" + alcohol
				+ ", date_of_arrival=" + date_of_arrival + ", date_of_departure=" + date_of_departure + ", phone_no="
				+ phone_no + "]";
	}
	
	
	
}
