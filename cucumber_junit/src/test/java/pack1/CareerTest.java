package pack1;



import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CareerTest {

	
	@Given ("^I am a \"([a-zA-Z]{1,})\" developer$")
	public void I_am_a_good_developer(String Developer){
		System.out.println("*********************");
		System.out.println("@Given: I am a "+Developer+" developer");
	}
	@When ("^I go to work$")
	public void I_go_to_work(){
		System.out.println("@When: I go to work");
	}
	@Then ("^I \"([a-zA-Z]{1,})\" the work$")
	public void I_complete_the_work(String workway){
		System.out.println("@Then: I "+workway+ " the work");
	}
	@And ("^My boss \"([a-zA-Z]{1,})\" me$")
	public void My_boss_praises_me(String feedback){
		System.out.println("@And: My boss "+feedback+" me");
	}
	@But ("^My manager \"([a-zA-Z]{1,})\" me$")
	public void My_manager_hate_me(String treats){
		System.out.println("@But: My manager "+treats+" me");
	}
}
