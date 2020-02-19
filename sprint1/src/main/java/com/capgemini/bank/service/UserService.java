package com.capgemini.bank.service;

import com.capgemini.bank.dao.UserDataDAO;

public class UserService
{
	 UserDataDAO dao=new UserDataDAO();
   public  void putData(String accounttype,String accountNo,String branchId,double balance) 
   {
	   dao.putData(accounttype,accountNo, branchId, balance);
	   
   }
   public void getdata(String a)
   {
	   dao.getdata(a);
   }
public void deleteData(String acno) 
{
	dao.deleteData(acno);	
}
public boolean isvalid(String acno) 
{
	
	return dao.isvalid(acno);
}
}
