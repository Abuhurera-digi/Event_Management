package com.digisprint.Event_Management1.Model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class birthday {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private  int b_Id;
	 private String name_of_child;  
	 private Date date_of_birth;
	 private String venue;
	 private Date date_of_arrival;
	 private Date date_of_departure; 
	 private String Decoration;
	 private String material;
	 private String cake;

	    
	 
	 
	 
	public String getName_of_child() {
		return name_of_child;
	}
	public int getId() {
		return b_Id;
	}
	public void setId(int id) {
		this.b_Id = id;
	}
	public void setName_of_child(String name_of_child) {
		this.name_of_child = name_of_child;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
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
	public String getDecoration() {
		return Decoration;
	}
	public void setDecoration(String decoration) {
		Decoration = decoration;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getCake() {
		return cake;
	}
	public void setCake(String cake) {
		this.cake = cake;
	}
	@Override
	public String toString() {
		return "birthday [id=" + b_Id + ", name_of_child=" + name_of_child + ", date_of_birth=" + date_of_birth
				+ ", venue=" + venue + ", date_of_arrival=" + date_of_arrival + ", date_of_departure="
				+ date_of_departure + ", Decoration=" + Decoration + ", material=" + material + ", cake=" + cake + "]";
	}
	
	
	
	 

}
