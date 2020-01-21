package allClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

	

}
