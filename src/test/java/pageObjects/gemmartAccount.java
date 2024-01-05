package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gemmartAccount extends BasePage{
	
	public gemmartAccount(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath = "//*[@id=\\\"shopify-section-header-05\\\"]/sticky-header/header/div[1]/div/div/div[3]/div/div/a")
	WebElement signinbtn;
	
	@FindBy(xpath = "//*[@id=\\\"halo-auth-sidebar\\\"]/div[2]/form/div[3]/a[2]")
	WebElement accountbtn;
	
	@FindBy(xpath = "//input[@id='RegisterForm-FirstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='RegisterForm-LastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='RegisterForm-email']")
	WebElement emailaddress;
	
	@FindBy(xpath = "//input[@id='RegisterForm-password']")
	WebElement passwordgem;
	
	@FindBy(xpath = "//input[@value='Create An Account']")
	WebElement clickbtn;
	
	@FindBy(xpath="(//*[@class='halo-popup-wrapper']/button)[2]")
	WebElement popup;
	
	@FindBy(xpath="(//*[@id=\\\"recaptcha-anchor\\\"]/div[1]")
	WebElement captcha;
	
	@FindBy(xpath = "//*[@id='MainContent']/div/form/input[2]")
	WebElement sbmt;
	
	//Action methods
	public void clickSignin() {
		signinbtn.click();
	}
	
	public void clickAccountbtn() {
		accountbtn.click();
	}
	
	public void enterFirstname(String Fs) {
		firstname.sendKeys(Fs);
	}
	
	public void enterLastname(String Ls) {
		lastname.sendKeys(Ls);
	}
	
	public void enterEmail(String Ls) {
		lastname.sendKeys(Ls);
	}
	
	public void enterPassgem(String Ls) {
		lastname.sendKeys(Ls);
	}
	
	public void clickCreatebtn() {
		clickbtn.click();
	}
	
	public void popUp() {
		popup.click();
	}
	
	public void reCaptcha() {
		captcha.click();
		sbmt.click();
	}
	
	
	
	
	
	
	
	
	


}
