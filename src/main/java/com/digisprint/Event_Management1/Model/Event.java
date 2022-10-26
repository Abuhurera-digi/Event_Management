package com.digisprint.Event_Management1.Model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Event {
	@Id
	@Column
	private int event_id;
	private String event_name;
	private String event_venue;
    private Date event_date;
    private String start_time;
    private String end_time;
    private String description;
    private String event_guest;
    private  String photo;
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", event_name=" + event_name + ", event_venue=" + event_venue
				+ ", event_date=" + event_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", description=" + description + ", event_guest=" + event_guest + ", photo=" + photo + "]";
	}

	

}
