package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class GeneralForum extends BaseTest {

    @Test
    public void testHomePage() throws InterruptedException {
        driver.get("https://www.nairaland.com/nairaland");
        
        //Access Entertainment forum
        driver.findElement(By.cssSelector("a[href='/politics/1']")).click();
        Thread.sleep(10000);
        System.out.println("General forum accessed!");
        System.out.println("Politics topic accessed!");
    }
}