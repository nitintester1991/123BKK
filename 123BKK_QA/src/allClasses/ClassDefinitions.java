package allClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import transaction123.CreateMalaysiaTxn;

public class ClassDefinitions {
	
	private WebDriver driver;
	
	public ClassDefinitions(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void chrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void URL(String url) {
		
		this.driver.get(url);
	}

	public void Element_ID(String id) {
		this.driver.findElement(By.id(id));
	}

	public void Element_Xpath(String xpath) {
		this.driver.findElement(By.xpath(xpath));
	}
	
	public void Click_Xpath(String xpath) {
		this.driver.findElement(By.xpath(xpath)).click();;
	}

	public void close() {
		this.driver.close();
	}
 
	 //load/navigate a new web page
    public void navigatePage(String url) {
		this.driver.navigate().to(url);
	}
    
    //navigate on back
    public void navigateBack(String url) {
    	this.driver.navigate().back();
	}
    
    //navigate forward
    public void navigateForward(String url) {
    	this.driver.navigate().forward();
	}
    
   //refresh the current page
    public void refreshPage(String url) {
    	this.driver.navigate().refresh();
	}
    
    //Take screenshot 
 	public void getScreenShot() throws IOException {
 		TakesScreenshot ts = (TakesScreenshot) driver;
 		File src = ts.getScreenshotAs(OutputType.FILE);
 		File des = new File(System.getProperty("user.dir")+"\\ResultScreenshot\\screenshot_" + timeStamp() + ".png");
 		FileUtils.copyFile(src, des);
 	}
 	
 	//Take current system Time 
     public String timeStamp() {
 		Date d = new Date();
 		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy-hh_mm_ss");
 		String time = sd.format(d);
 		return time;
 	}
	
     //Get title of web page
     public String getTitle() {
 		String title = this.driver.getTitle();
 		return title;
 	}
     
   //Action class -hover on Web Element 
     public void moveAction(WebElement element) {
 		Actions a = new Actions(this.driver);
 		a.moveToElement(element).perform();
 	}

     //Switch to new tab 
     public void switchTab() {
  		ArrayList<String> tabs2 = new ArrayList<String>(this.driver.getWindowHandles());
  		this.driver.switchTo().window(tabs2.get(0));
  		this.driver.close();
  		this.driver.switchTo().window(tabs2.get(1));
  	}
}
