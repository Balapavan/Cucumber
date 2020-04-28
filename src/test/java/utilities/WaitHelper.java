package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public static WebDriver driver;
	public static WebDriverWait objEwait;

//	public WaitHelper(WebDriver driver) {
//		WaitHelper.driver = driver;
//	}

	public static void visibility(WebElement Locator, long timeInSeconds) {

		System.out.println("[WaitHelper][visibility] Locator=" + Locator + " timeInSeconds=" + timeInSeconds);
		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.visibilityOf(Locator));
		System.out.println("[WaitHelper][visibility]: Completed..");
	}

	public void visibilityOfGroupOfElements(List<WebElement> Locator, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.visibilityOfAllElements(Locator));
	}

	public void clickableWait(WebElement Locator, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.elementToBeClickable(Locator));
	}

	public void attributeToBe(WebElement Locator, String attribute, String value, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.attributeToBe(Locator, attribute, value));
	}

	/**
	 * @param windowsCount
	 * @param driver
	 * @param timeInSeconds
	 */
	public void numberOfWindowsToBe(int windowsCount, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.numberOfWindowsToBe(windowsCount));
	}

	/**
	 * @param frameLocator
	 *            webElement
	 */
	public void switchToFrame(WebElement frameLocator, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	/*
	 * @param fameNumber index order 0
	 */
	public void switchToFrame(int fameNumber, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fameNumber));
	}

	public void textToBe(WebElement element, String strExpectedtext, long timeInSeconds) {

		objEwait = new WebDriverWait(driver, timeInSeconds);
		objEwait.until(ExpectedConditions.textToBePresentInElement(element, strExpectedtext));
	}

	public static void setInputField(WebElement elIputField, String strInputData) {
		System.out.println("[setInputField] " + elIputField + " strInputData=" + strInputData);
		WebDriverWait inputWait = new WebDriverWait(driver, 10);
		inputWait.until(ExpectedConditions.visibilityOf(elIputField));
		elIputField.clear();
		elIputField.sendKeys(strInputData);
		inputWait.until(ExpectedConditions.attributeToBe(elIputField, "value", strInputData));
		System.out.println("[setInputField] Commpleted..");
	}

	public void pageTittle(String steexpectedtitile) {

		String strActualPagetittle = driver.getTitle();

	}

}
