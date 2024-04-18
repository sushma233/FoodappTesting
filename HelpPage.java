package sourcepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
WebDriver webDriver;
	
	public HelpPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath="/html/body/app-root/app-landing/app-header/div/div[2]/ul/li[1]/i")
	WebElement Help;
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[2]/ul/li[1]/a")
	WebElement support;
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[3]/div/ul/li[1]")
	WebElement Q1;
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[3]/div/ul/li[2]")
	WebElement Q2;
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[2]/ul/li[2]/a")
	WebElement faq;
	
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[3]/div/ul/li[1]")
	WebElement q1;
	
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[3]/div/ul/li[2]")
	WebElement q2;
	
	@FindBy(xpath="/html/body/app-root/app-support/div/div/div[3]/div/ul/li[3]")
	WebElement q3;
	
	public void verify()
	{
		Help.click();
	}
	public void verifysupport() {
		support.click();
		
	}
	public void verifyQ1() {
		Q1.click();
		Q1.getText();
		
	}
	
	public void verifyQ2() {
		Q2.click();
		Q2.getText();
		
	}
	
	public void verifyfaq() {
		faq.click();
		
	}
	public void verifyq1() {
		q1.click();
		q1.getText();
		
	}
	
	public void verifyq2() {
		q2.click();
		q2.getText();
		
	}
	
	public void verifyq3() {
		q3.click();
		q3.getText();
		
	}
}
