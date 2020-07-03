package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait w;

	// 1 --> browser launch
	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	// 2 --> browser close
	public static void browserClose(String browserclose) {
		try {
			if (browserclose.equalsIgnoreCase("close")) {
				driver.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 3 --> browser quit
	public static void browserQuit(String browserquit) {
		try {
			if (browserquit.equalsIgnoreCase("quit")) {
				driver.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 4 --> Navigate To
	public static void navigateTo(String urlName) {
		try {
			driver.navigate().to(urlName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 5 --> Navigate Back
	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 6 --> Navigate Forward
	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 7 --> Refresh Window
	public static void refreshWindow() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 8 --> Get URL
	public static void getUrl(String urlName) {
		try {
			driver.get(urlName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 9 --> Alert
	public static void simpleAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.alertIsPresent());
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void confirmAlert(String value) {
		try {
			Alert alert = driver.switchTo().alert();
			w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.alertIsPresent());
			if (value.equalsIgnoreCase("ok")) {
				alert.accept();
			} else if (value.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void promptAlert(String value, String text) {
		try {
			Alert alert = driver.switchTo().alert();
			w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.alertIsPresent());
			if (value.equalsIgnoreCase("ok")) {
				alert.sendKeys(text);
				implicitWait(5);
				alert.accept();
			} else if (value.equalsIgnoreCase("cancel")) {
				alert.dismiss();
			} else {
				System.out.println("Invalid Option");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 10 --> Actions
	public static void moveToWebElement(WebElement findElement) {
		try {
			waitVisibility(findElement);
			Actions a = new Actions(driver);
			a.moveToElement(findElement).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mouseClick(WebElement findElement) {
		try {
			Actions a = new Actions(driver);
			waitVisibility(findElement);
			a.click(findElement).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mouseDoubleClick(WebElement findElement) {
		try {
			Actions a = new Actions(driver);
			waitVisibility(findElement);
			a.doubleClick(findElement).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mouseDragnDrop(WebElement src, WebElement dest) {
		try {
			Actions a = new Actions(driver);
			waitVisibility(src);
			waitVisibility(dest);
			a.dragAndDrop(src, dest).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mouseRightClick(WebElement findElement) {
		try {
			Actions a = new Actions(driver);
			waitVisibility(findElement);
			a.contextClick(findElement).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 11 --> Frames

	public static WebDriver frameSwitch(String option, int value) {
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static WebDriver frameSwitch(String option, String value) {
		if (option.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		}
		return driver;
	}

	public static WebDriver frameSwitchWebElement(WebElement findElement) {
		driver.switchTo().frame(findElement);
		return driver;
	}

	public static void defaultFrameSwitch() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 12 --> Robot

	// 13 --> Window handles

	// 14 --> Drop down
	public static void dropDownSelect(WebElement findElement, String option, String value) {
		try {
			Select sc = new Select(findElement);
			if (option.equalsIgnoreCase("id")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (option.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 15 --> Check box

	// 16 --> Is enable
	public static boolean isEnabled(WebElement checkElement) {
		boolean enabled = false;
		try {
			enabled = checkElement.isEnabled();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enabled;
	}

	// 17 --> Is displayed
	public static boolean isDisplayed(WebElement checkElement) {
		boolean displayed = false;
		try {
			displayed = checkElement.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return displayed;
	}

	// 18 --> Is selected
	public static boolean isSelected(WebElement checkElement) {
		boolean displayed = false;
		try {
			displayed = checkElement.isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return displayed;
	}

	// 19 --> Get options
	public static void getAllDropdownOptions(WebElement findElement) {
		try {
			Select sc = new Select(findElement);
			List<WebElement> options = sc.getOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 20 --> Get title
	public static String getWindowTitle(WebDriver driver) {
	String title = driver.getTitle();
	return title;
	}

	// 21 --> Get current URL
	public static String getCurrentUrlText() {
		String currentUrl = null;
		try {
			currentUrl = driver.getCurrentUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return currentUrl;
	}

	// 22 --> Get text
	public static void getTextMeth(WebElement findElement) {
		try {
			findElement.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 23 --> Get attribute
	public static void getAttributeMeth(WebElement findElement, String value) {
		try {
			findElement.getAttribute(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 24 --> Wait(3)
	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void waitVisibility(WebElement findElement) {
		WebDriverWait w = new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.visibilityOf(findElement));
	}

	// 25 --> Take screenshot
	public void getScreenshot(String filename) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir") + "\\Screenshots\\" + filename + ".png");
			FileUtils.copyFile(source, dest);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 26 --> Scroll up and down
	public static void scrollIntoWebElement(WebElement findElement) {
		try {
			waitVisibility(findElement);
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView", findElement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 27 --> Send keys
	public static void sendKeysText(WebElement findElement, String value) {
		try {
			waitVisibility(findElement);
			findElement.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 28 --> Get first selected options()
	// 29 --> Get all selected options()
	// 30 --> Is multiple()

	// 31 --> Click()
	public static void clickElement(WebElement findElement) {
		try {
			waitVisibility(findElement);
			findElement.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickCheckBoxElement(WebElement findElement) {
		try {
			findElement.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
