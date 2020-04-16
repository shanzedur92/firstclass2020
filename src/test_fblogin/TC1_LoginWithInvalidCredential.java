package test_fblogin;

import org.testng.annotations.Test;

import base.config;
import locators.fb_login_loc;
import values.fb_login_values;

public class TC1_LoginWithInvalidCredential extends config {

	fb_login_loc logIn=new fb_login_loc();
	 fb_login_values logInvalue=new  fb_login_values();
	
	
	
	@Test
	
	public void test_facebookIbvalidPassword() {

   typeByXpath (logIn.emailPhone , logInvalue.aa);
   typeByXpath (logIn.password, logInvalue.bb);
   ClickByXpath (logIn.loginButton);

		
		

		
	}

}