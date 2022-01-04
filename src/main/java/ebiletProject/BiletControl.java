package ebiletProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BiletControl  {
	


	public static  Boolean controlTicket(WebDriver driver) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Emre\\ebiletProject\\driver\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
	    // open the webb app
	
	    driver.navigate().to("https://ebilet.tcddtasimacilik.gov.tr");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    
	//    System.out.println(title);
	    if(title.equalsIgnoreCase("TCDD Taşımacılık A.Ş.")){

		        // identify the web element:
		        // Nereden TextBox :
		        Thread.sleep(1000);
		        WebElement neredenBox = driver.findElement(By.id("nereden"));
		        neredenBox.sendKeys("Ankara Gar");
		        WebElement nereyeBox = driver.findElement(By.id("nereye"));
		        nereyeBox.sendKeys("Kars");
		        WebElement departureDate = driver.findElement(By.id("trCalGid_input"));
		        departureDate.clear();
		        departureDate.sendKeys("03.02.2022");
		        Thread.sleep(1000);
		        Actions action = new Actions(driver);
		        action.sendKeys(Keys.ESCAPE).perform();
		//        WebElement dateOfReturn = driver.findElement(By.id("nereye"));
		//        nereyeBox.sendKeys("Kars");
		
		//
		//        driver.findElement(By.className("ui-spinner-up")).click();
		//        driver.findElement(By.className("ui-spinner-up")).click();
		        driver.findElement(By.className("ui-button-text")).click();
		        driver.findElement(By.className("ui-button-text")).click();
		        driver.findElement(By.className("ui-button-text")).click();
		
		        driver.findElement(By.id("btnSeferSorgula")).click();
		        Thread.sleep(2000);
		//        String doguEkspresi = driver.findElement(By.id("mainTabView:gidisSeferTablosu:1:seferBilgileriDataList:0:j_idt81")).getText();
		        
		        try {
		        	 String day = driver.findElement(By.id("mainTabView:j_idt60")).getText();
		        	 System.out.println(day);
				        if(day.equals("03.02.2022 Perşembe" )){
				
				            System.out.println("Sıstem acildi.");
				            action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); 
				            String findMyPhone = "https://myaccount.google.com/security/signin?continue=https%3A%2F%2Fmyaccount.google.com%2Ffind-your-phone";
				            driver.get(findMyPhone);
				            Thread.sleep(100);
				           
				            WebElement email = driver.findElement(By.id("identifierId") );
				           
				            email.sendKeys("emreblblvv");
//				            email.sendKeys(Keys.ENTER);
				            return  true;

		        }
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Sefer acilmadi");
					
					driver.close();
					
				}
		       
		
		        
     
		        Thread.sleep(3000);
		   

		        return false;
        

//        js.executeScript("document.getElementById('syolcuSayisi_input')[1].setAttribute('class','ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only ui-state-active')");
//        js.executeScript("document.getElementById('syolcuSayisi_input')[1].setAttribute('class','ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only ui-state-active')");


//        driver.findElement(By.id("btnSeferSorgula")).click();
//        Thread.sleep(2000);

    
    //short way :


//    String url = "https://ebilet.tcddtasimacilik.gov.tr";
//    driver.get(url);

}
		return false;}}
