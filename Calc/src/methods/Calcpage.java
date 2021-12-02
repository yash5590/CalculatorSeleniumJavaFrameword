package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import okio.Timeout;

public class Calcpage {
	 static WebDriver driver;
	 
	 static ExtentHtmlReporter htmlReporter;
	 static ExtentReports extent;
	 static ExtentTest test;
	 public static void launchBrowser() {
	 
	 try {
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		    extent=new ExtentReports();
		    extent.attachReporter(htmlReporter);
		    test = extent.createTest("MyFirstTest", "Sample description");
	        test.log(Status.INFO, "This step shows usage of log(status, details)");
	        test.info("This step shows usage of info(details)");
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
	        test.addScreenCaptureFromPath("screenshot.png");
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");	

	     } 
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }  
	 } 
	

	public static void selectDropdownBuild()
	{
		try {
			   test = extent.createTest("My2ndTest", "Sample description");
		        test.log(Status.INFO, "This step shows usage of log(status, details)");
		        test.info("This step shows usage of info(details)");
		        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
		        test.addScreenCaptureFromPath("screenshot.png");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select dropdownvalue = new Select(driver.findElement(By.id("selectBuild")));	
	  		dropdownvalue.selectByVisibleText("2");	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void selectFirstNo()
	{
		try {
			test = extent.createTest("My3rdTest", "Sample description");
	        test.log(Status.INFO, "This step shows usage of log(status, details)");
	        test.info("This step shows usage of info(details)");
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
	        test.addScreenCaptureFromPath("screenshot.png");
			driver.findElement(By.id("number1Field")).sendKeys("10");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
		public static void selectSecondNo()
		{
			try {
				test = extent.createTest("My4thTest", "Sample description");
		        test.log(Status.INFO, "This step shows usage of log(status, details)");
		        test.info("This step shows usage of info(details)");
		        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
		        test.addScreenCaptureFromPath("screenshot.png");
				driver.findElement(By.id("number2Field")).sendKeys("10");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
			public static void selectOperation()
			{
				try {
					test = extent.createTest("My5thTest", "Sample description");
			        test.log(Status.INFO, "This step shows usage of log(status, details)");
			        test.info("This step shows usage of info(details)");
			        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
			        test.addScreenCaptureFromPath("screenshot.png");
					Select dropdownvalue1 = new Select(driver.findElement(By.id("selectOperationDropdown")));	
			  		dropdownvalue1.selectByVisibleText("Multiply");
			  		driver.findElement(By.id("calculateButton")).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
	
				
				public static void validateAnswer()
				{
					try {test = extent.createTest("My6thTest", "Sample description");
			        test.log(Status.INFO, "This step shows usage of log(status, details)");
			        test.info("This step shows usage of info(details)");
			        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
			        test.addScreenCaptureFromPath("screenshot.png");
						WebElement element = 
					    driver.findElement(By.id("numberAnswerField"));
							  if (element.getAttribute("value").equals("100"))
							     System.out.println("Match found");
							    else 
							     System.out.println("Match Not found");
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				public static void selectIntegerOnlyAndClearBtn()
				{
					try {
						test = extent.createTest("My7thTest", "Sample description");
				        test.log(Status.INFO, "This step shows usage of log(status, details)");
				        test.info("This step shows usage of info(details)");
				        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());		        
				        test.addScreenCaptureFromPath("screenshot.png");
						driver.findElement(By.id("integerSelect")).click();
						driver.findElement(By.id("clearButton")).click();
						extent.flush();	
						driver.quit();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				
			
	}
	
	
	
	


