package Day5_LocatorPratice;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.time.Duration;

public class C05_CheckboxesHomework {
    //    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.
//    Verify that "You have selected" is visible.
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
    public void CheckboxesHomework() throws InterruptedException {
        driver.get("https://demoqa.com/");
        WebElement CheckboxesHomework= driver.findElement(By.xpath("(//div [@class='card-body'][1]"));
        CheckboxesHomework.click();

        WebElement CheckboxesHomeworkButton=driver.findElement(By.xpath("//span[@class='text'][1]"));
        CheckboxesHomeworkButton.click();

        WebElement HomeworkCheckboxes=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        HomeworkCheckboxes.click();
        Assert.assertTrue(HomeworkCheckboxes.isDisplayed());
    }
}

