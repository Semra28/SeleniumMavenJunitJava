package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassHMW extends BaseTest {




        @Test
        public void  Turbo () throws AWTException, InterruptedException {
            //https://api.jquery.com/ sitesine gidelim
            driver.get("https://api.jquery.com/");
            Thread.sleep(2000);

            // arama alanina json yazalimWebElement search = driver.findElement(By.name("s"));
            search.sendKeys("json");
            // Enter islemini robot class kullanrak yapalim
            Robot robot=new Robot();

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

    }
}