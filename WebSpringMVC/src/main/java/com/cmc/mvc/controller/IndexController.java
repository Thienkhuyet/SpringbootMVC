package com.cmc.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.cmc.mvc.model.bean.Account;
import com.cmc.mvc.model.bean.Customer;
import com.cmc.mvc.model.service.AccountService;
import com.cmc.mvc.model.service.CustomerService;

@Controller
public class IndexController {
	@Autowired
	AccountService accountService;
	@Autowired
	CustomerService customerS;

	@RequestMapping("/home")
	public String index(Model model) {
		model.addAttribute("aaa", accountService.getAccounts().get(0).getUsername());
		return "index";
	}
	@GetMapping("/Customer")
	public String ViewCustomer(Model model,HttpSession session) {
	//	System.out.println(customerS.getCustomers().get(0).getEmail());
		if(session.getAttribute("loginname")!=null) {
		model.addAttribute("listcus", customerS.getCustomers());
		return "Loaddb";
		}else {
			return "redirect:/";
		}
	}
	@PostMapping("/Dangnhap")
	@ResponseBody
	public String Login(HttpServletRequest request) {
		String email=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		if(accountService.getLogin(email, password)) {
			session.setAttribute("loginname", email);
			return "true";
			
		}else
		return "false";
	}
	
	@PostMapping("/Dangky")
	@ResponseBody
	public String Dangky(HttpServletRequest request) {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Account ac=new Account(username, password, email);
		if(accountService.saveAccount(ac)!=null) {
			return "true";
		}
		
		return "false";
	}
	@PostMapping("/updatecus")
	@ResponseBody
	public String updateCustomer(HttpServletRequest req) {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		String note=req.getParameter("note");
		Customer cus=new Customer(Integer.parseInt(id), name, phone, email, address, note);
		if(customerS.saveCustomer(cus)!=null) {
			return "true";
		}
		return "false";
	}
	@PostMapping("/deletaCustommer")
	@ResponseBody
	public String deleteC(HttpServletRequest req) {
		String id=req.getParameter("id");
		customerS.deleteCustomer(Integer.parseInt(id));
		return "true";
	}
}
