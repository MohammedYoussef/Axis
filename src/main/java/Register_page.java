import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;

public class Register_page {
    private SHAFT.GUI.WebDriver driver;
    private String url = "https://ecommerce.tealiumdemo.com/";
    private String rror_TXT = "There is already an account with this email address. " +
            "If you are sure that it is your email address, click here to get your password and access your account.\n";


    //*********************Constructor*********************//
    public Register_page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }



    public By Account_DropDown = By.xpath("(//span[@class=\"label\"])[3]");
    public By Register_OPT = By.xpath("//li//a[@title=\"Register\"]");
    public By FirstName_TXT = By.xpath("(//input[@type=\"text\"])[1]");
    public By MiddleName_TXT = By.xpath("(//input[@type=\"text\"])[2]");
    public By LastName_TXT = By.xpath("(//input[@type=\"text\"])[3]");
    public By Email_TXT = By.xpath("(//input[@type=\"email\"])[1]");
    public By Pass_TXT = By.xpath("(//input[@type=\"password\"])[1]");
    public By ConfPass_TXT = By.xpath("(//input[@type=\"password\"])[2]");
    public By Register_BTN = By.xpath("//button[@title=\"Register\"]");
    public By error_TXT = By.xpath("//*[@id=\"top\"]/body/div[2]/div/div[2]/div/div/div[2]/ul/li/ul/li/span");




    public void Open_Registeration_Form(String firstname, String middlename,String lastname,String Email
    ,String Pass , String Confirm_Pass)  {
        driver.browser().navigateToURL(url);
        driver.assertThat().element(Account_DropDown).exists().perform();
        driver.element().click(Account_DropDown);
        driver.element().click(Register_OPT);
        driver.element().type(FirstName_TXT,firstname);
        driver.element().type(MiddleName_TXT, middlename);
        driver.element().type(LastName_TXT,lastname);
        driver.element().type(Email_TXT,Email);
        driver.element().type(Pass_TXT,Pass);
        driver.element().type(ConfPass_TXT,Confirm_Pass);
        driver.element().click(Register_BTN);


    }
    public void RegisterNegative(String firstname, String middlename,String lastname,String Email
    ,String Pass , String Confirm_Pass)  {
        driver.browser().navigateToURL(url);
        driver.assertThat().element(Account_DropDown).exists().perform();
        driver.element().click(Account_DropDown);
        driver.element().click(Register_OPT);
        driver.element().type(FirstName_TXT,firstname);
        driver.element().type(MiddleName_TXT, middlename);
        driver.element().type(LastName_TXT,lastname);
        driver.element().type(Email_TXT,Email);
        driver.element().type(Pass_TXT,Pass);
        driver.element().type(ConfPass_TXT,Confirm_Pass);
        driver.element().click(Register_BTN);
        driver.assertThat().element(error_TXT).exists().withCustomReportMessage("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.\n").perform();



    }

    }

