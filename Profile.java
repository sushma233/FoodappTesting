package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import sourcepages.ProfilePage;

public class Profile extends BaseTest{
	@Test(priority=1)
	 public void VerfiyData() throws InterruptedException{
		ProfilePage profilePage=new ProfilePage(webDriver);
		profilePage.verifyUser();
		Thread.sleep(2000);
		profilePage.verifyProfile();
		Thread.sleep(2000);
		
		
		WebElement firstNameField =webDriver.findElement(By.id("firstName"));
		firstNameField.clear();
		firstNameField.sendKeys("Rsushma");
		
		Thread.sleep(2000);
		
		//Thread.sleep(2000);
		profilePage.clickOnSaveBtn();
		Thread.sleep(2000);
		profilePage.clickOnOkBtn();
		webDriver.navigate().refresh();
	
	}
	
	@Test(priority=2)
	public void Verfiycancel() throws InterruptedException{
		ProfilePage profilePage=new ProfilePage(webDriver);
		webDriver.navigate().refresh();
		//profilePage.verifyUser();
		Thread.sleep(2000);
		//profilePage.verifyProfile();
		Thread.sleep(2000);
		WebElement firstNameField =webDriver.findElement(By.id("firstName"));
		firstNameField.clear();
		firstNameField.sendKeys("sushma");
		
		Thread.sleep(2000);
		
		//Thread.sleep(2000);
		//profilePage.clickOnSaveBtn();
		//Thread.sleep(2000);
		profilePage.clickOncancelBtn();
			}
}
