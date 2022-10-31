package com.digisprint.Event_Management1.Model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="birthday")
public class birthday {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	 private  int b_Id;
	@Column
	 private String name_of_child;  
	@Column
	 private Date date_of_birth;
	@Column
	 private String venue;
	@Column
	 private Date date_of_arrival;
	@Column
	 private Date date_of_departure; 
	@Column
	 private String decoration;
	@Column
	 private String material;
	@Column
	 private String cake;
	@Column
	 private String phoneno;
	public int getB_Id() {
		return b_Id;
	}
	public void setB_Id(int b_Id) {
		this.b_Id = b_Id;
	}
	public String getName_of_child() {
		return name_of_child;
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
		return decoration;
	}
	public void setDecoration(String decoration) {
		this.decoration = decoration;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "birthday [b_Id=" + b_Id + ", name_of_child=" + name_of_child + ", date_of_birth=" + date_of_birth
				+ ", venue=" + venue + ", date_of_arrival=" + date_of_arrival + ", date_of_departure="
				+ date_of_departure + ", decoration=" + decoration + ", material=" + material + ", cake=" + cake
				+ ", phoneno=" + phoneno + "]";
	}

}
