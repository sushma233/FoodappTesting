package Users;
import org.testng.annotations.Test;

import base.BaseTest;
import sourcepages.HelpPage;
public class HelpTest extends BaseTest { 
	
	@Test
	public void VerifyHelp() throws  InterruptedException{
		HelpPage helpage=new HelpPage(webDriver);
		helpage.verify();
		Thread.sleep(2000);
		helpage.verifysupport();
		Thread.sleep(2000);
		helpage.verifyQ1();
		Thread.sleep(2000);
		helpage.verifyQ2();
		Thread.sleep(2000);
		helpage.verifyfaq();
		Thread.sleep(2000);
		helpage.verifyq1();
		Thread.sleep(2000);
		helpage.verifyq2();
		Thread.sleep(2000);
		helpage.verifyq3();
		Thread.sleep(2000);
		
}
}


