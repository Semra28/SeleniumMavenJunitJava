package Day6_Dropdown_SeleniumWaits;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C05_SeleniumWaits extends BaseTest {
//Explicit wait
@Test
    public void webDeriverWait() {
    driver.get("https://demoqa.com/interaction");
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement category=driver.findElement(By.xpath("//div[@class='icon'])[2]"));
    //elementToBeClickable(Webelement)
    wait.until(ExpectedConditions.elementToBeClickable(category)).click();
    //elementToBeClickable(By)
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(.,'Practice Form')]"))).click();

}
}
