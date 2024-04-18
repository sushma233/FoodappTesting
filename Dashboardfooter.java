package Users;

import org.testng.annotations.Test;

import base.BaseTest;
import sourcepages.Dashboardfooterpage;

public class Dashboardfooter extends BaseTest{
	
@Test(priority=1)
public void VerifyFoodfun() throws InterruptedException {
	Dashboardfooterpage footerpage=new Dashboardfooterpage(webDriver);
	footerpage.verifyfood();
	Thread.sleep(2000);
	footerpage.verifybundi();


}

}
