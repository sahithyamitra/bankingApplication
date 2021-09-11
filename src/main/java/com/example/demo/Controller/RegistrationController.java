package com.example.demo.Controller;


import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.DAO.BalanceDAO;
import com.example.demo.DAO.RegistrationDAO;
import com.example.demo.model.ChangePWD;
import com.example.demo.model.Registration;

@Controller
public class RegistrationController {
	@Autowired
	BalanceDAO bdao;
	@Autowired
	RegistrationDAO dao;
	HttpSession session;
	@RequestMapping("/")
	public String Home()
	{
		return "index.jsp";
	}
	@RequestMapping("/postDetails")
	public String addToTable(Registration r)
	{
		dao.save(r);
		/*session.setAttribute("name", r.getFIRSTNAME()+" "+r.getMIDDLENAME()+" "+r.getLASTNAME());
		session.setAttribute("mobile", r.getMOBILE());
		session.setAttribute("email", r.getEMAIL());
		session.setAttribute("dob", r.getDOB());
		session.setAttribute("address", r.getDOORNO()+" "+r.getHOUSENAME()+" "+r.getSTREET()+" "+r.getAREA()+" "+r.getDISTRICT()+" "+r.getCITY()+" "+r.getCOUNTRY());
		session.setAttribute("account", r.getACCOUNTNUM());
		session.setAttribute("customerid", r.getCUSTOMERID());
		session.setAttribute("pan", r.getPANCARD());
		session.setAttribute("aadhar", r.getAADHAR());*/
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
	/*@RequestMapping("/checkBalance")
	@ResponseBody
	public String CheckAccBalance(Balance b)
	{
		if(b.getAccountNum()!=null)
		{
			System.out.println("inside getacc");
			b.setBalanceId(bal++);
		}
		if(bdao.findByAccountNum(b.getAccountNum())!=null)
		{
			System.out.println("inside if");
			Balance lbal=bdao.findByBalance(b.getAccountNum());
			if(lbal.getBankBalance()!=0)
			{
				return "balance"+lbal.getBankBalance();
			}
		}
		return "record not found";
	}*/
}
