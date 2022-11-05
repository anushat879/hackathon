/**
 * 
 */
package in.health.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PATIENT_INFO")
public class PatientEntity {

	@Id
	@GeneratedValue
	@Column(name="PATIENT_ID")
	private Integer patientId;
	@Column(name="FULL_NAME")
	private String fullname;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_NO")
	private Long phno;
	@Column(name="GENDER")
	private String gender;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="COMMUNICATION")
	private String communication;
	@CreationTimestamp
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	

}
