package Webdriver_Arch;

import ExceptionHandling.MyException;

public class AmazonTest {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		//------------Top Casting: benifit is no need to comment n uncomment above browsers
		String browser = "opera"; // user/xml/excel
		WebDriver driver = null;
		
		//cross browser logic -- with top casting -- switch case/if else
		//initiate the driver only once
		//parallel run
		switch (browser.toLowerCase().trim()) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			break;
		}
		case "safari": {
			driver = new SafariDriver();
			break;
		}
		default:
			System.out.println("plz pass right browser..");
			throw new MyException("no browse found");
			
		}
		
		//---------------
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("title :" + title);
		if(title.equals("amazon")){
			System.out.println("title is passed");
		}
		else {
			System.out.println("title is failed");
		}
		String url = driver.getURL();
		System.out.println(url);
		driver.findElement("logo");
		driver.sendKeys("username", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbutton");
		driver.close();

	}

}
