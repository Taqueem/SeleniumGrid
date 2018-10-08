package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.TLDriverFactory;
import util.TestBase;
public class SecondTest extends TestBase {

	WebDriver driver;

	private WebDriver getDriver() {

		return driver = TLDriverFactory.getDriver();
	}

	@Test
	public void GOOGLE1() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		System.out.println(
				"Google1 Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.google.com");
		// System.out.println("GOOGLE1-TEST - TLDriverFactory.getDriver(): " +
		// driver);
		System.out.println("GOOGLE1-TEST - driver: " + driver);
		// System.out.println("Map Driver Google: " +
		// driverMap.get(Long.valueOf(Thread.currentThread().getId())));
		System.out.println("Google1 Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(
				"Google1 Test Ended! " + Thread.currentThread().getId());
	}

	@Test
	public void YANDEX() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();
		System.out.println(
				"Yandex Test Started! " + Thread.currentThread().getId());
		driver.navigate().to("http://www.yandex.com");
		// System.out.println("YANDEX-TEST - TLDriverFactory.getDriver(): " +
		// driver);
		System.out.println("YANDEX-TEST - driver: " + driver);
		// System.out.println("Map Driver Yandex: " +
		// driverMap.get(Long.valueOf(Thread.currentThread().getId())));
		System.out.println("Yandex Test's Page title is: " + driver.getTitle()
				+ " " + Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "Yandex");
		System.out.println(
				"Yandex Test Ended! " + Thread.currentThread().getId());
	}
}
