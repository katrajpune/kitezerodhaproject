package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{




		@Test(priority = 1)
		public void loginWithValidCreds()
		{
			lp.loginToApp();
		}


		@Test(priority= 2)
		public void actualLogin()
		{
			lp.Enterpin();
			Assert.assertEquals(true, false);
		}


}