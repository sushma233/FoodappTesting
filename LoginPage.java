package sourcepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver webDriver;
	
	
	public LoginPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "/html/body/app-root/app-register/app-header/div/div[2]/ul/li[2]/app-profile/li/a")
	WebElement Login;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="/html/body/app-root/app-login/div[2]/div/form/button")
	WebElement LoginButton;
	@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
	WebElement OK;
	


	public void verifyLogin()
	{
		Login.click();
	}
	
	public void setUserName(String uname) {
		if(uname.isBlank())
			email.clear();
		email.sendKeys(uname);
	
	}
	
	public void setPassword(String pwd) {
		if(pwd.isBlank())
			password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		LoginButton.click();
	}
	public void clickOnOkBtn()
	{
		OK.click();
	}
	
	
	
}
