package com.dxc.hms.service;

import com.dxc.hms.model.Doctor;

public interface DoctorService {
	public void AddDoctor(Doctor doctor);
	public boolean LoginValidate(String user,String userpassword);

}
