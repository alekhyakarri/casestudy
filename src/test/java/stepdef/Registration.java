package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class Registration {
	WebDriver driver;
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
	}

	@Given("user navigates to application")
	public void user_navigates_to_application() {
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("user launches registration page")
	public void user_launches_registration_page() {
		 driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("user enters username as {string} in un field")
	public void user_enters_username_as_in_un_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enters firstname as {string} in fn field")
	public void user_enters_firstname_as_in_fn_field(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@Given("user enters lastname as {string} in ln field")
	public void user_enters_lastname_as_in_ln_field(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@Given("user enters password as {string} in pwd field")
	public void user_enters_password_as_in_pwd_field(String pwd) {
		 driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Given("user enters confirm password as {string} in cfpwd field")
	public void user_enters_confirm_password_as_in_cfpwd_field(String cfpwd) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(cfpwd);
	}

	@Given("user selects gender as {string} in gn field")
	public void user_selects_gender_as_in_gn_field(String gn) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@Given("user enters E-mail as {string} in em field")
	public void user_enters_E_mail_as_in_em_field(String em) {
		 driver.findElement(By.name("emailAddress")).sendKeys(em);
	}

	@Given("user enters mobile number as {string} in mn field")
	public void user_enters_mobile_number_as_in_mn_field(String mn) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mn);
	}

	@Given("user enters dob as {string} in dob field")
	public void user_enters_dob_as_in_dob_field(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@Given("user enters address as {string} in adr field")
	public void user_enters_address_as_in_adr_field(String adr) {
		 driver.findElement(By.name("address")).sendKeys(adr);
	}

	@Given("user selects security question as {string} in sq field")
	public void user_selects_security_question_as_in_sq_field(String sq) {
		 Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		  sel.selectByValue("411011");
		  sel.selectByVisibleText("What is your favour color?");
	}

	@Given("user enters answer as {string} in ans field")
	public void user_enters_answer_as_in_ans_field(String ans) {
		  driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(ans);
	}

	@Given("user clicks on Register button")
	public void user_clicks_on_Register_button() {
		driver.findElement(By.name("Submit")).click();
	}

}
