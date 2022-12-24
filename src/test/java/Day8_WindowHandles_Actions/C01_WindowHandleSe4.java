package Day8_WindowHandles_Actions;

import Utilities.BaseTest;
import org.bouncycastle.util.Arrays;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {
    // https://testproject.io/

    // https://blog.testproject.io/

    @Override
    public void tearDown(){


    }
    @Test
    public void newWindow() {
        //Ana sekmemizde url i ziyaret ediyoruz
        driver.get("https://testproject.io/");

        ///Yeni pencere oluşturup o pencereye switch ediyoruz.
        driver.switchTo().newWindow(WindowType.WINDOW);

        //Yeni penceremizde url imizi ziyaret ediyoruz
        driver.get("https://blog.testproject.io/");
    }
    @Test
    public void newTab() {
        //Ana sekmemizden testproject açıldı
        driver.get("https://testproject.io/");

        //Yeni bir sekme oluşturuldu
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

        //Yeni sekmeden amazona gidildi
        newTab.get("https://www.amazon.com/");
        //Aktif tab in TİTLE i yazdirildi-> Aktif tab imiz = yeni olusturulan tab
        System.out.println(driver.getTitle());
    }
    @Test
    public void handleWindows(){
        //Yeni pencere oluşturduk
        driver.switchTo().newWindow(WindowType.WINDOW);
        //Yeni pencerede GOOGLE actık
        driver.get("https://www.google.com/");

        Set<String> handles=driver.getWindowHandles();
        Iterator<String>i= handles.iterator();

        while (i.hasNext()) {
            String currentTab = i.next();
            driver.switchTo().window(currentTab);

            System.out.println(driver.getTitle());
            /* 1. yol
            if (!driver.getWindowHandle().equals(homePageHandle){
            driver.close();    }
             */
            /*
            2.yol
            if (!driver.getTitle().contains("Spend")){
                driver.close();
            }
             */
        }

        }



    }

    

