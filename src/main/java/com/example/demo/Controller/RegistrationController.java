package com.example.demo.Controller;


import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DAO.BalanceDAO;
import com.example.demo.DAO.LoginDAO;
import com.example.demo.DAO.RegistrationDAO;
import com.example.demo.model.Balance;
import com.example.demo.model.ChangePWD;
import com.example.demo.model.Login;
import com.example.demo.model.Registration;

@Controller
public class RegistrationController {

	@Autowired
	@Qualifier("repoOne")
	RegistrationDAO dao;
	@Autowired
	@Qualifier("repoTwo")
	BalanceDAO bdao;
	@Autowired
	Balance b;
	@Autowired
	Login l;
	@Autowired
	LoginDAO ldao;
	String regex="^[a-zA-Z\\\\s]*$";
	Pattern p=Pattern.compile(regex);
	@RequestMapping("/")
	public String Home()
	{
		return "index.jsp";
	}
	@RequestMapping("/postDetails")
	@ResponseBody
	public String addToTable(Registration r,HttpSession session)
	{
		session.setAttribute("name", r.getFIRSTNAME()+" "+r.getMIDDLENAME()+" "+r.getLASTNAME());
		session.setAttribute("mobile", r.getMOBILE());
		session.setAttribute("email", r.getEMAIL());
		session.setAttribute("dob", r.getDOB());
		session.setAttribute("pan", r.getPANCARD());
		session.setAttribute("aadhar", r.getAADHAR());
		session.setAttribute("accountnum", r.getACCOUNTNUM());
		session.setAttribute("customerid",r.getCUSTOMERID());
		session.setAttribute("address",r.getDOORNO()+" "+r.getHOUSENAME()+" "+r.getSTREET()+" "+r.getAREA()+" "+r.getCITY()+" "+r.getCOUNTRY());
		if(r.getFIRSTNAME()==null)
		{
			return "first Name cannot be null";
		}
		Matcher m=p.matcher(r.getFIRSTNAME());
		if(m.matches()==false)
		{
			return "Not valid FirstName";
		}
		Matcher m1=p.matcher(r.getMIDDLENAME());
		if(m1.matches()==false)
		{
			return "Not valid MiddleName";
		}
		if(r.getLASTNAME()==null)
		{
			return "Last Name cannot be null";
		}
		Matcher m2=p.matcher(r.getLASTNAME());
		if(m2.matches()==false)
		{
			return "Not valid Last Name";
		}
		String mob=String.valueOf(r.getMOBILE());
		if(mob.length()!=10)
		{
			return "Mobile number has to be 10 digits";
		}
		String aadhar=String.valueOf(r.getAADHAR());
		if(aadhar.length()!=12)
		{
			return "AAdhar number has to be 12 digits";
		}
		if(r.getPWD()==null)
		{
			return "Password cannot be null";
		}
		String regex1="^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		Pattern pattern=Pattern.compile(regex1);
		Matcher mpass=pattern.matcher(r.getPWD());
		if(mpass.matches()==false)
		{
			return "Not Strong password";
		}
		if(r.getPWD().equals(r.getCONFIRMPWD())==false)
		{
			return "Password mismtach error";
		}
		dao.save(r);
		long balance=(long)Math.floor((Math.random()*100000)+1);
		b.setBANKBALANCE(balance);
		b.setACCOUNTNUMBER(r.getACCOUNTNUM());
		bdao.save(b);
		l.setCUSTID(r.getCUSTOMERID());
		l.setPWD(r.getPWD());
		ldao.save(l);
		return "Successfully Updated!Now please Login";
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
			return "wrong password";
	}
	@RequestMapping("/forgotPwd")
	@ResponseBody
	public String ForgotPassword(Login l)
	{
		if(ldao.existsByCUSTID(l.getCUSTID()))
				{
					return ldao.fetchPWD(l.getCUSTID());
				}
		else
		{
			return "No such Customer Id present,Please create a new Account!";
		}
	}
}
