package com.digisprint.Event_Management1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Marriage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bride_name;
	private String groom_name;
	private String venue;
	private Date date_of_arrival;
	private Date date_of_departure;
	private int no_of_relatives;
	private String catering;
	private String decoration;
	private String photographer;
	private String phoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBride_name() {
		return bride_name;
	}
	public void setBride_name(String bride_name) {
		this.bride_name = bride_name;
	}
	public String getGroom_name() {
		return groom_name;
	}
	public void setGroom_name(String groom_name) {
		this.groom_name = groom_name;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
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
	public int getNo_of_relatives() {
		return no_of_relatives;
	}
	public void setNo_of_relatives(int no_of_relatives) {
		this.no_of_relatives = no_of_relatives;
	}
	public String getCatering() {
		return catering;
	}
	public void setCatering(String catering) {
		this.catering = catering;
	}
	public String getDecoration() {
		return decoration;
	}
	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}
	public String getPhotographer() {
		return photographer;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Marriage [id=" + id + ", bride_name=" + bride_name + ", groom_name=" + groom_name + ", venue=" + venue
				+ ", date_of_arrival=" + date_of_arrival + ", date_of_departure=" + date_of_departure + ", no_of_relatives="
				+ no_of_relatives + ", catering=" + catering + ", decoration=" + decoration + ", photographer="
				+ photographer + ", phoneno=" + phoneno + "]";
	}



}
