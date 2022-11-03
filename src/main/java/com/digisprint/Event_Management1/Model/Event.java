package com.digisprint.Event_Management1.Model;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Event {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String eventname;
	private String event_venue;
    private Date event_date;
    private String start_time;
    private String end_time;
    private String description;
    private String event_guest;
    private  byte[] photo;
    private String base64photo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getEvent_venue() {
		return event_venue;
	}
	public void setEvent_venue(String event_venue) {
		this.event_venue = event_venue;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEvent_guest() {
		return event_guest;
	}
	public void setEvent_guest(String event_guest) {
		this.event_guest = event_guest;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	public String getBase64photo() {
		return base64photo;
	}
	public void setBase64photo(String base64photo) {
		this.base64photo = base64photo;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", event_name=" + eventname + ", event_venue=" + event_venue
				+ ", event_date=" + event_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", description=" + description + ", event_guest=" + event_guest + ", photo=" + Arrays.toString(photo)
				+ "]";
	}
	public Event(int event_id, String event_name, String event_venue, Date event_date, String start_time,
			String end_time, String description, String event_guest, byte[] photo) {

		this.id = event_id;
		this.eventname = event_name;
		this.event_venue = event_venue;
		this.event_date = event_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.description = description;
		this.event_guest = event_guest;
		this.photo = photo;
	}
	public Event() {
		
		// TODO Auto-generated constructor stub
	}

	

}
