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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;

public class ClassDefinitions {
	
	private WebDriver driver;
	
	public ClassDefinitions(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void Chrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void Firefox() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Firefox Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void IE() {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"\\Drivers\\IEDriverServer.exe");
		InternetExplorerOptions capabilities = new InternetExplorerOptions();
		capabilities.ignoreZoomSettings();
		driver = new InternetExplorerDriver(capabilities);
		//driver = new InternetExplorerDriver();
		System.out.println("IE Launched");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	public void URL(String url) {
		
		this.driver.get(url);
	}
	

//	public void Element_ID(String id) {
//		this.driver.findElement(By.id(id));
//	}
//
//	public void Element_Xpath(String xpath) {
//		this.driver.findElement(By.xpath(xpath));
//	}
	
	public void getInput(String locator, String value, String data) {
		String locate = locator.toLowerCase();
		switch (locate){
		case "xpath":
			this.driver.findElement(By.xpath(value));
			break;
		case "name":
			this.driver.findElement(By.name(value));
			break;
		case "cssselector":
			this.driver.findElement(By.cssSelector(value));
			break;
		case "id":
			this.driver.findElement(By.id(value));
			break;
		case "linktext":
			this.driver.findElement(By.linkText(value));
			break;
		case "tagname":
			this.driver.findElement(By.tagName(value));
			break;
		case "classname":
			this.driver.findElement(By.className(value));
			break;
		}
	}
	
	public WebElement click(String locator, String value) {
		WebElement element=null;
		String locate = locator.toLowerCase();
		switch (locate){
		case "xpath":
			element = this.driver.findElement(By.xpath(value));
			break;
		case "name":
			element= this.driver.findElement(By.name(value));
			break;
		case "cssselector":
			element=this.driver.findElement(By.cssSelector(value));
			break;
		case "id":
			element=this.driver.findElement(By.id(value));
			break;
		case "linktext":
			element=this.driver.findElement(By.linkText(value));
			break;
		case "tagname":
			element=this.driver.findElement(By.tagName(value));
			break;
		case "classname":
			element=this.driver.findElement(By.className(value));
			break;
		}
		return element;
	}
	
	public void sendData() {
		
	}
	
	
	
	public void implicit() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	
	
//	public void Click_Xpath(String xpath) {
//		this.driver.findElement(By.xpath(xpath)).click();;
//	}
//	public void Click_id(String id) {
//		this.driver.findElement(By.id(id)).click();;
//	}
//	
	

	public void close() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

	public void enterData(String string, WebElement ele) {
		
	}

	
	
}
