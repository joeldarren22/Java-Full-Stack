package com.dxc.hms.actions;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface AppCtrl {
	public ModelAndView addDoctor(@RequestParam(value="name")String name, @RequestParam(value="emailid")String emailid,@RequestParam(value="phonenumber")String phonenumber,@RequestParam(value="department")String department,@RequestParam(value="availabletiming")String availabletiming,@RequestParam(value="gender")String gender,String password) ;
	public ModelAndView Login(String user,String userpassword);

}
