package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C3_RobotClass extends BaseTest {
    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }
@Test
    public void test()  throws AWTException, InterruptedException {
    driver.get("https://demo.guru99.com/test/upload/");
  WebElement input = driver.findElement(By.id("uploadfile_0"));

    input.sendKeys("C:\\Users\\Sinan\\IdeaProjects\\CWJunitSelenium1\\src\\test\\java\\resoruces\\Robot.txt");
   Robot robot = new Robot();

   robot.keyPress(KeyEvent.VK_CONTROL);//keyPress tusa basili tutar, ctrl ye bastik
   robot.keyPress(KeyEvent.VK_S);//s tusuna bastik
    Thread.sleep(3000);

    robot.keyRelease(KeyEvent.VK_CONTROL);// keyRelease tusu serbest birakir
    robot.keyRelease(KeyEvent.VK_S);
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER); //enter tusuna bastik
    robot.keyRelease(KeyEvent.VK_ENTER); // enter tusunu biraktik
    Thread.sleep(2000);
    robot.keyPress(KeyEvent.VK_LEFT);//sol ok
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_LEFT);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);


}


}
