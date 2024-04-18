package Users;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import sourcepages.RegisterPage;

public class Registeruser extends BaseTest {
	
	@Test(priority=1)
	public void verifyempty() throws InterruptedException {
	
		RegisterPage registerPage=new RegisterPage(webDriver);
		registerPage.verifyLogin();
		Thread.sleep(2000);
		registerPage.verifyRegister();
		Thread.sleep(2000);
	  // registerPage.verifyHeader();
	  // Thread.sleep(2000);
		registerPage.setfirstName("");
		Thread.sleep(2000);
		registerPage.setlastName("");
		Thread.sleep(2000);
		registerPage.setEmail("");
		Thread.sleep(2000);
		registerPage.setPassword("");
		Thread.sleep(2000);
		registerPage.setPhonenumber("");
		Thread.sleep(2000);
		registerPage.setaddress("");
		Thread.sleep(2000);
		registerPage.setcity("");
		Thread.sleep(2000);
		registerPage.setstate("");
		Thread.sleep(2000);
		registerPage.setcountry("");
		Thread.sleep(2000);
		registerPage.setpin("");
		registerPage.clickOnRegisterBtn();
		Thread.sleep(2000);
		registerPage.clickOkBtn();
		Thread.sleep(2000);
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/register";
		Assert.assertEquals(currUrl, expectedUrl);
		webDriver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void verifyInvalid() throws InterruptedException {
	
		RegisterPage registerPage=new RegisterPage(webDriver);
		webDriver.navigate().refresh();
		//registerPage.verifyLogin();
		//Thread.sleep(2000);
		//registerPage.verifyRegister();
		Thread.sleep(2000);
	  // registerPage.verifyHeader();
	  // Thread.sleep(2000);
		registerPage.setfirstName("sushma");
		Thread.sleep(2000);
		registerPage.setlastName("r");
		Thread.sleep(2000);
		registerPage.setEmail("sushma@gmail.com");
		Thread.sleep(2000);
		registerPage.setPassword("565645");
		Thread.sleep(2000);
		registerPage.setPhonenumber("3454647574");
		Thread.sleep(2000);
		registerPage.setaddress("sfsf");
		Thread.sleep(2000);
		registerPage.setcity("4");
		Thread.sleep(2000);
		registerPage.setstate("");
		Thread.sleep(2000);
		registerPage.setcountry("");
		Thread.sleep(2000);
		registerPage.setpin("");
		registerPage.clickOnRegisterBtn();
		Thread.sleep(2000);
		registerPage.clickOkBtn();
		Thread.sleep(2000);
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/register";
		Assert.assertEquals(currUrl, expectedUrl);
		
	}

	@Test(priority=3)
	public void verifyInvalidformat() throws InterruptedException {
	
		RegisterPage registerPage=new RegisterPage(webDriver);
		webDriver.navigate().refresh();
		//registerPage.verifyLogin();
		//Thread.sleep(2000);
		//registerPage.verifyRegister();
		Thread.sleep(2000);
	  // registerPage.verifyHeader();
	  // Thread.sleep(2000);
		registerPage.setfirstName("243545");
		Thread.sleep(2000);
		registerPage.setlastName("*&");
		Thread.sleep(2000);
		registerPage.setEmail("dsd@434");
		Thread.sleep(2000);
		registerPage.setPassword("44333");
		Thread.sleep(2000);
		registerPage.setPhonenumber("ddwerere");
		Thread.sleep(2000);
		registerPage.setaddress("435454");
		Thread.sleep(2000);
		registerPage.setcity("34355");
		Thread.sleep(2000);
		registerPage.setstate("35667");
		Thread.sleep(2000);
		registerPage.setcountry("898797");
		Thread.sleep(2000);
		registerPage.setpin("fdfdf");
		registerPage.clickOnRegisterBtn();
		Thread.sleep(2000);
		registerPage.clickOkBtn();
		Thread.sleep(2000);
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/register";
		Assert.assertEquals(currUrl, expectedUrl);
		
	}

	@Test(priority=4)
	public void verifyvalid() throws InterruptedException {
	
		RegisterPage registerPage=new RegisterPage(webDriver);
		webDriver.navigate().refresh();
		//registerPage.verifyLogin();
		//Thread.sleep(2000);
		//registerPage.verifyRegister();
		//Thread.sleep(2000);
	   // registerPage.verifyHeader();
	   // Thread.sleep(2000);
		registerPage.setfirstName("Sambrudhi");
		Thread.sleep(2000);
		registerPage.setlastName("shetty");
		Thread.sleep(2000);
		registerPage.setEmail("Sam@gmail.com");
		Thread.sleep(2000);
		registerPage.setPassword("Sambrudhi@21");
		Thread.sleep(2000);
		registerPage.setPhonenumber("6756464644");
		Thread.sleep(2000);
		registerPage.setaddress("nelamangala");
		Thread.sleep(2000);
		registerPage.setcity("bangalore");
		Thread.sleep(2000);
		registerPage.setstate("Karnataka");
		Thread.sleep(2000);
		registerPage.setcountry("India");
		Thread.sleep(2000);
		registerPage.setpin("562123");
		registerPage.clickOnRegisterBtn();
		Thread.sleep(2000);
		registerPage.clickOkBtn();
		Thread.sleep(2000);
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/register";
		Assert.assertEquals(currUrl, expectedUrl);
		
	}

}



			
			



