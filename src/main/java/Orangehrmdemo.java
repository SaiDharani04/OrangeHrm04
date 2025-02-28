
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
			public class Orangehrmdemo {
				
	public static void main(String[] args) {
		 WebDriver driver;
		        driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		        boolean status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/a/button")).isDisplayed();

		        if (status == true) {
		            System.out.println("Logged in successful");
		        } else {
		            System.out.println("Logged in not successful");
		        }

		        //Thread.sleep(2000);
		        driver.quit();
		    }
		}

