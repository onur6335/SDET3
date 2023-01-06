package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClassGiris extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");
        WebElement cerez=driver.findElement(By.id("sp-cc-accept"));
        cerez.click();
        Bekle(1);

        WebElement giris=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        giris.click();
        Bekle(1);
        WebElement onur=driver.findElement(By.id("ap_email"));
        onur.sendKeys("onurarslan6335@gmail.com");
        Bekle(1);
        WebElement devam=driver.findElement(By.id("continue"));
        devam.click();
        Bekle(1);
        WebElement sifre=driver.findElement(By.id("ap_password"));
        sifre.sendKeys("onur63");
        Bekle(1);
        WebElement girisyap=driver.findElement(By.id("signInSubmit"));
        girisyap.click();

        WebElement menu=driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu=new Select(menu);

        ddmenu.selectByVisibleText("Kitaplar");
        Bekle(1);
        WebElement srchButton=driver.findElement(By.id("nav-search-submit-button"));
        srchButton.click();
        Bekle(1);
        WebElement ekle=driver.findElement(By.className("a-truncate-cut"));
        ekle.click();
        Bekle(1);
        WebElement sepet=driver.findElement(By.id("add-to-cart-button"));
        sepet.click();
        Bekle(1);
        WebElement alis=driver.findElement(By.name("proceedToRetailCheckout"));
        alis.click();

        BekleKapat();
    }
}
