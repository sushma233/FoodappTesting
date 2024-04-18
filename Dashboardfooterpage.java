package sourcepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardfooterpage {

WebDriver webDriver;
	
	public Dashboardfooterpage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath="/html/body/app-root/app-footer/div/div[1]/h3")
	WebElement food;
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[1]/a[1]")
	WebElement bundi;
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[1]/a[2]")
	WebElement tech;
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[3]/h3")
	WebElement company;
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[3]/a[1]")
	WebElement about;
	@FindBy(xpath="/html/body/app-root/app-footer/div/div[3]/a[2]")
	WebElement career;
	
	public void verifyfood()
	{
		food.getText();
	}
	public void verifybundi()
	{
		bundi.getText();
		
	}
	public void verifytech()
	{
		tech.getText();
		
	}
	
	public void verifytcompany()
	{
		company.getText();
		
	}
	public void verifytabout()
	{
		about.getText();
		
	}
	
	
}
