package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.TLDriverFactory;
import util.TestBase;
public class FirstTest extends TestBase {

	@Test
	public void GOOGLE0() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		WebDriverWait wait = TLDriverFactory.getWait(driver);
		System.out.println(
				"Google0 Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.google.com");
		System.out.println("Google0 Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(
				"Google0 Test Ended! " + Thread.currentThread().getId());
	}

	@Test
	public void GOOGLE2() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		WebDriverWait wait = TLDriverFactory.getWait(driver);
		System.out.println(
				"Google2 Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.google.com");
		System.out.println("Google2 Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(
				"Google2 Test Ended! " + Thread.currentThread().getId());
	}

	@Test
	public void GOOGLE3() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		System.out.println(
				"Google3 Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.google.com");
		System.out.println("Google3 Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(
				"Google3 Test Ended! " + Thread.currentThread().getId());
	}

	@Test
	public void GOOGLE4() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		System.out.println(
				"Google4 Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.google.com");
		System.out.println("Google3 Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(
				"Google3 Test Ended! " + Thread.currentThread().getId());
	}
}
