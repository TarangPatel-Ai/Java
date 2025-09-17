package SeleniumCode.WebSelenium;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Register the web browser
    	WebDriverManager.firefoxdriver().setup();
    	
    	//Create an object to the Browser
    	WebDriver wd = new FirefoxDriver();
    	
    	wd.manage().window().maximize();
    	//wd.get("https://www.amazon.in/");
    	//wd.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
    	//wd.findElement(By.id("nav-search-submit-button")).click();
    	
    	wd.get("http://localhost:4200/clients");
    	wd.findElement(By.id("clientname")).sendKeys("Arvindbhai Patel");
    	wd.findElement(By.id("clientemail")).sendKeys("arvind@gmail.com");
    	wd.findElement(By.id("clientaddress")).sendKeys("Vasna Borsad");
    	wd.findElement(By.id("password")).sendKeys("123456");
    	wd.findElement(By.id("rpassword")).sendKeys("123456");
    	wd.findElement(By.id("submitdata")).click();
    	wd.close();
    	
    }
}
