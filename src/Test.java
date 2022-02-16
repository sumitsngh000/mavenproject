import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sumit\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://mycms.app/auth/realms/akt/protocol/openid-connect/auth?response_type=code&scope=openid&client_id=akt_web&redirect_uri=http%3A%2F%2F43.241.62.118%3A9091%2FAKTWebPortal");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement Remember = driver.findElement(By.xpath("//*[@id=\"rememberMe\"]"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"kc-login\"]"));
		username.sendKeys("sahanavijay2699@gmail.com");
		password.sendKeys("sahanaprabhu");
		Remember.click();
		login.click();
		Thread.sleep(5000);
		WebElement burger = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/img[1]"));
		burger.click();
		WebElement welcome = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]"));
		welcome.click();
		Thread.sleep(10000);
		WebElement edit = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/button[1]/i[1]"));
		edit.click();
		Thread.sleep(3000);
		WebElement upload_image = driver.findElement(By.xpath("//span[@class=\"align-bottom float-right text-primary\"]"));
		Runtime.getRuntime().exec("C:\\\\Users\\\\sumit\\\\Desktop\\\\download.jpg"); 
		//upload_image.sendKeys("C:\\Users\\sumit\\Desktop\\download.jpg");
		WebElement tittle = driver.findElement(By.xpath("//input[@id='heading']"));
		tittle.sendKeys("Welcome To AKT");
		WebElement description = driver.findElement(By.xpath("//textarea[@id='description']"));
		description.sendKeys("Description about Welcome To AKT");
		WebElement save = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		save.click();

	}
}
