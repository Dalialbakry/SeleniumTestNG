package tuto.eclipse.jal.selenium.pageObjects.availabilityPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class AvailabilityPageChecks {

	public AvailabilityPageChecks() {

	}

	protected void waitForThePage() {
		WebDriverWait wait = new WebDriverWait(MyDriver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(AvailabilityPageIDs.LOGIN_RADIO_BUTTON_ID)));
//		wait.until(ExpectedConditions.attributeContains(element, attribute, value));
	}

	protected String getPageTitle() {
		return MyDriver.driver.getTitle();
	}

}
