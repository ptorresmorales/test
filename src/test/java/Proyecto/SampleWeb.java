package Proyecto;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleWeb {
	
	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
	    System.out.println(driver.getTitle());
	    System.out.print(driver.getCurrentUrl());
	    driver.quit();
	}

}
