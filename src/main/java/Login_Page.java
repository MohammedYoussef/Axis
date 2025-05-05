import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Login_Page {
    private SHAFT.GUI.WebDriver driver;
    private String url = "https://ecommerce.tealiumdemo.com/";

    //*********************Constructor*********************//
    public Login_Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    public By Popup_RadioBTN = By.xpath("(//div//input[@type=\"radio\"])[1]");
    public By Submit_BTN = By.xpath("//div[@class=\"button right\"]");
    public By Account_DropDown = By.xpath("(//span[@class=\"label\"])[3]");
    public By Login_OPT = By.xpath("//li//a[@title=\"Log In\"]");
    public By Email = By.xpath("(//input[@type=\"email\"])[1]");
    public By Password = By.xpath("(//input[@type=\"password\"])");
    public By Login_BTN = By.xpath("(//button[@type=\"submit\"])[2]");
    public By Invalid_TXT = By.xpath("//*[@id=\"top\"]/body/div[2]/div/div[2]/div/div/div[2]/ul/li/ul/li");


    public void Login(String email , String Pass){
        driver.browser().navigateToURL(url);
        driver.assertThat().element(Account_DropDown).exists().perform();
        driver.element().click(Popup_RadioBTN);
        driver.element().click(Submit_BTN);
        driver.element().click(Account_DropDown);
        driver.element().click(Login_OPT);
        driver.element().type(Email,email);
        driver.element().type(Password,Pass);
     //   driver.element().click(Login_BTN);
        driver.element().type(Email,email);
        driver.element().click(Login_BTN);

    }
    public void NegativeLogin (String email , String Pass){

        driver.browser().navigateToURL(url);
        driver.assertThat().element(Account_DropDown).exists().perform();
        driver.element().click(Popup_RadioBTN);
        driver.element().click(Submit_BTN);
        driver.element().click(Account_DropDown);
        driver.element().click(Login_OPT);
        driver.element().type(Email,email);
        driver.element().type(Password,Pass);
        //   driver.element().click(Login_BTN);
        driver.element().type(Email,email);
        driver.element().click(Login_BTN);
        driver.assertThat().element(Invalid_TXT).exists().withCustomReportMessage("Invalid login or password.\n").perform();
    }

}
