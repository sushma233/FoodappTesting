package sourcepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
WebDriver webDriver;
	
	public Loginpage2(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/form/button")
	WebElement loginButton;
	
	public void setUserName(String uname) {
		if(uname.isBlank())
			username.clear();
		username.sendKeys(uname);
		
	}
	public void setPassword(String pwd) {
		if(pwd.isBlank())
			password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
