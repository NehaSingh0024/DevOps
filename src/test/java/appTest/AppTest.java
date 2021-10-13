package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test(description="Login with Valid Credentials")
  public void loginTestValidCreds() throws Exception {
	  App app = new App();
	  boolean status = app.userLogin("userdemo","password");
	  Assert.assertTrue(status);
	   
  }
  
  @Test(description="Login with Invalid Credentials")
  public void loginTestInvalidCreds() throws Exception {
	  App app = new App();
	  boolean status = app.userLogin("userdemo","password2424");
	  Assert.assertFalse(status);
	   
  }
}
