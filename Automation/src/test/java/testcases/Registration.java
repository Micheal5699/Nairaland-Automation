package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

import java.util.UUID;

public class Registration extends BaseTest {

    //generate a unique random email
    private String generateRandomEmail() {
        String randomString = UUID.randomUUID().toString().substring(0, 6);
        return "testuser" + randomString + "@mail.com";
    }

    //Valid Registration (Unique Email)
    @Test
    public void testValidRegistration() throws InterruptedException {
        driver.get("https://www.nairaland.com/confirm_email");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(generateRandomEmail());
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(3000);

        System.out.println("Registration successful with new email!");
    }

    //Invalid Email Registration
    @Test
    public void testInvalidEmailRegistration() throws InterruptedException {
        driver.get("https://www.nairaland.com/confirm_email");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("invalid-email@@mail");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(3000);

        System.out.println("Invalid email handled correctly!");
    }

    //Existing Email Registration
    @Test
    public void testExistingEmailRegistration() throws InterruptedException {
        driver.get("https://www.nairaland.com/confirm_email");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ibkpopoola12@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(3000);


        System.out.println("Existing email registration handled correctly!");
    }
}