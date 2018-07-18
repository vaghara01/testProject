package testSelenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","E:\\SE driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		try {
		driver.get("https://www.google.com");
		boolean link=driver.findElement(By.linkText("Yahoo")).isDisplayed();
		if(link) {
			System.out.println("link present");
		} }catch(NoSuchElementException e) {
			System.out.println(" No such element exist");
		}
		finally {
			driver.close();
		}
			

	}

}
