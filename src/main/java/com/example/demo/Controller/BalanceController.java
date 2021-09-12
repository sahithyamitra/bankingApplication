package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DAO.BalanceDAO;

@Controller
public class BalanceController {
	@Autowired
	@Qualifier("repoTwo")
	BalanceDAO bdao;
	@RequestMapping("/checkBalance")
	@ResponseBody
	public String CheckAccBalance(long ACCOUNTNUMBER)
	{
		String bal=bdao.fetchBANKBALANCE(ACCOUNTNUMBER);
		if(bal!=null)
		{
			return bal;
		}
		else
		{
			return "Account Number is Wrong";
		}
	}
	@RequestMapping("/Transfer")
	@ResponseBody
	public String MoneyTransfer(long FAccountNumber,long TAccountNumber,long Amount)
	{
		String balance=bdao.fetchBANKBALANCE(FAccountNumber);
		if(balance!=null)
		{
		long bal=Long.parseLong(balance);
		if(bal<Amount)
		{
			return "Balance is less than Amount";
		}
		else if(bdao.fetchACCOUNTNUMBER(TAccountNumber).isEmpty())
		{
			return "Not valid To Account Number";
		}
		else
		{
			bdao.addAmount(TAccountNumber, Amount);
			bdao.removeAmount(FAccountNumber, Amount);
			return "Successfully updated";
		}
		}
		else
		{
			return "Record is null";
		}
	}
}
