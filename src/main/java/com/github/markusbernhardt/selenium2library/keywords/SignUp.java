package com.github.markusbernhardt.selenium2library.keywords;

 /** Author : Arun Bharath Krishnan
 * email : abharath@ecentricarts.com
 * QA Url : http://shredit-qa.ecentricarts.com/en-us/secure-shredding-services/hard-drive-destruction
 * */
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import com.github.markusbernhardt.selenium2library.RunOnFailureKeywordsAdapter;
import com.github.markusbernhardt.selenium2library.utils.WebDriverCache;

@RobotKeywords
public class SignUp extends RunOnFailureKeywordsAdapter {
	
	
	protected static BrowserManagement browserManagement =  new BrowserManagement();
	
	protected WebDriver webdriver = browserManagement.getCurrentWebDriver();
	
	@RobotKeyword
	public void homeSignUp() {
		
		Waiting.waitForPageLoaded();
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl12_SIR_StayInformedForm_BizForm_FirstName_txtText']")).sendKeys("TestQA");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl12_SIR_StayInformedForm_BizForm_LastName_txtText']")).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl12_SIR_StayInformedForm_BizForm_Email_txtText']")).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl12_SIR_StayInformedForm_BizForm_Company_txtText']")).sendKeys("Ecentricarts");
        webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl12_SIR_StayInformedForm_BizForm_btnOK']")).click();
		
	}
	
	/*	@RobotKeyword
	public void shreddingServicesSignUp() {
		
		Waiting.waitForPageLoaded();
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl08_SIR_StayInformedForm_BizForm_FirstName_txtText']")).sendKeys("TestQA");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl08_SIR_StayInformedForm_BizForm_LastName_txtText']")).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl08_SIR_StayInformedForm_BizForm_Email_txtText']")).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl08_SIR_StayInformedForm_BizForm_Company_txtText']")).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(".//*[@id='p_lt_ctl12_pageplaceholder_p_lt_ctl08_SIR_StayInformedForm_BizForm_btnOK']")).click();
	}
	*/
/*	public void pricingSignUp() {
		
		Waiting.waitForPageLoaded();
		webdriver.findElement(By.xpath(SignUpXpath.pricingFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.pricingLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.pricingEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.pricingCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.pricingSignUpButtonXpath)).click();
	}
	
	public void resourceCenterSignUp() {
		
		Waiting.waitForPageLoaded();
		webdriver.findElement(By.xpath(SignUpXpath.resourceFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.resourceLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.resourceEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.resourceCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.resourceSignUpButtonXpath)).click();
	}
	
	public void aboutAndFaqsSignUp() {
		
		Waiting.waitForPageLoaded();
		webdriver.findElement(By.xpath(SignUpXpath.aboutFirstNameXpath)).sendKeys("TestQA");
		webdriver.findElement(By.xpath(SignUpXpath.aboutLastNameXpath)).sendKeys("TestLastName");
		webdriver.findElement(By.xpath(SignUpXpath.aboutEmailXpath)).sendKeys("test@ecentricarts.com");
		webdriver.findElement(By.xpath(SignUpXpath.aboutCompanyXpath)).sendKeys("Ecentricarts");
		webdriver.findElement(By.xpath(SignUpXpath.aboutSignUpButtonXpath)).click();
	}
	*/
}
