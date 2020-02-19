package com.capgemini.bank.util;


import java.util.HashMap;
import java.util.Map;

import com.capgemini.bank.*;
import com.capgemini.bank.bean.AccountDetails;


public class CollectionUtil
{
		
	Map<String,AccountDetails> userdata=new HashMap<String,AccountDetails>();
	
	public CollectionUtil() 
	{
		userdata.put("983901003136",new AccountDetails("Savings",1000.00,"983901003136","open"));
		userdata.put("983901003135",new AccountDetails("Student Account",1000.00,"983901003136","open"));
		userdata.put("983901003134",new AccountDetails("Zero Balance Account",1000.00,"983901003136","open"));
		userdata.put("983901003133",new AccountDetails("Savings",1000.00,"983901003136","open"));
		userdata.put("983901003132",new AccountDetails("Student Account",1000.00,"983901003136","open"));
		userdata.put("983901003131",new AccountDetails("Savings",1000.00,"983901003136","open"));
		userdata.put("983901003139",new AccountDetails("Zero Balance Account",1000.00,"983901003136","open"));
		userdata.put("983901003138",new AccountDetails("Student Account",1000.00,"983901003136","open"));
	}
	public  Map<String, AccountDetails> details()
	{
		return userdata;
	}
	public void collectionUtil(String accounttype,String accountNo,String accountStatus,double balance)
	
	{
		userdata.put(accountNo,new AccountDetails(accounttype,balance,accountNo,accountStatus));
	}
	
	
	public void getdata(String a)
	{
		System.out.println(userdata.get(a));
		
	}
	public void deleteData(String acno)
	{
		userdata.remove(acno);
		
	}
	public boolean isvalid(String aa)
	{
		return userdata.containsKey(aa);
		
	}
	public void abcd(String acno) 
	{
	userdata.get(acno);	
	}
}
	
