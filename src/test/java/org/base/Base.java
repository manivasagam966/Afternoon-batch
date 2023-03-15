package org.base;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		public static File f;
		public static WebDriver driver ;
		public static JavascriptExecutor js;
		public static void edge() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		public static void chrome() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();

		}
		public static void passurl(String url) {
			driver.get(url);

		}
		public static void goback() {
			driver.navigate().back();

		}
		public static WebElement xpath(String xpath) {
	         WebElement element = driver.findElement(By.xpath(xpath));
	         return element;

		}
		public static void moveElement(WebElement element) {
			 Actions a= new Actions(driver);
			a.moveToElement(element).perform();
		}
		public static void click() {
			Actions a= new Actions(driver);
			a.click().perform();
		}
		public static void sendkeys(WebElement element,String value) {
			element.sendKeys(value);
			

		}
		public static String gettext(WebElement element) {
			String text = element.getText();
			return text;

		}
		public static void frame(WebElement element) {
			driver.switchTo().frame(element);

		}
		public static void mainframe() {
		driver.switchTo().defaultContent();

		}
		public static void implicitwait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		public static void scrollIntoView(WebElement element,String bool) {
			js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView("+bool+")",element);
		}
		public static void jssendkeys(String value,WebElement element) {
			js=(JavascriptExecutor)driver;
			Object s = js.executeScript("arguments[0].setAttribute('value','"+value+"')",element);
			System.out.println(s);
		}
		public static void jsclick(WebElement element) {
			js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()",element);
		}
		public static Object jsgetvalue(WebElement element) {
			js=(JavascriptExecutor)driver;
			Object value = js.executeScript("return arguments[0].getAttribute('value')",element);
			return value;

		}
		public static void iframe(String xpath) {
			WebElement element = driver.findElement(By.xpath(xpath));
			driver.switchTo().frame(element);

		}
		
		public static String value(WebElement element) {
			String value = element.getAttribute("value");
			return value;
			
		}
		public static void select(WebElement element,String value) {
			Select s = new Select (element);
			s.selectByValue(value);

		}
		


	}

