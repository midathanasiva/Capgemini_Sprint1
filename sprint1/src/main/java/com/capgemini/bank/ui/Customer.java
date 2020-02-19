package com.capgemini.bank.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.capgemini.bank.service.UserService;
import com.capgemini.bank.bean.AccountDetails;
import com.capgemini.bank.service.Validation1;

public class Customer
{
	Validation1 valid=new Validation1();
	UserService service=new UserService();
	AccountDetails accountdetails= new AccountDetails();
	public void putData() throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc=new Scanner(System.in);
		while(true)
		  {
	        System.out.println("1. TO DISPLAY YOU ACCOUNT BALANCE , ACCOUNT TYPE, ACCOUNT STATUS AND DELETING IF YOU WANT");
	        System.out.println("2. EXIT");
	        int choice = sc.nextInt();
	        switch( choice)
	             {
	             case 1:
	             {
	            	 System.out.println("ENTER 12-digit account number");
					while(true)
				{	
					String abcd=br.readLine();
					boolean b1 = valid.validateAccountNumber(abcd);
					if((b1==true) && (service.isvalid(abcd)))
					{
						service.getdata(abcd);
						System.out.println("do you want to delete this account Enter 1.\"yes\"   else  2. enter anything to stay with us");
				        int n = sc.nextInt();
				        if(n==1)
				         {
				           service.deleteData(abcd);
				         }
				            else
				            {
				            	System.out.println("your account is not deleted");
				            }
							break;
					}
					else
					{
						System.out.println("Enter valid 12 digit number || Enter Present Account number || Account id deleted so it cant display");
						
					}
	             }
					break;
					
	             }

				case 2:
				{
						System.out.println("Thank You have a nice day!");
					   System.exit(0);
	                   break;
				}

	            default:
	            	  System.out.println("Invalid choice");		
		}
		}
		}
public static void main(String[] args) throws IOException 
	{
		
		Customer customer=new Customer();
		System.out.println();
		customer.putData();
	 }

}
