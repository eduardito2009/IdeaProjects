package class02;
/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Christian");
        driver.findElement(By.id("customer.lastName")).sendKeys("Miranda");
        driver.findElement(By.name("customer.address.street")).sendKeys("1234 Adelay CTW");
        driver.findElement(By.name("customer.address.city")).sendKeys("Frederick");
        driver.findElement(By.name("customer.address.state")).sendKeys("MD");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("21702");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("240 543 3503");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-21-3460");
        driver.findElement(By.name("customer.username")).sendKeys("Chris1010");
        driver.findElement(By.id("customer.password")).sendKeys("May100307");
        driver.findElement(By.id("repeatedPassword")).sendKeys("May100307");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.close();








    }
}
