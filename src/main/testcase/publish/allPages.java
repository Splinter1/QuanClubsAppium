package publish;

import actions.AllowPermission;
import driver.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import loginpages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.RandomNum;

public class allPages {

    private AndroidDriver driver;
    private String randomMobile = RandomNum.randomPhone();

    @BeforeClass
    public void setup()throws Exception{
        driver = AppDriver.start();
        AllowPermission.allowPer();
    }
    @AfterClass
    public void close()throws Exception{
        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void Login(){
        LoginPage.senduserinfo("15312200089","123456");
        LoginPage.clickLogin();
    }



}
