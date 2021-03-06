package com.adactin.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.Cucumber.Base_Class;
import com.adactin.POModel.POManager;

import adactin.properties.FileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Base_Class.driver;

	public static POManager pom = new POManager(driver);

	@Given("^User Launch Application$")
	public void user_Launch_Application() throws Throwable {

		String url = FileReader.readBrowser().confirmThis().getUrl();

		GetUrl(url);

	}

	@When("User Enter UserName In UserName and Password Field as")
	public void user_enter_user_name_in_user_name_and_password_field_as(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.

		List<String> inputs = dataTable.asList(String.class);

		String username = inputs.get(0);
		String password = inputs.get(1);

		sendKeysda(pom.getLp().getUsername(), username);
		sendKeysda(pom.getLp().getPassword(), password);

	}

//	@When("User Enter UserName In UserName Field as {string} input")
//	public void user_enter_user_name_in_user_name_field_as_input(String username) {
//		sendKeysda(pom.getLp().getUsername(), username);
//	}
//	@When("User Enter Password In Password Field as {string} password")
//	public void user_enter_password_in_password_field_as_password(String password) {
//		sendKeysda(pom.getLp().getPassword(), password);
//	}

	@Then("^User Click Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		clickda(pom.getLp().getLogin());

	}

	@When("^User Select Location$")
	public void user_Select_Location() throws Throwable {
		multipledropdown(pom.getSp().getLocation(), "SelectByvisibleText", "London");
	}

	@When("^User Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		multipledropdown(pom.getSp().getHotels(), "SelectByvisibleText", "Hotel Sunshine");
	}

	@When("^User Selet Room Type$")
	public void user_Selet_Room_Type() throws Throwable {
		multipledropdown(pom.getSp().getRoom_type(), "SelectByvisibleText", "Super Deluxe");
	}

	@When("^User Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		multipledropdown(pom.getSp().getNo_of_rooms(), "Selectbyindex", "4");
	}

	@When("^User Enter Check In Date$")
	public void user_Enter_Check_In_Date() throws Throwable {
		sendKeysda(pom.getSp().getCheckin(), "28/04/2022");
	}

	@When("^User Enter Check Out Date$")
	public void user_Enter_Check_Out_Date() throws Throwable {
		sendKeysda(pom.getSp().getCheckout(), "04/05/2022");
	}

	@When("^User Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
		multipledropdown(pom.getSp().getNo_of_rooms(), "Selectbyindex", "3");
	}

	@When("^User Select Children Per Room$")
	public void user_Select_Children_Per_Room() throws Throwable {
		multipledropdown(pom.getSp().getChilds(), "Selectbyindex", "2");
	}

	@Then("^User Select Search Button$")
	public void user_Select_Search_Button() throws Throwable {
		clickda(pom.getSp().getSubmit());
	}

	@When("^User Select Hotel By Radio Button$")
	public void user_Select_Hotel_By_Radio_Button() throws Throwable {
		radioButton(pom.getSelh().getRadio());

	}

	@Then("^User Select Select Button$")
	public void user_Select_Select_Button() throws Throwable {
		clickda(pom.getSelh().getSubmit());
	}

	@When("^User Enters First Name$")
	public void user_Enters_First_Name() throws Throwable {
		sendKeysda(pom.getBh().getFirst_name(), "Robin");
	}

	@When("^User Enters Last Name$")
	public void user_Enters_Last_Name() throws Throwable {
		sendKeysda(pom.getBh().getLast_name(), "K");
	}

	@When("^User Enters Billing Address$")
	public void user_Enters_Billing_Address() throws Throwable {
		sendKeysda(pom.getBh().getAddress(), "Address");
	}

	@When("^User Enters Digit Credit Card Number$")
	public void user_Enters_Digit_Credit_Card_Number() throws Throwable {
		sendKeysda(pom.getBh().getCc_num(), "1234567890123456");
	}

	@When("^User Select Credit Card Type$")
	public void user_Select_Credit_Card_Type() throws Throwable {
		multipledropdown(pom.getBh().getCc_type(), "SelectByvisibleText", "American Express");
	}

	@When("^User Select Expiry Month$")
	public void User_Select_Expiry_Month() throws Throwable {
		multipledropdown(pom.getBh().getCc_exp_month(), "SelectByValue", "6");

	}

	@When("^User Select Expiry Year$")
	public void User_Select_Expiry_Year() throws Throwable {
		multipledropdown(pom.getBh().getCc_exp_year(), "SelectByValue", "2022");
	}

	@When("^User Enters CVV Number$")
	public void user_Enters_CVV_Number() throws Throwable {
		sendKeysda(pom.getBh().getCc_cvv(), "258");
	}

	@When("^Click BooK Now Button$")
	public void click_BooK_Now_Button() throws Throwable {
		clickda(pom.getBh().getBook_now());

	}

	@When("^User Click Booked Itinerary to check booking Conformation$")
	public void user_Click_Booked_Itinerary_to_check_booking_Conformation() throws Throwable {

		clickda(pom.getBh().getItinerary());
	}

	@Then("^Click Logout$")
	public void click_Logout() throws Throwable {
		clickda(pom.getBh().getLogout());
	}
}
