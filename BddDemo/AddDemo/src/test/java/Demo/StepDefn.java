package Demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import com.cg.model.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	
	private Calculator calculator;
	int res;
	@Given("^User creates object of calculator$")
	public void user_creates_object_of_calculator() throws Throwable {
		calculator=new Calculator();
	}

	@When("^user pass (\\d+) and (\\d+) as input also (\\d+) as expected$")
	public void user_pass_and_as_input_also_as_expected(int arg1, int arg2, int arg3) throws Throwable {
	  res=calculator.add(arg1, arg2);
	  assertEquals(res, arg3);
	}

	@Then("^Display sum of two numbers$")
	public void display_sum_of_two_numbers() throws Throwable {
	  System.out.println("sum is:"+res);
	}

	@When("^user pass '-(\\d+)' and '-(\\d+)' to add$")
	public void user_pass_and_to_add(int arg1, int arg2) throws Throwable {
	res=calculator.add(arg1, arg2);
	assertNotEquals(res, 0);
	}

	@Then("^It should display error message$")
	public void it_should_display_error_message() throws Throwable {
	  System.out.println("error message"); 
	}


	


	

	


}
