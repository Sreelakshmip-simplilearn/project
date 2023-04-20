package com.example.demo.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
	@Table(name = "USER")
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "User_Role")
	@DiscriminatorValue("Customer")
	public class User {


		public User() {
		
		}

		@Id
		private String emailId;

		@Column(length = 20)
		private String password;

		@Column
		private String firstName;

		@Column
		private String lastName;

		@Column
		private String country;

		@Column
		private String gender;

		@Temporal(TemporalType.DATE)
		private Date dateOfBirth;

		@Override
		public String toString() {
			return "User [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
					+ lastName + ", country=" + country + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + "]";
		}
		


		public User(String emailId, String password, String firstName, String lastName, String country, String gender,
				Date dateOfBirth) {
			super();
			this.emailId = emailId;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.country = country;
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
		@Transient
		public String getDiscriminatorValue() {
		    return this.getClass().getAnnotation(DiscriminatorValue.class).value();
		}

		/*
		 * @OneToMany private List<Purchase> listOfPurchases; // cartID
		 */}


