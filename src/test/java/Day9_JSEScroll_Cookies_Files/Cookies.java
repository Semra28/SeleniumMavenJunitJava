package Day9_JSEScroll_Cookies_Files;

import Utilities.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.awt.*;
import java.util.Set;

public class Cookies extends BaseTest {
    //Go to URL: http://facebook.com
    //getCookies,
    // addCookie,
    //deleteCookieNamed,
    //deleteAllCookies.
 @Test
 public void cookietest() throws AWTException, InterruptedException {
     //Go to URL: http://facebook.com
     driver.get("http://facebook.com");
     //getCookies
     Set<Cookie> allCookies =driver.manage().getCookies();
     System.out.println(allCookies.size());
     Thread.sleep(2000);
      Cookie cookie=new Cookie("our cookie","telegram");
      driver.manage().addCookie(cookie);
      allCookies=driver.manage().getCookies();
     System.out.println(allCookies.size());//5
       //deleteCookieNamed,
     driver.manage().deleteCookieNamed("our cookie");
     allCookies=driver.manage().getCookies();
     System.out.println(allCookies.size());//4

     //deleteAllCookies.
     driver.manage().deleteAllCookies();
     allCookies=driver.manage().getCookies();
     System.out.println(allCookies.size());//0





 }



}
