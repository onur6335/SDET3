package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo= driver.findElement(By.id("box1"));

        WebElement norvec=driver.findElement(By.id("box101"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();
        Bekle(1);

        WebElement Stockholm= driver.findElement(By.id("box2"));
        WebElement Sweden=driver.findElement(By.id("box102"));
        Actions aksiyonlar2=new Actions(driver);
        Action aksiyon2=aksiyonlar.dragAndDrop(Stockholm,Sweden).build();
        aksiyon.perform();
        Bekle(1);




        //2.yöntem
        WebElement seul2= driver.findElement(By.id("box5"));
        WebElement southKorea2=driver.findElement(By.id("box105"));

        aksiyon=aksiyonlar.clickAndHold(seul2).moveToElement(southKorea2).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement stockholm2= driver.findElement(By.id("box2"));
        WebElement sweden2=driver.findElement(By.id("box102"));

        aksiyon=aksiyonlar.clickAndHold(stockholm2).moveToElement(sweden2).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement rome2= driver.findElement(By.id("box6"));
        WebElement italy2=driver.findElement(By.id("box106"));

        aksiyon=aksiyonlar.clickAndHold(rome2).moveToElement(italy2).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement copenhagen= driver.findElement(By.id("box4"));
        WebElement denmark=driver.findElement(By.id("box104"));

        aksiyon=aksiyonlar.clickAndHold(copenhagen).moveToElement(denmark).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement oslo2= driver.findElement(By.id("box1"));
        WebElement norway2=driver.findElement(By.id("box101"));

        aksiyon=aksiyonlar.clickAndHold(oslo2).moveToElement(norway2).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement madrid= driver.findElement(By.id("box7"));
        WebElement spain=driver.findElement(By.id("box107"));

        aksiyon=aksiyonlar.clickAndHold(madrid).moveToElement(spain).release().build();
        aksiyon.perform();
        Bekle(1);

        WebElement washington= driver.findElement(By.id("box3"));
        WebElement abd=driver.findElement(By.id("box103"));

        aksiyon=aksiyonlar.clickAndHold(washington).moveToElement(abd).release().build();
        aksiyon.perform();
        Bekle(1);





        BekleKapat();
    }
}
