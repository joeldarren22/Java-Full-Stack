package com.dxc.hms.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dxc.hms.connection.HibCon;
import com.dxc.hms.model.Doctor;
import com.dxc.hms.service.DoctorService;

public class Doctordao implements DoctorService {
	HibCon hc= new HibCon();

	@Override
	public void AddDoctor(Doctor doctor) {
		// TODO Auto-generated method stubs
		
		Session ses=hc.getSession();
		ses.save(doctor);
		Transaction t=ses.beginTransaction();
		t.commit();
	}

	@Override
	public boolean LoginValidate(String user, String userpassword) {
		// TODO Auto-generated method stub
		boolean y=false;
		Session ses=hc.getSession();
		Criteria c =ses.createCriteria(Doctor.class);
		List l=c.list();
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Doctor doc= (Doctor) i.next();
			if((user.equals(doc.getName())&&(userpassword.equals(doc.getPassword())))) {
				y= true;
				System.out.println("true");
				
			}
		}
		System.out.println("false");
		return y;
	}
	 
	

}
