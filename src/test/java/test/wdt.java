package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.base;
import framework.homepage;

public class wdt {

	base bp;
	homepage hp;

	public wdt()
	{
		bp = new base();
		hp = new homepage();
	}
	@Test
	public void verifywomenpage()  
	{
		Assert.assertTrue(hp.getwomenpage().isDisplayed());
	}
	
	@Test
	public void verifyDresses()
	{
		Assert.assertTrue(hp.getDressespage().isDisplayed());
	}
	
	@Test
	public void verifyTshirt()
	{
		Assert.assertTrue(hp.getTshirtspage().isDisplayed());
	}
	@Test
	public void toclick()
	{
		//hp.clickwomen();
		//Assert.assertTrue(hp.getTitlte().contains("Womens"));
		//hp.clickdresses();
		//Assert.assertTrue(hp.getTitlte().contains("Dresses"));
		hp.clickTshirt();
		Assert.assertTrue(hp.getTitlte().contains("Tshirt"));
	}
		
	}


