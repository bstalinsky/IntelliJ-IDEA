package music.cucumber.Steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class AddToFavSteps {
    @Managed  WebDriver driver;

    @Test

    @Given("^User navigates to Mixcloud website$")
    public void user_navigates_to_mixcloud_website() {
        driver.get("https://www.mixcloud.com/");
        driver.manage().window().maximize();
    }
    @When("^User clicks on the login button on page$")
    public void user_clicks_on_the_login_button_on_page() throws Throwable {
        driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
    }
    @When("^User enters a valid username$")
    public void user_enters_a_valid_username() {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bstalinsky@gmail.com");
    }
    @When("^User enters a valid password$")
    public void user_enters_a_valid() {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("HillelTest");
    }
    @When("^User clicks on the log in button$")
    public void user_clicks_on_the_log_in_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }
    @When("^User should be successfully logged in$")
    public void user_should_be_logged_in() throws Throwable {
        Thread.sleep(2000);
        WebElement Bstalinsky=driver.findElement(By.xpath("//*[contains(text(), 'bstalinsky')]"));
        Assert.assertEquals(true,  Bstalinsky.isDisplayed());
    }
    @Given("^User enters artistname in the Search field$")
    public void user_clicks_Search_field() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
        driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("Martin Garrix");
    }
    @When("^User start listening$")
    public void user_plays_all_available_tracks() throws Throwable {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div[2]/div/button/span")).click();Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div[1]/div[1]/div/span/svg")).click();


        Thread.sleep(20000);
    }
    @Then("^User clicks add to Favorite$")
    public void user_clicks_on_artist_composition() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div[1]/div[1]/div/span/svg")).click();
    }

}