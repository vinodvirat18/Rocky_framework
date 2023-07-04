package testscript;


import org.testng.annotations.Test;

import generic.Data_Fetch;
import generic.Generic_Script;
import pom.Pom_Script;

public class Execute_Script extends Generic_Script {
	@Test
	public void login() {
	String un=Data_Fetch.fetchdata("Sheet1",0,0);
	String pwd=Data_Fetch.fetchdata("Sheet1",0,1);

	Pom_Script p = new Pom_Script(driver);
	p.email(un);

	p.pass(pwd);
	p.login();
	
	
	}

}
