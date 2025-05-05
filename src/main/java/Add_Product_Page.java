import com.shaft.driver.SHAFT;
import org.codehaus.groovy.util.ListBufferedIterator;
import org.openqa.selenium.By;
import com.shaft.validation.Validations;
import org.openqa.selenium.Keys;

import java.util.List;


public class Add_Product_Page {
    private SHAFT.GUI.WebDriver driver;
    private String url = "https://ecommerce.tealiumdemo.com/";

    //*********************Constructor*********************//
    public Add_Product_Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //**********************Locators********************//

    public By Accessories_Dropdownlist = By.xpath("//*[@id=\"nav\"]/ol/li[3]");
    public By Shoes_OPT = By.xpath("(//a[@class=\"level1 \"])[12]");
 //   public By ShoeHeader = By.xpath("//div[@class=\"page-title category-title\"]");
    public By Filter_Dropdownlist = By.xpath("(//div//select)[2]");
    public By Shoes = By.xpath("(//li//a//span[@class=\"count\"])[3]");
    public By DorianOxford_OPT = By.xpath("(//a[@title=\"View Details\"])[5]");
    //Select Black color
    public By Color_OPT = By.xpath("(//span[@class=\"swatch-label\"])[1]");
    // Select Size number 12
    public By Size_OPT = By.xpath("(//span[@class=\"swatch-label\"])[6]");
    public By AddToCart_BTN = By.xpath("(//button[@class=\"button btn-cart\"])[2]");

    // Dorian Shoes Success nessage
    public By Dorian_TXT = By.xpath("//*[@id=\"top\"]/body/div[2]/div/div[2]/div/div/div[2]/ul/li/ul/li");



//*************************Functions************************//

    public void Add_product (){
     //   driver.browser().navigateToURL(url);
        driver.element().hover(Accessories_Dropdownlist);
        driver.element().click(Accessories_Dropdownlist);
        driver.element().click(Accessories_Dropdownlist);
        driver.element().click(Shoes);
        driver.element().click(Filter_Dropdownlist);
        driver.element().select(Filter_Dropdownlist,"Price");
        driver.element().click(DorianOxford_OPT);
        driver.element().click(Color_OPT);
        driver.element().click(Size_OPT);
        driver.element().click(AddToCart_BTN);
        driver.assertThat().element(Dorian_TXT).exists().withCustomReportMessage("Dorian Perforated Oxford was added to your shopping cart.\n").perform();
    }


}
