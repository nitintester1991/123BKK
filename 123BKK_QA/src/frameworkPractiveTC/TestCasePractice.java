package frameworkPractiveTC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import allClasses.ClassDefinitions;

public class TestCasePractice {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		ClassDefinitions def = new ClassDefinitions(driver);
		
		def.Chrome();		
//		def.URL("http://automationpractice.com/index.php");
//		def.Click_Xpath("//a[@class='login']");

		def.URL("https://public.msrtcors.com/ticket_booking/index.php");
		def.implicit();
		
		
		
		
		def.close();
		
	}
}
