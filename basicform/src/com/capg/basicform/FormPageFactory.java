package com.capg.basicform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPageFactory {
	private WebDriver wd;

	public FormPageFactory(WebDriver webdriver) {
		this.wd = webdriver;
		PageFactory.initElements(wd, this);
	}

	public FormPageFactory() {
	}

	@FindBy(xpath="//*[@id=\"element1\"]")
	@CacheLookup
	WebElement companyname;

	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;

	@FindBy(name = "city")
	@CacheLookup
	WebElement cityname;
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "/html/body/center/form/input[5]")
	@CacheLookup
	WebElement gender;

	@FindBy(name = "lang")
	@CacheLookup
	WebElement language;

	@FindBy(xpath = "/html/body/center/form/textarea")
	@CacheLookup
	WebElement hidden;

	@FindBy(xpath = "/html/body/center/form/input[11]")
	@CacheLookup
	WebElement mynumber;

	@FindBy(xpath = "/html/body/center/form/input[12]")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "/html/body/center/form/input[13]")
	@CacheLookup
	WebElement mobilenumber;

	@FindBy(xpath = "/html/body/form/input[15]")
	@CacheLookup
	WebElement storebutton;


	public void setWd(WebDriver wd) {
		this.wd = wd;
	}

	public void setCompanyname(String companyname) {
		this.companyname.sendKeys(companyname);
	}

	public void setUsername(String string) {
		this.username.sendKeys(string);
	}

	public void setCityname(String string) {
		this.cityname.sendKeys(string);
	}

	public void setPassword(String string ) {
		this.password.sendKeys(string);
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public void setLanguage(WebElement language) {
		this.language = language;
	}

	public void setHidden(WebElement hidden) {
		this.hidden = hidden;
	}

	public void setMynumber(String string ) {
		this.mynumber.sendKeys(string);;
	}

	public void setEmail(String string) {
		this.email.sendKeys(string);;
	}

	public void setMobilenumber(String string) {
		this.mobilenumber.sendKeys(string);;
	}

	public void setStorebutton() {
		storebutton.click();
	}


}
