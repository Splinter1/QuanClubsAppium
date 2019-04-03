package find;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class isHere {
    public static boolean whereToast(WebDriver driver, String toast) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        try {
            driver.findElement(By.xpath("//*[contains(@text,'"+toast+"')]"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean whereID(WebDriver driver, String id) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            driver.findElement(By.id(id));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean whereText(WebDriver driver, String text) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            driver.findElement(By.linkText(text));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
