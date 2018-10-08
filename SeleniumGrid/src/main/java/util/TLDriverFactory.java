package util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TLDriverFactory {

	private static OptionsManager			optionsManager	= new OptionsManager();

	private static ThreadLocal<WebDriver>	tlDriver		= new ThreadLocal<>();

	private static ThreadLocal<String>		selectedBrowser	= new ThreadLocal<String>();

	public static synchronized void setDriver(String browser) {

		if (browser.equals("firefox")) {
			// For Local Usage
			System.out.println("Inside firefox ");
			System.setProperty("webdriver.gecko.driver",
					ConstantPath.pathGeckoDriver);
			tlDriver = ThreadLocal.withInitial(() -> new FirefoxDriver(
					optionsManager.getFirefoxOptions()));
			selectedBrowser.set(browser);
			// For Grid Usage
			/*try {
			    tlDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), optionsManager.getFirefoxOptions()));
			} catch (MalformedURLException e) {
			    e.printStackTrace();
			}*/
		} else if (browser.equals("chrome")) {
			// For Local Usage
			System.out.println("Inside chrome ");
			System.setProperty("webdriver.chrome.driver",
					ConstantPath.pathChromeDriver);
			tlDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
			selectedBrowser.set(browser);
			/*//For Grid Usage
			try {
			    tlDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), optionsManager.getChromeOptions()));
			} catch (MalformedURLException e) {
			    e.printStackTrace();
			}*/
		}
	}

	public static synchronized WebDriverWait getWait(WebDriver driver) {

		return new WebDriverWait(driver, 20);
	}

	public static synchronized WebDriver getDriver() {

		return tlDriver.get();
	}

	public static synchronized String getBrowserName() {

		return selectedBrowser.get();
	}

	public static synchronized void closeBrowser() {

		getDriver().close();
	}
}
