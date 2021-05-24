	package com.assessment.springboot.assessment.entity;
	
	import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
	

	@Entity
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
	@Table(name="employee")
	public class Employee 
	{
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="email")
		private String email;
	
		@Column(name="phone")
		private String phone;
		
		@Column(name="address")
		private String address;
		
		//constructor
		public Employee(){
			
		}
	
		public Employee( String name, String email, String phone, String address) {
			
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
		}

		
		//getter and setter
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
					+ address + "]";
		}
		
		
	
	

	
		
		}


