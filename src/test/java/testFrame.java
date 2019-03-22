import actions.Actions;
import actions.AllowPermission;
import driver.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.RandomNum;


public class testFrame {

    private AndroidDriver driver;
    //随机手机号
    private  String phone = RandomNum.randomPhone();
    private  String passwd = "123456";

    @BeforeClass
    public void setup()throws Exception{
        driver = AppDriver.start();
        AllowPermission.allowPer();
    }


    @Test
    public void b1register() throws Exception {
        //点击注册按钮
        Actions.click(By.id("com.mingtimes.loginpage:id/goRegister"));
        //输入手机号、密码验证码
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userMobile") , phone);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazz") , passwd);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazzRepeat") , passwd);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userVCode") , "000000");
        //点击发送验证码
        Actions.click(By.id("com.mingtimes.loginpage:id/vaildCode"));
        //点击同意协议
        Actions.click(By.id("com.mingtimes.loginpage:id/radioBtn"));
        //点击注册
        Actions.click(By.id("com.mingtimes.loginpage:id/btnRegister"));

        //校验是否成功
        try{
            //Actions.getText(By.xpath("//*[contains(@text,'注册成功')]"));
        }catch (Exception e){
            throw new Exception("断言失败");
        }


        //Assert.assertEquals("操作成功",toast,"校验失败");

    }

    @Test
    public void c1login(){
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userMobile") , phone);
        Actions.sendKeys(By.id("com.mingtimes.loginpage:id/userPazz") , passwd);
        Actions.click(By.id("com.mingtimes.loginpage:id/btnLogin"));
    }




    @AfterClass
    public void close() throws Exception{
        Thread.sleep(5000);

        driver.quit();
    }






}
