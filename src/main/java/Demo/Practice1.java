package Demo; //calendar

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws IOException {
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
//		 driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("sahana");
//	
// driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("Sana@12");
//		
//		
//		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
//		Alert alert = driver.switchTo().alert();                                //mouse action
////		System.out.println(alert.getText());
//		alert.accept();
//File screenFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenFile, new File("screenshot\\screen2.png"));
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");	
//	driver.findElement(By.id("datepicker")).click();
//	String month = driver.findElement(By.xpath("//span[text()=\"November\"]")).getText();
//	String year = driver.findElement(By.xpath("//span[text()=\"2024\"]")).getText();
//	while(!((month.equals("February"))&&(year.equals("2024")))){
//		driver.findElement(By.xpath("//span[text()=\"Prev\"]")).click();
//		String month1 = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
//		String year1 = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
//		month=month1;
//		year=year1;
////		driver.findElement(By.xpath("//a[text()=\"7\"]")).click();
//}
//	driver.findElement(By.linkText("7")).click();
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("ironman4")).click();
	}
}
