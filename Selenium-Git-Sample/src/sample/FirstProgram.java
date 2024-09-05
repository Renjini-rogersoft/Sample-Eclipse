package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renji\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver.get("https://www.ebay.com/");
		String exp="Electronics, Cars, Fashion, Collectible";
		
		String act=driver.getTitle();
		
		if(exp.equals(act))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
	
	

	}

}
