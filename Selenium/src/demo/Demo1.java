package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		int a=10;int b=20;
		int c=a+b;
		System.out.println(c);
		

	}


//Declaration 

/*public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//for organisation

@FindBy(linkText="Organizations")
private WebElement moduleNameOrg;

public WebElement getModuleNameOrg() {
	return moduleNameOrg;
}
	public void clickOnOrganisation() {
		moduleNameOrg.click();*/
	}


