package Day1.BasicOIpen;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		String driverpath1="D:\\SeleniumRun\\chromedriver_win32.exe";
		System.setProperty("webdriver.chrome.driver"," D:\\SeleniumRun\\chromedriver_win32.exe");
        ChromeDriver driver =new ChromeDriver();
	}

}
