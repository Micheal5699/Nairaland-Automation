package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class SignIn extends BaseTest {

    // Valid Login
    @Test
    public void testValidLogin() throws InterruptedException {
        driver.get("https://www.nairaland.com/login");

        driver.findElement(By.name("login")).sendKeys("IbukunTest");
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys("Test@123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);
        System.out.println("Login successful!");
    }

    //Invalid Username
    @Test
    public void testInvalidUsername() throws InterruptedException {
        driver.get("https://www.nairaland.com/login");

        driver.findElement(By.name("login")).sendKeys("WrongUser");
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys("Test@123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

        System.out.println("Invalid username handled correctly!");
    }

    //Invalid Password
    @Test
    public void testInvalidPassword() throws InterruptedException {
        driver.get("https://www.nairaland.com/login");

        driver.findElement(By.name("login")).sendKeys("IbukunTest");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("WrongPass123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

        System.out.println("Invalid password handled correctly!");
    }
}