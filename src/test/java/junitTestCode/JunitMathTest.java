package junitTestCode;

import org.junit.Assert;
import org.junit.Test;

import junitDevCode.JunitMathCode;
import junitDevCode.SquareCode;
import junitDevCodeDiffPkg.sqroot;

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
		Assert.assertEquals(obj.getAbsVal(2), 2);
	}
	
	@Test
	public void unitTest3()
	{
		SquareCode obj = new SquareCode();
		Assert.assertEquals(obj.getSquareVal(2), 4);
	}
	
	/*@Test
	public void unitTest4()
	{
		sqroot obj = new sqroot();
		Assert.assertEquals(obj.getSqrt(4), 2);
	}*/
	
	/*@Test
	public void unitTest5()
	{
		SquareCode obj = new SquareCode();
		Assert.assertEquals(obj.getCubeVal(4), 64);
	}*/
}
