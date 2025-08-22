package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class HomePage extends BaseTest {

    @Test
    public void testHomePage() throws InterruptedException {
        driver.get("https://www.nairaland.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Nairaland"), "Homepage did not load correctly!");
        Thread.sleep(5000);
        System.out.println("Homepage title verified successfully");
        
        //Search for a forum
        driver.findElement(By.name("q")).sendKeys("Entertainment");
        driver.findElement(By.name("search")).click();
        Thread.sleep(10000);
        System.out.println("Entertainment category found");
    }
}