package sprint1Testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.capgemini.bank.service.Validation1;
public class Testing {
	Validation1 v1=new Validation1();
	@Test
	void test()
	{
		assertFalse(v1. validateAccountNumber("12345"));
	}
    @Test
	void test1()
	{
		assertTrue(v1. validateAccountNumber("123456789012"));
	}
    @Test
   	void test2()
   	{
   		assertFalse(v1. validateAccountNumber("983901003136"));
   	}
	@Test
   	void test3()
   	{
   		assertFalse(v1. validateAccountNumber("9839003136"));
	}
}
