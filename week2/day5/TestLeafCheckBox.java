package week2.day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafCheckBox {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
		    driver.get("https://testleaf.herokuapp.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[@href='pages/checkbox.html']")).click();
	        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	        driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	        driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
	        
	        WebElement checkBoxSelected1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
			boolean isSelected1 = checkBoxSelected1.isSelected();

			
			if(isSelected1 == true) {
				System.out.println("Checkbox is selected");
	} else {
		        System.out.println("Checkbox is not selected");
	}
			WebElement checkBoxSelected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
			boolean isSelected2 = checkBoxSelected2.isSelected();

			
			if(isSelected2 == true) {
				checkBoxSelected2.click();
			}
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[15]")).click();
			
		     /*for(int i=10; i<=12; i++) {
		    	 driver.findElement(By.xpath("(//input[@type='checkbox'])[i]")).click();
		     }*/
            	 
            
}
}
