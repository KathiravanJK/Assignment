package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://leafground.com/button.xhtml");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']")).click();
	    System.out.println("The Title is "+driver.getTitle());
	    
	    if(driver.getTitle().contains("Dashboard")) {
	    	System.out.println("Confirmed Title");
	    } else {
	    	System.out.println("Not Confirmed");
	    }
	    
	    driver.get("https://leafground.com/button.xhtml");
	  
	    
	    WebElement buttonEnabled1 = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']"));
		boolean isEnabled1 = buttonEnabled1.isEnabled();

		
		if(isEnabled1 == true) {
			System.out.println("It is enabled");
} else {
	        System.out.println("It is disabled");
}
	    System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']")).getSize());
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt102:imageBtn']")).click();
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']")).click();
	 
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).getCssValue("padding"));
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[9]")).getCssValue("padding"));
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[10]")).getCssValue("padding"));
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[11]")).getCssValue("padding"));
		
		
		
}
}
