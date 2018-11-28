package com.capg.basicform;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	private FormPageFactory fact;
	private WebDriver driver;

@Given("^check company user name$")
public void check_company_user_name() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in user names text box$")
public void enter_empty_value_in_user_names_text_box() throws Throwable {
	fact.setCompanyname("");
	Thread.sleep(2000);
	fact.setStorebutton();

}

@Then("^print error message for company name field$")
public void print_error_message_for_company_name_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check user name$")
public void check_user_name() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in user name text box$")
public void enter_empty_value_in_user_name_text_box() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("");
	fact.setStorebutton();
}

@Then("^print error message for name field$")
public void print_error_message_for_name_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check user cityname$")
public void check_user_cityname() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in city text box$")
public void enter_empty_value_in_city_text_box() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("Dheeraj");
	fact.setCityname("");
	fact.setStorebutton();
}

@Then("^print error message for city field$")
public void print_error_message_for_city_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check user password$")
public void check_user_password() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in password text box$")
public void enter_empty_value_in_password_text_box() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("Dheeraj");
	fact.setCityname("Hyderabad");
	fact.setPassword("");
	fact.setStorebutton();
}

@Then("^print error message for password field$")
public void print_error_message_for_password_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check user selection$")
public void check_user_selection() throws Throwable {
    
}

@When("^enter empty value in radio box$")
public void enter_empty_value_in_radio_box() throws Throwable {
  
}

@Then("^print error message for radio box$")
public void print_error_message_for_radio_box() throws Throwable {
   
}

@Given("^check user selections$")
public void check_user_selections() throws Throwable {
    
}

@When("^enter empty value in all selection$")
public void enter_empty_value_in_all_selection() throws Throwable {
   
}

@Then("^print error message for selection field$")
public void print_error_message_for_selection_field() throws Throwable {
   
}

@Given("^check text area$")
public void check_text_area() throws Throwable {
   
}

@When("^enter empty value in text area$")
public void enter_empty_value_in_text_area() throws Throwable {
   
}

@Then("^print error message for text area field$")
public void print_error_message_for_text_area_field() throws Throwable {
    
}

@Given("^check my number field$")
public void check_my_number_field() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in my number field$")
public void enter_empty_value_in_my_number_field() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("Dheeraj");
	fact.setCityname("Hyderabad");
	fact.setPassword("12345");
	fact.setMynumber("");
	fact.setStorebutton();
}

@Then("^print error message for my number field$")
public void print_error_message_for_my_number_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check email field$")
public void check_email_field() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in email field$")
public void enter_empty_value_in_email_field() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("Dheeraj");
	fact.setCityname("Hyderabad");
	fact.setPassword("12345");
	fact.setMynumber("20");
	fact.setEmail("");
	fact.setStorebutton();
}

@Then("^print error message for email field$")
public void print_error_message_for_email_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	driver.close();
}

@Given("^check mobilenumber field$")
public void check_mobilenumber_field() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	fact = new FormPageFactory(driver);
	driver.get("D:\\Spring sir Workspace\\basicform\\src\\com\\capg\\basicform\\basicform.html");

}

@When("^enter empty value in mobilenumber field$")
public void enter_empty_value_in_mobilenumber_field() throws Throwable {
	fact.setCompanyname("Capgemini");
	fact.setUsername("Dheeraj");
	fact.setCityname("Hyderabad");
	fact.setPassword("12345");
	fact.setMynumber("876848674");
	fact.setEmail("pdheeraj@gmail.com");
	fact.setMobilenumber("");
	fact.setStorebutton();
}

@Then("^print error message for mobilenumber field$")
public void print_error_message_for_mobilenumber_field() throws Throwable {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("alert :: "+alertMessage);
	Thread.sleep(2000);
	
	driver.close();
}


}
