package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private int reportsTo;

	public Employee() {

	}

	public Employee(String firstName, String lastName, String emailId, int reportsTo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.reportsTo = reportsTo;
	}

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)

	@GeneratedValue(generator = "sqlite")
	@TableGenerator(name = "sqlite", table = "sqlite_sequence", pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "sqliteTestTable")
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "ReportsTo", nullable = false)
	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}

}