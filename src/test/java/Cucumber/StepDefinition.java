package Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	
	@Given("^Open TestMeApp$")
	public void OpenTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	
	@When("^click on signIn$")
	public void SignIn() {
		driver.findElement(By.xpath("//*[@href='login.htm']")).click();
	}
	
	@When("^enter user credential$")
	public void enterCred(DataTable dt) {
		List<String> st=dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(st.get(0));
		driver.findElement(By.name("password")).sendKeys(st.get(1));
		driver.findElement(By.name("Login")).click();
		
	}
	
	@When("^click on signup$")
	public void SignUp() {
		driver.findElement(By.xpath("//*[@href='RegisterUser.htm']")).click();
	}
	
	@When("^enter username as \"([^\"]*)\"$")
	public void Username(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}
	
	@When("^enter first name as \"([^\"]*)\"$")
	public void firstName(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	}
	
	@When("^enter second name as \"([^\"]*)\"$")
	public void secondName(String second) {
		driver.findElement(By.id("lastName")).sendKeys(second);
	}
	
	@When("^enter password as \"([^\"]*)\"$")
	public void passWord(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@When("^enter confirm password as \"([^\"]*)\"$")
	public void cnfmPass(String pwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(pwd);
	}
	
	@When("^enter gender$")
	public void gender() {
		List<WebElement> al=driver.findElements(By.name("gender"));
		al.get(0).click();
	}
	
	@When("^enter email as \"([^\"]*)\"$")
	public void Email(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}
	
	@When("^enter Mobile Number as \"([^\"]*)\"$")
	public void Number(String num) {
		driver.findElement(By.id("mobileNumber")).sendKeys(num);
	}
	
	@When("^enter DOB as \"([^\"]*)\"$")
	public void dob(String DOB) {
		driver.findElement(By.id("dob")).sendKeys(DOB);
	}
	
	@When("^address as \"([^\"]*)\"$")
	public void Address(String address) {
		driver.findElement(By.id("address")).sendKeys(address);
	}
	@When("^Security Question as \"([^\"]*)\"$")
	public void SeqQues(String seq) {
		WebElement dropdown= driver.findElement(By.id("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByIndex(0);
	}
	
	@When("^Answer as \"([^\"]*)\"$")
	public void Answer(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	}
	
	@When("^click on Register$")
	public void register() {
		driver.findElement(By.name("Submit")).click();
	}
	
}

