package Selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {
		static WebDriver driver;
	public static void main(String[] args) throws Exception {
	    driver = new ChromeDriver();
		
		driver.get("https://codoid.com/careers/");
		screenShot("application");
		
		driver.findElement(By.xpath("//input[@id='joinusname']")).sendKeys("Kumaravel");
		screenShot("name");
		
		driver.findElement(By.xpath("//input[@id='joinusemail']")).sendKeys("kumaravel19980@gmail.com");
		screenShot("mail-id");
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='joinusrole']")));
		dropdown1.selectByIndex(1);
		screenShot("role");
		
		driver.findElement(By.xpath("//input[@name='joinusphone1']")).sendKeys("9943685429");
		screenShot("number");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@name='joinusexperience']")));
		dropdown2.selectByIndex(1);
		screenShot("experience");

	}
	public static void screenShot(String fileName) throws Exception 
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshot/"+fileName+".png");
		FileUtils.copyFile(src,des);
		
		
	}		
}
