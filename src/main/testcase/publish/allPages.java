package publish;

import actions.AllowPermission;
import driver.AppDriver;
import find.isHere;
import io.appium.java_client.android.AndroidDriver;
import loginpages.LoginPage;
import loginpages.RegisterPage;
import loginpages.ResetPassword;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.RandomNum;

public class allPages {

    private AndroidDriver driver;
    private String randomMobile = RandomNum.randomPhone();
    private String rightPassword = "123456";
    private String worryPassword = "000000";

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
//========================================================================================
    @Test(priority = 1)
    public void register1(){
        LoginPage.registerButton();
        RegisterPage.checkMobile("15312200089");
        Assert.assertEquals(true, isHere.whereToast(driver, "手机号码已存在"));
    }

    @Test(priority = 2)
    public void register2(){
        RegisterPage.registerUser(randomMobile,worryPassword);
        Assert.assertEquals(true, isHere.whereToast(driver, "注册成功"));
    }

    @Test(priority = 3)
    public void forgetPassword(){
        LoginPage.resetpassword();
        ResetPassword.reSet(randomMobile,rightPassword);
        Assert.assertEquals(true, isHere.whereToast(driver, "操作成功"));
    }

    @Test(priority = 4)
    public void login1(){
        LoginPage.senduserinfo(randomMobile,worryPassword);
        Assert.assertEquals(true, isHere.whereToast(driver, "账号不存在或密码错误"));
    }

    @Test(priority = 5)
    public void login2(){
        LoginPage.senduserinfo(randomMobile,rightPassword);
//        Assert.assertEquals(true, isHere.whereToast(driver, "登陆成功"));
    }
}
