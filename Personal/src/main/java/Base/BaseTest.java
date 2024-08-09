package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public ChromeDriver driver;
	@BeforeMethod
	public void Launch() {
		
		driver=new ChromeDriver();
		driver.get("https://jpetstore.aspectran.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
}
