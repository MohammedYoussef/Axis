import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_REG_001 {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON userCredentials;
    String email = "user" + (int)(Math.random() * 10000) + "@test.com";


    //    @SneakyThrows
//    @Test(description = "Login As Admin")
//    public void LoginAsExternal_Test() {
//        new Register_page(driver).Login_ExternalUser("isadorasup","123456");
//        new IncidentCreation_Page(driver).Login_ExternalUser("marinaentity");
//
//    }
    @Test
    public void Open_Registeration_Page () throws InterruptedException {
        new Register_page(driver).Open_Registeration_Form("Mohamed","Youssef","Mostafa",email,
                "123456789","123456789");
    }


    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        //userCredentials = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/userCredentials.json");
    }
}




