package allClasses;

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
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\BrowserDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	public void URL(String url) {
		
		this.driver.get(url);
	}

	public void Element_ID(WebDriver driver, String id) {
		driver.findElement(By.id(id));
	}

}
