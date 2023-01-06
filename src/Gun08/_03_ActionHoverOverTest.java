package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        WebElement mucevher= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement biKolye= driver.findElement(By.id("catnav-l3-10881"));
        Actions aksiyonlar=new Actions(driver);
        Bekle(2);
        aksiyonlar.moveToElement(mucevher).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(biKolye).build().perform();
        biKolye.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));

        Bekle(2);
        BekleKapat();


    }
}
