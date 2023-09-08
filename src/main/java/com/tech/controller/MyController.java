package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tech.model.Customer;
import com.tech.servicei.ServiceI;

@Controller
public class MyController {

	@Autowired
	ServiceI si;

	@RequestMapping("/reg")
	public String insertData(@ModelAttribute Customer c) {

		int cid = si.insertData(c);
		if (cid > 0) {
			return "index";
		} else {
			return "registration";
		}
	}

	@RequestMapping("/log")
	public String fetchAllData(@RequestParam("user_Name") String us, @RequestParam("password") String pass, Customer c,
			Model m) {

		List<Customer> clist = si.fetchAllData(us, pass);
		if (us.equals("admin") && pass.equals("admin@95")) {
			m.addAttribute("data", clist);
			return "success";

		}else if(us.equals(us) & pass.equals(pass)) {
			List<Customer> list=si.fetchSingleRecord(us, pass);
			m.addAttribute("data", list);
			return "success";
		}
		return null;
	}
	
	@RequestMapping("/delete")
	public String deleteRecords(@RequestParam("rd") int c_Id, Customer c) {
		
		int x=si.deleteData(c_Id);
		if(x>0) {
			return "success";
		}else {
			return "index";
		}
	
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam("rd") int c_Id, Customer c,Model m) {
		
		Customer cs=si.editData(c_Id);
		m.addAttribute("data", cs);
		return "update";
		
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Customer c,Model m) {
		
		int cid=si.insertData(c);
		if(cid !=0) {
		return "success";
		}
		return null;
	}

}
