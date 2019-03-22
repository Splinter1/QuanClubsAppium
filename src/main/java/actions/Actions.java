package actions;

import driver.AppDriver;
import find.AppElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends AppDriver {

    //点击事件
    public static void click(By by){
        AppElementUtils.findElement(by).click();
    }

    public static void sendKeys(By by,String text){
        WebElement element = AppElementUtils.findElement(by);
        //先清空
        element.clear();
        element.sendKeys(text);
    }

    public  static String getText(By by){
        String  a = AppElementUtils.findElement(by).getText();
        return a ;
    }

}
