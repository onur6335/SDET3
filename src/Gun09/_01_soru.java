package Gun09;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoblaze.com/index.html");
        WebElement s6= driver.findElement(By.className("hrefch"));
        s6.click();
        Bekle(2);
        WebElement sepet= driver.findElement(By.cssSelector("[class='btn btn-success btn-lg']"));
        sepet.click();
        Bekle(2);
        driver.switchTo().alert().accept();
        Bekle(2);
        WebElement geri= driver.findElement(By.id("nava"));
        geri.click();
        Bekle(2);

         BekleKapat();


    }
}
