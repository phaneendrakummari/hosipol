package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	public FileInputStream file;
	public static Properties props;
	 protected WebDriver driver;
	
	public Testbase()  {
		
	   props=new Properties();
		try {
		 file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\hosipol.com\\src\\main\\java\\com\\propertiesconfigure\\propfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Setup() {
		
	String	browsertype=props.getProperty("browser");
	
	if(browsertype.equalsIgnoreCase("chrome")) {
		
		 driver = new ChromeDriver();
	}
	else if (browsertype.equalsIgnoreCase("edge")) {
		
		driver = new EdgeDriver();
	}
	else if (browsertype.equalsIgnoreCase("firefox")) {
		
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(props.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

}
