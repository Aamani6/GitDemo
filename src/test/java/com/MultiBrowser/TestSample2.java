package com.MultiBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample2 {
	
	@Parameters("browser")
	@Test
	public void Facebooklogin(String browser) throws MalformedURLException {
		System.out.println(browser);
		
		DesiredCapabilities cap = null;
		
		if (browser.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
			
		} else if (browser.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		   driver.get("https://www.facebook.com/");
		   System.out.println(driver.getTitle());
		   driver.quit();
		
		
	}

}
