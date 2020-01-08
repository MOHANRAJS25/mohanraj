package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage1 {
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath = "(//label[@for='layered_id_attribute_group_1']")
	private WebElement sizeS; 
	
	@FindBy(xpath = "(//label[@for='layered_id_attribute_group_2']")
	private WebElement sizeM; 
	
	@FindBy(xpath = "(//label[@for='layered_id_attribute_group_3]")
	private WebElement sizeL; 
	
	public homepage1() {
		//PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomenpage()
	{
		return Women;
	}
	
	

}
