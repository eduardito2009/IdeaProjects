package class02;
/*navigate to fb.com
click on create new account
fill up all the textbooks
click on sign up button
close the pop-up
close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Facebook{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Joe");
        driver.findElement(By.name("lastname")).sendKeys("bale");
        driver.findElement(By.name("reg_email__")).sendKeys("Chrisbat@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Chrisbat@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Batmobile1234");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.id("u_3_9_Vh")).click();
        driver.quit();





    }
}
