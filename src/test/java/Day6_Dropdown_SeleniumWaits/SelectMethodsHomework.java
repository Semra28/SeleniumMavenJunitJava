package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectMethodsHomework {
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();

    }
    @Test
    public void Test() {
        //siteye gidiş
        driver.get("https://demoqa.com/select-menu");
        //select> elementini locate etme işlemi
        WebElement options = driver.findElement(By.id("oldSelectMenu"));


        Select select = new Select(options);
        List<WebElement> secenekler = select.getOptions();
        for (WebElement option : secenekler) {
            System.out.println(option.getText());

            //selectByIndex-selectbyValue-selectByVisibleText methodlarını kullanarak;
            //Yellow (index)
            //    * Purple (value)
            //    * Black  (text)
            //    seceneklerini secin
            select.selectByIndex(3);
            select.selectByValue("4");
            select.selectByVisibleText("Black");

        }

    }}
