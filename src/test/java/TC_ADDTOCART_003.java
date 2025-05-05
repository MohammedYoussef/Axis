import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_ADDTOCART_003 {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON userCredentials;

    @BeforeClass(description = "Load test data from JSON")
    public void beforeClass() {
        userCredentials = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/userCredentials.json");
    }

    @BeforeMethod(description = "Initialize WebDriver before each test")
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
    }

//    @AfterMethod(description = "Quit WebDriver after each test")
//    public void afterMethod() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Test
    public void AddProduct() {
        new Login_Page(driver).Login(userCredentials.getTestData("username"), userCredentials.getTestData("password"));
        new Add_Product_Page(driver).Add_product();
    }
}
