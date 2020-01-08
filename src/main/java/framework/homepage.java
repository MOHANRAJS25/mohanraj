package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends base {
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath = "(//li//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath = "(//li//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomenpage1()
	{
		return Women;
	}
	public WebElement getDressespage()
	{
		return Dresses;
	}
	public WebElement getTshirtspage()
	{
		return Tshirts;
	}
	
	public void clickwomen()
	{
		Women.click();
	}
	public void clickdresses()
	{
		Dresses.click();
	}
	public void clickTshirt()
	{
		Tshirts.click();
	}
	}
	
	
	
		
		
		
	
	
	
	
	
	
	