package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practies {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Apphub\\eclipse-workspace\\Selenium\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com//");
	
	
	
	
	
	
	
	
	
	
	
	}
}
