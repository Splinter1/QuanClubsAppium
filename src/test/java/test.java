import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class test {

    private AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, "");
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "841f846e"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "8.0");

//        //将上面获取到的包名和Activity名设置为值
        cap.setCapability("appPackage", "com.mingtimes.loginpage");
        cap.setCapability("appActivity", "com.mingtimes.loginpage.ui.guide.GuideActivity");
//        //cap.setCapability("automationName", "uiautomator2");
//
//        //A new session could not be created的解决方法
        cap.setCapability("appWaitActivity","com.mingtimes.loginpage.ui.guide.GuideActivity");
//        //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        cap.setCapability("sessionOverride", true);

//        Thread.sleep(10000);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    }

    @Test
    public void plus()throws  Exception{
        Thread.sleep(10000);
        driver.sendKeyEvent(66);

//        Thread.sleep(1000);
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//        Thread.sleep(1000);
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//        Thread.sleep(1000);
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//        Thread.sleep(1000);


        //点击输入密码与账号
        driver.findElementById("com.mingtimes.loginpage:id/passwordLogin").click();
        //输入账号以及密码
        driver.findElementById("com.mingtimes.loginpage:id/userMobile").sendKeys("15312200089");
        //输入密码
        driver.findElementById("com.mingtimes.loginpage:id/userPazz").sendKeys("123456");
        //获取=
        driver.findElementById("com.mingtimes.loginpage:id/btnLogin").click();


    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(5000);

        driver.quit();

    }

}
