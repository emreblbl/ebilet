package ebiletProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
	 

	    public static void main(String args[]) {

	    	WebDriver driver = null;
	    	boolean ticket=false;
	    	while(!ticket) {
	    		try {
					ticket = BiletControl.controlTicket(driver);
					Thread.sleep(30000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
					continue;
					
				}
	    		
	    		
	    	}
	    	
	    	System.out.println("Tebrikler sefer mevcut.");
	    	
	    	
	    	

	    }



}
