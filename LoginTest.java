package Users;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import sourcepages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=1)
	public void verifyEmpty() throws InterruptedException {
		LoginPage loginPage=new LoginPage(webDriver);
		loginPage.verifyLogin();
		Thread.sleep(2000);
		loginPage.setUserName("");
		Thread.sleep(2000);
		loginPage.setPassword("");
		Thread.sleep(2000);
		loginPage.clickOnLoginBtn();
		webDriver.navigate().refresh();	
		
		
	}
	@Test(priority=2)
	public void verifyInvalid() throws InterruptedException {
		LoginPage loginPage=new LoginPage(webDriver);
		webDriver.navigate().refresh();	
		//loginPage.verifyLogin();
		loginPage.setUserName("sushma");
		Thread.sleep(2000);
		loginPage.setPassword("Sushma@21");
		Thread.sleep(2000);
		loginPage.clickOnLoginBtn();
		Thread.sleep(2000);
		loginPage.clickOnOkBtn();
	
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
		Assert.assertEquals(currUrl, expectedUrl);
		
		
	}
	
	@Test(priority=3)
	public void verifyInvalid1() throws InterruptedException {
		webDriver.navigate().refresh();
		LoginPage loginPage=new LoginPage(webDriver);
		//loginPage.verifyLogin();
		loginPage.setUserName("sushma");
		Thread.sleep(2000);
		loginPage.setPassword("");
		Thread.sleep(2000);
		loginPage.clickOnLoginBtn();
		Thread.sleep(2000);
		loginPage.clickOnOkBtn();
	
		String currUrl=webDriver.getCurrentUrl();
		String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
		Assert.assertEquals(currUrl, expectedUrl);
		
		
	}
	
	@Test(priority=4)
	public void verifyValid() throws InterruptedException {
		webDriver.navigate().refresh();
		LoginPage loginPage=new LoginPage(webDriver);
		//loginPage.verifyLogin();
		Thread.sleep(2000);
		loginPage.setUserName("Sam@gmail.com");
		Thread.sleep(2000);
		loginPage.setPassword("Sambrudhi@21");
		Thread.sleep(2000);
		loginPage.clickOnLoginBtn();
		Thread.sleep(2000);
		loginPage.clickOnOkBtn();
		Thread.sleep(2000);
		
		String currUrl=webDriver.getCurrentUrl();
		Thread.sleep(2000);
		String expectedUrl="http://localhost:4200/dashboard?isLoggedIn=true";
		Assert.assertEquals(currUrl, expectedUrl);
		
	}
	
}

