package com.anuj.crud.namednative.query.springboot.dao.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name ="User")
@NamedNativeQueries(value= {
		@NamedNativeQuery(name = "User.findByFirstName",query = "SELECT * FROM USER WHERE FIRST_NAME=?1",resultClass = User.class),
		@NamedNativeQuery(name="User.findByLastNameAndEmail",query="SELECT * FROM USER WHERE LAST_NAME=?1 AND EAMIL=?2",resultClass=User.class)
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
	private Integer userId;
    
    @Column(name="firstName",length = 60)
	private String firstName;
    
    @Column(name="lastName",length=60)
	private String lastName;
    
    @Column(name="eamil")
	private String email;
    
    @Column(name="creationDate")
	private Date creationDate;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}