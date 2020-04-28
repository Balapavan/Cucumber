package utilities;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Generic extends WaitHelper {

//	public Generic(WebDriver driver) {
//		super(driver);
//	}

	/***
	 * @author BALA PAVAN S
	 */

	public static HashMap<Integer, String> hmWindow = new HashMap<Integer, String>();

	/*** Drop Down handling ******/

	public static void deselectAll(WebElement Element) {
		Select dd = new Select(Element);
		dd.deselectAll();
	}

	public static void handleDropDown(WebElement Element, String strValue) {

		Select dd = new Select(Element);
		dd.selectByVisibleText(strValue.toUpperCase());
		Assert.assertEquals(strValue.toUpperCase().trim(), dd.getFirstSelectedOption().getText().trim());
		System.out.println("[handleDropDown] Completed..");
	}

	// --- Drop Down handling Ended Here -----------------

	/*** Alerts Handling Started Here ******/

	public static String alertGetText() {
		return driver.switchTo().alert().getText();
	}

	public static void setTextInAlertBox(String strAlertInput) {
		driver.switchTo().alert().sendKeys(strAlertInput);
	}

	public static void accptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	// --- Alerts handling Ended --------------

	/***** Window handling ******/

	public static int numberOfWindowsRightAway() {

		Set<String> windows = driver.getWindowHandles();
		int windowNumber = 1;
		for (String strID : windows) {
			hmWindow.put(windowNumber, strID);
			windowNumber++;
		}

		return windows.size();
	}

	public static void switchtoWinodow(String strWindowID) {
		driver.switchTo().window(strWindowID);
	}

	public static void closeWindowAndSwicth(String switchWindowID) {

		driver.close();
		switchtoWinodow(switchWindowID);
	}
	// ----- Window handling Completed --------

	/*** Check boxs Handling ******/

	public void checkBoxSelected(WebElement checkboxElement) {
		visibility(checkboxElement, 20);
		if (!checkboxElement.isSelected()) {
			checkboxElement.click();
		}
		Assert.assertTrue(checkboxElement.isSelected());
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void mouseOver(WebElement Element) {
		Actions act = new Actions(driver);
		act.moveToElement(Element).build().perform();
	}
	
}
