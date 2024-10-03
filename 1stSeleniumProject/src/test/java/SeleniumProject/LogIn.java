package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = Driver.findElement(By.className("oxd-form-actions orangehrm-login-action"));
		WebElement pass = Driver.findElement(By.className("oxd-input oxd-input--active"));
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
	}

}
