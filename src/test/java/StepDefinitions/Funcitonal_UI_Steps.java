package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Funcitonal_UI_Steps {

    WebDriver driver = null;


    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("Browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :"+projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage() .window() .maximize();


    }
    @And("user is on kurtosys web page")
    public void user_is_on_kurtosys_web_page() {

        System.out.println("And user is on kurtosys web page");

        driver.navigate().to("https://www.kurtosys.com/");

    }
    @When("user clicks Insights menu item")
    public void user_clicks_Insights_menu_item() {

        System.out.println("When user clicks Insights menu item");
        driver.findElement(By.xpath("//li[@id='kurtosys-menu-item-75710']/a/div/div/span")).click();

    }

    @And("user clicks White papers button")
    public void user_clicks_White_papers_button() {

        System.out.println("user clicks White papers button");
        driver.findElement(By.xpath("//a[normalize-space()='White papers']")).click();


    }

//    @And("user verify text")
//    public void user_verify_text() {
//
//        System.out.println("user verify text - White Papers");
//        driver.getPageSource().contains("White Papers");
//    }

    @Then("user click on article")
    public void user_click_on_article() {

        System.out.println("user click on article");
//        driver.wait(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Institutional reporting survey']")).click();
    }

    @And("user enters firstname in text box")
    public void user_enters_a_firstname_in_text_box() {
        driver.findElement(By.xpath("//div[@class='elementor-field-type-text elementor-field-group elementor-column elementor-field-group-firstname elementor-col-50 elementor-field-required elementor-mark-required']//input[@id='form-field-firstname']")).sendKeys("John");
    }

    @And("user enters lastname in text box")
    public void user_enters_a_lastname_in_text_box() {
        driver.findElement(By.xpath("//div[@class='elementor-field-type-text elementor-field-group elementor-column elementor-field-group-lastname elementor-col-50 elementor-field-required elementor-mark-required']//input[@id='form-field-lastname']")).sendKeys("Cena");
    }

    @And("user enters a text in Company text box")
    public void user_enters_a_text_in_company_text_box() {

        System.out.println("user enters a text in Company text box");
        driver.findElement(By.xpath("//input[@id='form-field-company']")).sendKeys("Random Company Text");
    }

    @When("user clicks Industry dropdown")
    public void user_clicks_Industry_dropdown() {

        System.out.println("user clicks Industry dropdown");
        driver.findElement(By.xpath("//select[@id='form-field-industry']")).click();
    }

    @And("user clicks submit button")
    public void user_clicks_submit_button() {

        System.out.println("user clicks submit button");
        driver.findElement(By.xpath("//button[@class='elementor-button elementor-size-sm']")).click();

    }


}