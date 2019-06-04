package tuto.eclipse.jal.selenium.pageObjects.availabilityPage;

public class AvailabilityPage

{

	public AvailabilityPage() {
		super();
		System.out.println("A new home page was created");
	}

	public void run() {
		waitForThePage(); // we run the parent class method if we add a parameter
		performChecks();
		performActions();
	}

	private void performActions() {
		System.out.println("Action time ");
		AvailabilityPageActions actions = new AvailabilityPageActions();
		actions.clickContinueButton();

	}

	private void performChecks() {
//		AvailabilityPageChecks check = new AvailabilityPageChecks();
//		assertEquals(Availability_Checks + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
//		System.out.println("if wrong, we dont see it");

	}

	public void waitForThePage() {
		AvailabilityPageChecks check = new AvailabilityPageChecks();
		check.waitForThePage();
		System.out.println("The Home Page has been loaded");
	}

}
