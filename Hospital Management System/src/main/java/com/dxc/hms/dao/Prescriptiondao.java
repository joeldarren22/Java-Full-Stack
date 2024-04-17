package com.dxc.hms.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dxc.hms.connection.HibCon;
import com.dxc.hms.model.Prescription;
import com.dxc.hms.service.PrescriptionService;

public class Prescriptiondao implements PrescriptionService{
	HibCon hc= new HibCon();
	
	@Override
	public void addprescription(Prescription Prescription) {
		// TODO Auto-generated method stub
		
		Session ses=hc.getSession();
		ses.save(Prescription);
		Transaction t=ses.beginTransaction();
		t.commit();
		
	}

}
