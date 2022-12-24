package Odev_Task;

import Utilities.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectHW extends BaseTest {




    @Test
    public void test(){
        //- https://demoqa.com/select-menu sitesine gidin
        driver.get("https://demoqa.com/select-menu");
        //     - Multiple select yapabileceginiz <select> elementini locate edin
        WebElement multipleSelect =driver.findElement(By.xpath("//div[contains(@class,'col-md-6')]//select[@id='cars']"));
        // -Birden fazla secim yapip secimlerinizi DOGRULAyin
        Select select = new Select(driver.findElement(By.id("cars")));
        System.out.println(select.isMultiple());

        select.selectByValue("volvo");
        select.selectByVisibleText("Audi");
        Assert.assertTrue(!multipleSelect.isSelected());
    }

    }

