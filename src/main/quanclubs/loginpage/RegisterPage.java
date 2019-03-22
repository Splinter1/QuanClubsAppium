package loginpage;

import actions.Actions;
import actions.AllowPermission;
import driver.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.RandomNum;

import static actions.Actions.getText;

public class RegisterPage {

    private AndroidDriver driver;
    private  String phone = RandomNum.randomPhone();
    private  String passwd = "123456";

    @BeforeClass
    public void setup()throws Exception{
        driver = AppDriver.start();
        AllowPermission.allowPer();
    }

    @Test
    public void aExistingPhone() throws Exception {
        //点击注册按钮
        Actions.click(By.id("com.mingtimes.loginpage:id/goRegister"));
        //输入已存在的手机号
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userMobile") , "15312200089");
        //点击发送验证码
        Actions.click(By.id("com.mingtimes.loginpage:id/vaildCode"));
        //校验是否成功
        try{
            getText(By.xpath("//*[contains(@text,'手机号码已存在')]"));
        }catch (Exception e){
            throw new Exception("未报错：手机号码已存在");
        }
    }

    @Test
    public void bRegister()throws Exception{
        //输入正确手机号
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userMobile") , phone);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazz") , passwd);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazzRepeat") , passwd);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userVCode") , "000000");
        //点击发送验证码
        Actions.click(By.id("com.mingtimes.loginpage:id/vaildCode"));
        //校验是否成功
        try{
            String a = Actions.getText(By.id("com.mingtimes.quanclubs:id/btnLogin"));
            Assert.assertEquals(a,"立即登录");
        }catch (Exception e){
            throw new Exception("注册失败");
        }
    }

    @Test
    public void cLogin(){
        //输入错误密码
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userMobile") , phone);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazz") , "000000");
        Actions.click(By.id("com.mingtimes.loginpage:id/btnLogin"));
    }

    @AfterClass
    public void close()throws Exception{
        Thread.sleep(10000);
        driver.quit();
    }


}
