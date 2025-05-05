import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_lOG_002 {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON userCredentials;


//    @Test
//    public void Open_Registeration_Page () throws InterruptedException {
//        new Register_page(driver).Open_Registeration_Form("Mohamed","Youssef","Mostafa",email,
//                "123456789","123456789");
//    }

    @Test  public void Login (){
        new Login_Page(driver).Login(userCredentials.getTestData("username"), userCredentials.getTestData("password") );
    }


    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        userCredentials = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/userCredentials.json");
    }
}
