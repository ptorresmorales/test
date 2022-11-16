package Proyecto;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class Laboratorio2Test {
	
	@Test
	public void lab2_E1() {
		System.setProperty("webdriver.chrome.driver","..\\Proyecto\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//Escribir Correo y hacer clic en el btn Create Account
		
		
		//a)
		WebElement txtEmail=driver.findElement(By.id("email_create"));
		txtEmail.sendKeys("micorreo"+Math.random()+"@correo.com");
		
		//b)
		WebElement btnCreate=driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		btnCreate.click();
		
		//Completar formulario
		
		//g)
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'id_gender1')]")));
		driver.findElement(By.id("id_gender1")).click();
		
		//c)
		driver.findElement(By.name("customer_firstname")).sendKeys("Juan Torres"); 
		
		//d)
		driver.findElement(By.name("passwd")).sendKeys("123456"); 
		
		//e)
		Select months= new Select(driver.findElement(By.name("months")));
		
		months.selectByValue("4");
		//h)
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		
			
		driver.close();
		
	}

}