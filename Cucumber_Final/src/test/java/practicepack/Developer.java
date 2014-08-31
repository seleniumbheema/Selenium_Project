package practicepack;

import java.util.List;
import java.util.Map;


import java.util.logging.Logger;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {
//	Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	
	@Given("^I am a \"([a-zA-Z]{1,})\" developer$")
	public void I_am_good_developer(String behave, DataTable table){
		List<Map<String, String>> data = table.asMaps();
		System.out.println("*******developer******");
		System.out.println("@Given- I am a " + behave+" developer in " +data.get(1).get("tech")+" at "+ data.get(0).get("country"));
	}
	@When("I go to work")
	public void I_go_to_work(){
		
		System.out.println("@When - I go to work");
	}
	@Then("^I \"([a-zA-Z]{1,})\" the work$")
	public void I_complete_the_work(String type){
		System.out.println("@Then- I "+type+" the work");
	}
	@And("My boss \"([a-zA-Z]{1,})\" me")
	public void My_boss_praises_me(String treat){
		System.out.println("@And- My boss"+treat+"me");
	}
	@But("My manager \"([a-zA-Z]{1,})\" me")
	public void My_Manager_likes_me(String relation){
		System.out.println("my manager" +relation+" me");
	}
}
