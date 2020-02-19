package com.capgemini.bank.dao;

import com.capgemini.bank.service.*;
import com.capgemini.bank.util.CollectionUtil;
import com.capgemini.bank.service.*;

public class UserDataDAO 
{
	CollectionUtil colu = new CollectionUtil();
	
	public void putData(String accounttype,String accountNo,String accountStatus,double balance)
	{
		colu.collectionUtil(accounttype,accountNo,accountStatus,balance);
		
	}
	public void getdata(String a)
	{
		colu.getdata(a);
	}
	public void deleteData(String acno)
	{
		colu.deleteData(acno);
		
	}

	public boolean isvalid(String acno) {
		return colu.isvalid(acno);
		
	}	
	}
	


