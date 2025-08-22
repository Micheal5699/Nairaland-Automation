package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class Entertainment extends BaseTest {

    @Test
    public void testHomePage() throws InterruptedException {
        driver.get("https://www.nairaland.com/entertainment");
        
        //Access Entertainment forum
        driver.findElement(By.xpath("//a[normalize-space()='Jokes Etc']")).click();
        Thread.sleep(10000);
        System.out.println("Entertainment forum accessed!");
        System.out.println("Jokes and topics accessed!");
    }
}