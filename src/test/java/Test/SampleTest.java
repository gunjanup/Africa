package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	
	@Test
	public void sample()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("hi there sample");
		driver.get("https://www.youtube.com/");
	}
}
