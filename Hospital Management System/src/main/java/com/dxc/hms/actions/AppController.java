package com.dxc.hms.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.hms.dao.Doctordao;
import com.dxc.hms.dao.Prescriptiondao;
import com.dxc.hms.model.Doctor;
import com.dxc.hms.model.Prescription;

@Controller
public class AppController implements AppCtrl 
{

	@RequestMapping(value="/doctor/add")
	public ModelAndView addDoctor(@RequestParam(value="date")String date,@RequestParam(value="name")String name, @RequestParam(value="emailid")String emailid,@RequestParam(value="phonenumber")String phonenumber,@RequestParam(value="department")String department,@RequestParam(value="availabletiming")String availabletiming,@RequestParam(value="gender")String gender, @RequestParam(value="password")String password) { 
	Doctordao doc= new Doctordao();
	Doctor d = new Doctor();
	d.setDate(date);
	d.setName(name);
	d.setPhonenumber(phonenumber);
	d.setEmailid(emailid);
	d.setDepartment(department);
	d.setGender(gender);
	d.setPassword(password);
	d.setAvailabletiming(availabletiming);
	doc.AddDoctor(d);
	
	return new ModelAndView();
	
	
}

	@Override
	@RequestMapping(value="/doctor/login",method=RequestMethod.POST)
	public ModelAndView Login(@RequestParam(value="username")String user,@RequestParam(value="password" )String userpassword) {
		// TODO Auto-generated method stub
		Doctordao doc = new Doctordao();
		boolean b=doc.LoginValidate(user, userpassword);
		if(b) {
			return new ModelAndView("doctorhome","data",user);
		}
		else {
			return new ModelAndView("loginagain");
		}
	
	}
	@RequestMapping(value="/prescription/add")
	public ModelAndView addprescription(@RequestParam(value="doctorname")String doctorname,@RequestParam(value="patientname")String patientname,@RequestParam(value="patientage")String patientage,@RequestParam(value="patientgender")String patientgender,@RequestParam(value="medicine")String medicine,@RequestParam(value="medicinequantity")String medicinequantity) 
	
	{
	Prescriptiondao pre = new Prescriptiondao();
	Prescription p = new Prescription();
	p.setMedicine(medicinequantity);
	p.setDoctorname(doctorname);
	p.setMedicinequantity(medicinequantity);
	p.setPatientage(patientage);
	p.setPatientgender(patientgender);
	p.setPatientname(patientname);
	p.setMedicine(medicine);
	pre.addprescription(p);
	
	return new ModelAndView();
	
	}

	@Override
	public ModelAndView addDoctor(String name, String emailid, String phonenumber, String department,
			String availabletiming, String gender, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}


