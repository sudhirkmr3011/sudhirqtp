package githubsud;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class github {
@Test

public void git(){
	
	//"webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\Utilities\\geckodriver.exe");
	//driver=new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "G:\\SELENIUM\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://localhost:100/");
	driver.manage().window().maximize();
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	
	
	driver.findElement(By.linkText("Logout")).click();

}}
