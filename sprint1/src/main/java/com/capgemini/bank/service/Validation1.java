package com.capgemini.bank.service;


import java.util.regex.Matcher;
import java.util.Date;

import java.util.regex.Pattern;


public class Validation1 
{		
		public  boolean validateAccountNumber(String accountNumberCreation) 
		{
			return accountNumberCreation.matches("[0-9]{12}");
		}
}

