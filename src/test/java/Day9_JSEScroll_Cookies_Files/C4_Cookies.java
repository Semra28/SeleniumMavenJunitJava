package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C4_Cookies extends BaseTest {
    // Go to URL: https://kitchen.applitools.com/ingredients/cookie
    // Get Cookie.
    // Find the total number of cookies.
    // Print all the cookies.
    // Add Cookie.
    // Edit Cookie.
    // Delete Cookie.
    // Delete All Cookies.

    @Test
    public void testCookie() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("test get cookie");
        Cookie cookie = driver.manage().getCookieNamed("protein");
        Set<Cookie> allCookies= driver.manage().getCookies();
        int numOfCookies = allCookies.size();
        System.out.println("numOfCookies="+numOfCookies);

        // Print all the cookies.
        for (Cookie each : allCookies) {
            System.out.println("each cookie="+each.getName());
            System.out.println("each cookie name:"+each.getName());
            System.out.println("each cookie value:"+each.getValue());

            //Add Cookie.
            System.out.println("add Cookie");
            Cookie cookie1=new Cookie("fruit","apple");
            driver.manage().addCookie(cookie1);
            Assert.assertEquals(cookie1.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
            ;
            allCookies=driver.manage().getCookies(); //sayfada var olan cookileri dondurur
            System.out.println("allCookies="+ allCookies.size());

            //Edıt cookie.
            System.out.println("edit cookie");
            Cookie editedCookie=new Cookie(cookie1.getName(),"mango");
            driver.manage().addCookie(editedCookie);

            Assert.assertEquals(editedCookie.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
            System.out.println(driver.manage().getCookieNamed(cookie1.getName()).getValue());

        }
    }



}
