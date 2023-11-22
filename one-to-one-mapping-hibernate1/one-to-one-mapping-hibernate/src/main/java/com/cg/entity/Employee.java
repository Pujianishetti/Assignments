package com.cg.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="employeeTable1")
public class Employee {
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	
	@Column(name="employee_name",length=100,nullable=false)
	private String employeeName;
	
	@Column(name="email",unique=true)
	private String email;

	@Column(name="salary")
	private Double salary;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	private Address address;  
	
	public Employee( ) {}
	
	public Employee( String employeeName, String email,  Double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
}