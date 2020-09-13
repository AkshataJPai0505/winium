package notepad;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;



public class demo1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesktopOptions options= new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), options);
		Thread.sleep(5000);
		driver.findElement(By.name("Text Editor")).sendKeys("Akshata J Pai");
		

	}

}