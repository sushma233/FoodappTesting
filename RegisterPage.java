package sourcepages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver webDriver;
	
	
		public RegisterPage(WebDriver webDriver) {
			super();
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
		}
		
		
		@FindBy(xpath="/html/body/app-root/app-landing/app-header/div/div[2]/ul/li[2]/app-profile/li/a")
		WebElement Login;
		@FindBy(xpath="/html/body/app-root/app-login/div[2]/div/form/div/a[2]")
		WebElement Register;
		@FindBy(id="firstName")
		WebElement firstName;
		@FindBy(id="lastName")
		WebElement lastName;
		@FindBy(id="email")
		WebElement email;
		@FindBy(id="password")
		WebElement password;
		@FindBy(id="phoneNumber")
		WebElement phoneNumber;
	
		@FindBy(id="addressLine")
		WebElement addressLine;
		
		@FindBy(id="city")
		WebElement City;
		
		@FindBy(id="state")
		WebElement State ;
		
		@FindBy(id="country")
		WebElement Country ;
		
		@FindBy(id="pinCode")
		WebElement pinCode ;
		
		@FindBy(xpath="/html/body/app-root/app-register/div/div/form/button")
		WebElement registerBtn;
		
		@FindBy(xpath="/html/body/div/div/div[6]/button[1]")
		WebElement okBtn;
		
		
		public void verifyLogin() {
			Login.click();
		}
		public void verifyRegister() {
			Register.click();
		}
		

		
		
		public void setfirstName(String fname) {
			if(fname.isBlank())
				firstName.clear();
		firstName.sendKeys(fname);
		}
		public void setlastName(String lname) {
			if(lname.isBlank())
				lastName.clear();
			lastName.sendKeys(lname);
			}
		public void setEmail(String mail) {
			if(mail.isBlank())
				email.clear();
		email.sendKeys(mail);
		}
		public void setPassword(String arg1) {
			if(arg1.isBlank())
				password.clear();	
		password.sendKeys(arg1);
		}
		public void setPhonenumber(String phno) {
			if(phno.isBlank())
				phoneNumber.clear();	
	phoneNumber.sendKeys(phno);
			}
		
		public void setaddress(String addrs) {
			if(addrs.isBlank())
				addressLine.clear();	
			addressLine.sendKeys(addrs);
			}
		

		public void setcity(String city) {
			if(city.isBlank())
				City.clear();	
	City.sendKeys(city);
			}
		
		public void setstate(String state) {
			if(state.isBlank())
				State.clear();	
	State.sendKeys(state);
			}
		

		public void setcountry(String country) {
			if(country.isBlank())
				Country.clear();	
	Country.sendKeys(country);
			}
		
		public void setpin(String code) {
			if(code.isBlank())
				pinCode.clear();	
	pinCode.sendKeys(code);
			}
		
		public void clickOnRegisterBtn() {
			registerBtn.click();
		}	
		public void clickOkBtn() {
			okBtn.click();
		}	
	}
	

