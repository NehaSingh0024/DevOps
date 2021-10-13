package login;

import java.io.FileInputStream;
import java.util.Properties;

public class App {

	public boolean userLogin(String username, String password) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/main/resources/credentials.property"));
		
		String urn = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		if(urn.equals(username) && pwd.equals(password))
			return true;
		else
			return false;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
