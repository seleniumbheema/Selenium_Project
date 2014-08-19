package practicepack;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Teste {
	
	@Given("I work in \"([^\"]*)\"")
	public void I_works(String Company){
		System.out.println("$$$$$$$$$$$$tester$$$$$$$$$$$$$");
		System.out.println("@givne- I works in and " +Company);
	}
	@When("I met \"([^\"]*)\"")
	public void I_met(String CEO){
		System.out.println("@when - I met " +CEO);
	}
	@Then("He \"([^\"]*)\"")
	public void He(String Personality){
		System.out.println("@then - He " +Personality);
	}
	@But("he is a \"([^\"]*)\" person")
	public void he_is(String behav){
		System.out.println("@but - he_is " +behav);
	}
}
