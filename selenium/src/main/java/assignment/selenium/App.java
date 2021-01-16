package assignment.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
        init();
        
        
        testBlankUserName();
        testBlankPassword();
        testLogin();
        testBlankFirstName();
        testBlankLastName();
        testValidEmail();
        testBlankMobileNo();
        testBlankCity();
        testBlankState();
        testBlankCardHolderName();
        testBlankDebitCardNo();
        testBlankCVV();
        testBlankExpirationMonth();
        testBlankExpirationYear();
        testConfirmBooking();
        
        teardown();
    }
    
    private static void init(){
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("file:///D:/workspace/selenium/selenium/login.html");
    }
    
    private static void teardown(){
    	
    	driver.close();
    }
    
    private static void testBlankUserName(){
    	
    	driver.findElement(By.className("btn")).click();
    	String errmsg = driver.findElement(By.id("userErrMsg")).getText();
    	if(errmsg.equals("* Please enter userName.")){
    		System.out.println("PASS:testBlankUserName");
    	}else{
    		System.out.println("FAIL:testBlankUserName");
    	}
    	
    }
    private static void testBlankPassword(){
    	
    	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
    	driver.findElement(By.className("btn")).click();
    	String errmsg = driver.findElement(By.id("pwdErrMsg")).getText();
    	if(errmsg.equals("* Please enter password.")){
    		System.out.println("PASS:testBlankPassword");
    	}else{
    		System.out.println("FAIL:testBlankPassword");
    	}
    	
    }
    private static void testLogin(){
    	
    	driver.findElement(By.xpath("//input[@name='userPwd']")).sendKeys("admin");
    	driver.findElement(By.className("btn")).click();
    	
    	String title = driver.getTitle();
    	
    	if(title.equals("Hotel Booking")){
    		System.out.println("PASS:testLogin");
    	}else{
    		System.out.println("FAIL:testLogin");
    	}
    	
    }
    
    private static void testBlankFirstName(){
    	
    	driver.findElement(By.id("btnPayment")).click();
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the First Name")){
    		System.out.println("PASS:testBlankFirstName");
    	}else{
    		System.out.println("FAIL:testBlankFirstName");
    	}
    	driver.switchTo().alert().accept();
    }
    
    private static void testBlankLastName(){
    	
    	driver.findElement(By.id("txtFirstName")).sendKeys("Nidhi");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the Last Name")){
    		System.out.println("PASS:testBlankLastName");
    	}else{
    		System.out.println("FAIL:testBlankLastName");
    	}
    	driver.switchTo().alert().accept();
    }

    private static void testValidEmail(){
    	driver.findElement(By.id("txtLastName")).sendKeys("Misri");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the Email")){
    		System.out.println("PASS:testValidEmail");
    	}else{
    		System.out.println("FAIL:testValidEmail");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    private static void testBlankMobileNo(){
    	driver.findElement(By.id("txtEmail")).sendKeys("Nidhi.Misri@tcs.com");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the Mobile No.")){
    		System.out.println("PASS:testBlankMobileNo");
    	}else{
    		System.out.println("FAIL:testBlankMobileNo");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankCity(){
    	driver.findElement(By.id("txtPhone")).sendKeys("9876543210");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please select city")){
    		System.out.println("PASS:testBlankCity");
    	}else{
    		System.out.println("FAIL:testBlankCity");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankState(){
    	
    	Select city = new Select(driver.findElement(By.name("city")));
    	city.selectByIndex(1);
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please select state")){
    		System.out.println("PASS:testBlankState");
    	}else{
    		System.out.println("FAIL:testBlankState");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankCardHolderName(){
    	
    	Select city = new Select(driver.findElement(By.name("state")));
    	city.selectByIndex(1);
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the Card holder name")){
    		System.out.println("PASS:testBlankCardHolderName");
    	}else{
    		System.out.println("FAIL:testBlankCardHolderName");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankDebitCardNo(){
    	
    	driver.findElement(By.id("txtCardholderName")).sendKeys("Nidhi Misri");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the Debit card Number")){
    		System.out.println("PASS:testBlankDebitCardNo");
    	}else{
    		System.out.println("FAIL:testBlankDebitCardNo");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankCVV(){
    	
    	driver.findElement(By.id("txtDebit")).sendKeys("1111222233334444");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the CVV")){
    		System.out.println("PASS:testBlankCVV");
    	}else{
    		System.out.println("FAIL:testBlankCVV");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankExpirationMonth(){
    	
    	driver.findElement(By.id("txtCvv")).sendKeys("123");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill expiration month")){
    		System.out.println("PASS:testBlankExpirationMonth");
    	}else{
    		System.out.println("FAIL:testBlankExpirationMonth");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testBlankExpirationYear(){
    	
    	driver.findElement(By.id("txtMonth")).sendKeys("10");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String msg = driver.switchTo().alert().getText();
    	
    	if(msg.equals("Please fill the expiration year")){
    		System.out.println("PASS:testBlankExpirationYear");
    	}else{
    		System.out.println("FAIL:testBlankExpirationYear");
    	}
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    private static void testConfirmBooking(){
    	
    	driver.findElement(By.id("txtYear")).sendKeys("2022");
    	
    	driver.findElement(By.id("btnPayment")).click();
    	
    	String message = driver.findElement(By.xpath("//h1")).getText();
    	
    	if(message.equals("Booking Completed!")){
    		System.out.println("PASS:testConfirmBooking");
    	}else{
    		System.out.println("FAIL:testConfirmBooking");
    	}    	
    	
    	
    }
    
}
