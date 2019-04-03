package find;

import driver.AppDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AppElementUtils extends AppDriver {

    public static WebElement findElement(final By by){
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e){
            System.out.println("元素查找超时：" +by);
            e.printStackTrace();
        }
        element = driver.findElement(by);

        return element;
    }



    public static List<WebElement> findElements (final By by){

        List<WebElement>  webElement = null;
        try{WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            webElement = driver.findElements(by);
        }catch (Exception e){
            System.out.println("元素查找超时：" +by);
            e.printStackTrace();
        }
        return webElement;
    }
}
