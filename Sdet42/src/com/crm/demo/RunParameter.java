package com.crm.demo;








public class RunParameter {
	
	@Test
	public void method()
	{
	String Browser=System.getProperty("browser");
	System.out.println(BROWSER);
	WebDriver driver;
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
    else if(BROWSER.equalsIgnoreCase("firefox")) {
    	WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
    else
    {
     driver=new ChromeDriver();
    }
	

}
