package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();

	}

	public void setDepartureCity(String DepartureCity) {
		Select s1 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s1.selectByValue(DepartureCity);

	}

	public void setArrivalCity(String ArrivalCity) {
		Select s2 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.ARRIVAL_TO_CITY_ID)));
		s2.selectByValue(ArrivalCity);
	}

	public void setGoDate(String departureDay, String departureMonth) {
		Select s3 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		s3.selectByValue(departureDay);
		s3 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		s3.selectByValue(departureMonth);

	}

	public void setReturnDate(int Return_Departure_Day, int Return_Departure_Month) {
		Select s4 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_DAY)));
		s4.selectByValue("" + Return_Departure_Day);
		s4 = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_MONTH)));
		s4.selectByValue("" + Return_Departure_Month);

	}

}
