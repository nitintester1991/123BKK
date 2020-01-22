package transaction123;

import allClasses.ClassDefinitions;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateMalaysiaTxn {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		ClassDefinitions def = new ClassDefinitions(driver);
		
		def.Chrome();		
		def.URL("https://uat.123.co.th/DemoShopping/shopping.aspx");
		System.out.println("Site Launched");
		def.click("XPaTh", "//a[contains(text(),'Cancel')]");
		def.implicit();
		
		
		
//	
//		 WebElement btn=driver.findElement(By.xpath("//input[@id= 'ContentPlaceHolder2_btnPaint4']"));
//		 btn.click();
//		 WebElement btn1=driver.findElement(By.xpath("//input[@id= 'ContentPlaceHolder2_btnPaint3']"));
//		 btn1.click();
//		 WebElement btn2=driver.findElement(By.xpath("//input[@value= 'Check Out']"));
//		 btn2.click();
//		 Thread.sleep(2000);
//		 WebElement dropdownCountry = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder2_ddlCountry']"));
//		 Select drpCountry = new Select(dropdownCountry);
//	     drpCountry.selectByVisibleText("MALAYSIA");
//	     WebElement drpMerchantId = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder2_txtMerchantID']"));
//	     drpMerchantId.clear();
//	     WebElement drpMerchantId1 = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder2_txtMerchantID']"));
//	     drpMerchantId1.sendKeys("458458000000000");
//	     //WebDriverWait waitForElement = new WebDriverWait(driver, 2000);
//        WebElement element = driver.findElement(By.id("ContentPlaceHolder2_txtInvoiceNo"));
//	     element.click();
//	     //waitForElement.until(ExpectedConditions.visibilityOf(element));
//	     //Thread.sleep(5000);
//	     WebElement name = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder2_txtName']"));
//	     name.sendKeys("WaghMay");
//	     WebElement email = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder2_txtEmail']"));
//	     email.sendKeys("wagh.may@2c2pexternal.com");
//	     WebElement phone = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder2_txtMobile']"));
//	     phone.sendKeys("7798304862");
//	     WebElement dropdownAgentCode = driver.findElement(By.xpath("//select[@id='ContentPlaceHolder2_ddlAgentCode']"));
//		 Select drpAgentCode = new Select(dropdownAgentCode);
//		 drpAgentCode.selectByVisibleText("FPX_SBIA");
//		 WebElement GenerateXML=driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder2$btnXml']"));
//		 GenerateXML.click();
//		 WebElement POSTbtn=driver.findElement(By.xpath("//input[@value='Post to 1-2-3']"));
//		 POSTbtn.click();
//		 WebElement uname = driver.findElement(By.xpath("//input[@id='userId']"));
//	     uname.sendKeys("1234");
//	     WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
//	     pass.sendKeys("1234");
//	     WebElement submitbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//	     submitbtn.click();
//	     WebElement confirmbtn = driver.findElement(By.xpath("//button[text()='Confirm']"));
//	     confirmbtn.click();
//	     WebElement confirmTheTransaction = driver.findElement(By.xpath("//input[@name='Submit2']"));
//	     confirmTheTransaction.click();
//	     Thread.sleep(2000);
//		  TakesScreenshot ts = (TakesScreenshot) driver;
//		  File src = ts.getScreenshotAs(OutputType.FILE);
//		  File des = new File(System.getProperty("user.dir") +"\\ResultScreenshot\\screenshot.png");
//		  FileUtils.copyFile(src, des);
		
		System.out.println("Done");
		def.close();
		
	}



}


/*



*/


