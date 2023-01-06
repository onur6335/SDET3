package Gun09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _00_soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Onur");
        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Kral");
        WebElement submit= driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement text = driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",text.getText());

        BekleKapat();
    }
}