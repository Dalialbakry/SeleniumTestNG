package tuto.eclipse.jal.selenium.pageObjects.availabilityPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class AvailabilityPageActions {

	protected void clickContinueButton() {
		MyDriver.driver.findElement(By.id(AvailabilityPageIDs.LOGIN_RADIO_BUTTON_ID)).click();

	}

}
