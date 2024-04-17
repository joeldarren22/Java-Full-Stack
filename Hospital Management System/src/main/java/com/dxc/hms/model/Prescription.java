package com.dxc.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prescription")
public class Prescription {
	
	@Column(name="Doctorname")
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	@Column(name="Patientname")
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	@Column(name="Patientage")
	public String getPatientage() {
		return patientage;
	}
	public void setPatientage(String patientage) {
		this.patientage = patientage;
	}
	@Column(name="Patientgender")
	public String getPatientgender() {
		return patientgender;
	}
	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}
	@Column(name="Medicine")
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	@Column(name="MedicineQuantity")
	public String getMedicinequantity() {
		return medicinequantity;
	}
	public void setMedicinequantity(String medicinequantity) {
		this.medicinequantity = medicinequantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String patientname;
	private String patientage;
	private String patientgender;
	private String medicine;
	private String medicinequantity;
	private String doctorname;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

}
