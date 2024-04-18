package sourcepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver webDriver;
	
	
	public ProfilePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	
	
	@FindBy(id="navbarDropdown")
	WebElement user;
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-header/div/div[2]/ul/li[2]/app-profile/li/div/a[1]")
	WebElement profile;
	@FindBy(id="firstname")
	WebElement first;
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="/html/body/app-root/app-user-profile/div/div/div/form/div[6]/button[1]")
	WebElement  saveBtn;
	@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	WebElement okBtn;
	@FindBy(xpath="/html/body/app-root/app-user-profile/div/div/div/form/div[6]/button[2]")
	WebElement cancelBtn;
	
	public void verifyUser()
	{
		user.click();
	}
	public void verifyProfile()
	{
		profile.click();
	}
	
	public void setfirstName(String fname) {
		
		if(fname.isBlank())
			first.clear();
	
		first.sendKeys(fname);
	}
	
	public void setemail(String mail) {
		if(mail.isBlank())
			email.clear();
		email.sendKeys(mail);
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	public void clickOnOkBtn()
	{
		okBtn.click();
	}
	public void clickOncancelBtn()
	{
		cancelBtn.click();
	}
	
}
