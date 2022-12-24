package Day7_İframeWindowsHandels;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class C03_WindowHandles extends BaseTest {
    //    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
//    Print the existing windowHandles ids by clicking all the links on the page.
//    Click on the links that open a new page.
//    Close other pages other than the home page.
//    Set the driver back to the main page.
@Override
    public void tearDown(){

}
@Test
    public void windowHandles() {
    driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
    //Daha sonra kullanabilmek adina ana sayfa id mizi sakliyoruz
    String homePageId = driver.getWindowHandle();

    //Yeni sekmeler oluşturmak adina target =_blank olan linklerden 2 tanesine tikliyoruz
    List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
    links.get(0).click();
    links.get(1).click();

    //Iterate etmek için (gezinmek için) tum tab ve window id lerini bir set içinde saklıyoruz
    Set<String> windows = driver.getWindowHandles();

    //Gezinme islemi icin iterator
    //while(iterator.hasNext()){
    //Her bir gezinilen id kullanılarak o anki sekmeye switch ediyoruz
    //driver.switchTo().window(iterator.next());

    //Switch ettiğimiz sayfanın ana sayfa olup olmadığını kontrol ediyoruz.Anasayfa ise sekmeyi kapatmiyoruz,
    // degilse kapatıyoruz
    if (driver.getWindowHandle().equals(homePageId)) {
        //driver.close es geciyoruz
        // continue;}
        //Sekmeyi kapatıyoruz
        driver.close();

    }


}}