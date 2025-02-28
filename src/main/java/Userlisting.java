import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Assert;
public class Userlisting 
{
	public static void main(String[] args)
	{
	    WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); // Logged in
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click(); // ac
		boolean status = driver.findElement(By.xpath("(//button[@class=\"oxd-icon-button oxd-table-cell-action-space\"])[2]")).isDisplayed();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File Targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
		sourcefile.renameTo(Targetfile);
		        if (status == true)
			{
		        	System.out.println("All the elements are being viewed"); 
		        } 
			else 
			{
		        	System.out.println("All the elements are not viewed");
		        }
		 driver.quit();
	 }
}

