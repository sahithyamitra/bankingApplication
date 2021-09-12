package com.example.demo.Controller;


import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.DAO.BalanceDAO;
import com.example.demo.DAO.RegistrationDAO;
import com.example.demo.model.Balance;
import com.example.demo.model.ChangePWD;
import com.example.demo.model.Registration;

@Controller
public class RegistrationController {

	@Autowired
	@Qualifier("repoOne")
	RegistrationDAO dao;
	@RequestMapping("/")
	public String Home()
	{
		return "index.jsp";
	}
	@RequestMapping("/postDetails")
	public String addToTable(Registration r)
	{
		dao.save(r);
		return "Home.jsp";
	}
	@RequestMapping("/getCustomer")
	public String LoginUser(String CUSTOMERID,String PWD)
	{
		Optional<Registration> reg=dao.checkLogin(CUSTOMERID,PWD);
		if(reg.isPresent())
		{
			return "Home.jsp";
		}
		return "Login.jsp";
	}
	@RequestMapping("/chPassword")
	@ResponseBody
	public String changePassword(ChangePWD c)
	{
		if(dao.findByPWD(c.getPwd())!=null)
		{
			if(c.getNewPwd().equals(c.getConfirmPwd()))
			{
				if(dao.changePwd(c.getNewPwd(),c.getPwd())!=0)
				{
					return "successfully updated";
				}
			}
		}
			return "wrong current password";
	}
}
