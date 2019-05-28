package junitTestCode;

import org.junit.Assert;
import org.junit.Test;

import junitDevCode.JunitMathCode;

public class JunitMathTest {
	
	@Test
	public void unitTest1()
	{
		JunitMathCode obj = new JunitMathCode();
		Assert.assertEquals(obj.getAbsVal(-1), 1);
	}
	
	@Test
	public void unitTest2()
	{
		JunitMathCode obj = new JunitMathCode();
		Assert.assertEquals(obj.getAbsVal(-2), 2);
	}
	
	@Test
	public void unitTest3()
	{
		JunitMathCode obj = new JunitMathCode();
		Assert.assertEquals(obj.getAbsVal(2), 2);
	}
}
