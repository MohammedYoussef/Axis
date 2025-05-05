import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC_LOG_005 {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON userCredentials;




    @Test
    public void InvalidCredential_Login (){
        new Login_Page(driver).NegativeLogin(userCredentials.getTestData("Invalid_USername"), userCredentials.getTestData("Paass") );
    }


    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        userCredentials = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/userCredentials.json");
    }
}
