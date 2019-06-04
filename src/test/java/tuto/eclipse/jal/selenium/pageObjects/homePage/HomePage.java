package tuto.eclipse.jal.selenium.pageObjects.homePage;

import static org.junit.Assert.assertEquals;

public class HomePage {

	private static final String HOME_PAGE = "> HOME_PAGE > Checks > ";
	private static final String EXPECTED_PAGE_TITLE = "JAPAN AIRLINES (JAL) - France Region - Airfare to Japan (Tokyo)";
	private static final String DepartureCity = "NCE";
	private static final String ArrivalCity = "HND";
	private static final String Departure_Day = "17";
	private static final String Departure_Month = "12";
	private static final String Return_Departure_Day = "1";
	private static final String Return_Departure_Month = "1";

//	private pageName = 

	public HomePage() {
		super();
		System.out.println("A new home page was created");
	}

	public void run() {
		waitForThePage(); // we run the parent class method if we add a parameter
		performChecks();
		performActions();
	}

	public void waitForThePage() {
		HomePageChecks check = new HomePageChecks();
		check.waitForThePage();
		System.out.println("The Home Page has been loaded");
	}

	public void performActions() {
		HomePageActions actions = new HomePageActions();
		actions.closeModal();
		actions.setDepartureCity(DepartureCity);
		actions.setArrivalCity(ArrivalCity);
		actions.setGoDate(Departure_Day, Departure_Month);
//		actions.setReturnDate(Return_Departure_Day, Return_Departure_Month);
		actions.clickSearchButton();

	}

	public void performChecks() {
		HomePageChecks check = new HomePageChecks();
		assertEquals(HOME_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
		System.out.println("if wrong, we dont see it");

	}

}
