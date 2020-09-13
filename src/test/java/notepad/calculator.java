package notepad;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class calculator {

	public static void main(String[] args) throws MalformedURLException
	{
		DesktopOptions options=new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), options);
		driver.findElement(By.name("Seven")).click();
		driver.findElement(By.id("multiplyButton")).click();
		driver.findElement(By.name("Five")).click();
		driver.findElement(By.id("equalButton")).click();
		
	}
}
