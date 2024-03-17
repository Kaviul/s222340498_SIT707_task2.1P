package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAVIUL\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		//sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.officeworks.com.au/app/identity/create-account");
		
		
		//driver.get("https://www.officeworks.com.au/app/identity/create-account");
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("MD KAVIUL");
		
		WebElement lastNameInput = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastNameInput);
		
		lastNameInput.sendKeys("HOSSAIN");
		
		WebElement emailID = driver.findElement(By.id("email"));
		System.out.println("Found element: " + emailID);
		
		emailID.sendKeys("kaviuln@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element " + phoneNumber);
		
		phoneNumber.sendKeys("0401234567");
		
//		WebElement clickSubmitButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
//		System.out.println("Found element: " + clickSubmitButton);
//		
//		clickSubmitButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button")));

        // Click the "Create Account" button
        createAccountButton.click();
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		
		// Sleep a while
		sleep(5);
		
		
		driver.get("https://www.facebook.com/reg/?next=%2FCreateAccount%2F");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		System.out.println("Found element: " + firstName);
		// Send first name
		firstName.sendKeys("MD KAVIUL");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		System.out.println("Found element: " + lastName);
		
		lastName.sendKeys("HOSSAIN");
		//sleep(2);
		
		WebElement emailAddress = driver.findElement(By.name("reg_email__"));
		System.out.println("Found element: " + emailAddress);
		
		emailAddress.sendKeys("01770000004");
		
		WebElement bd_day = driver.findElement(By.name("birthday_day"));
		System.out.println("Found element: " + bd_day);
		
		bd_day.sendKeys("26");
		
		WebElement bd_month = driver.findElement(By.name("birthday_month"));
		System.out.println("Found element: " + bd_month);
		
		bd_month.sendKeys("April");
		
		WebElement bd_year = driver.findElement(By.name("birthday_year"));
		System.out.println("Found element: " + bd_year);
		
		bd_year.sendKeys("1998");
		
		WebElement gender_radio2 = driver.findElement(By.name("sex"));
		System.out.println("Found element: " + gender_radio2);
		
		gender_radio2.click();
		
//		WebElement clickSignUpButton = driver.findElement(By.xpath("//*[@id=\"u_0_s_SW\"]"));
//		System.out.println("Found element: " + clickSignUpButton);
//		
//		clickSignUpButton.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement createAccountButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")));

        // Click the "Create Account" button
        createAccountButton1.click();
		
		sleep(10);
		// close chrome driver
		driver.close();	
	}
	
	
}
