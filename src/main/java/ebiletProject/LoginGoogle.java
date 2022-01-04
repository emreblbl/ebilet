package ebiletProject;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGoogle {

	
	public static void LogGoogle(ChromeDriver driver) {
		
		
		
		
		String currentHandle = driver.getWindowHandle();
		

		Set<String> handles = driver.getWindowHandles();
		
		for(String actual : handles) {
			
			if(!actual.equalsIgnoreCase(currentHandle)) {
				
				//Switching to the opened tab
				

				driver.switchTo().window(actual);
				// opening the URL saved
				String findMyPhone = "https://myaccount.google.com/find-your-phone";
				
				driver.get(findMyPhone);
			}
		}
		
		
	}
}
