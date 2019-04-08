import actions.Actions;
import actions.AllowPermission;
import driver.AppDriver;
import find.isHere;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.RandomNum;

import static actions.Actions.getText;

public class RegisterPage1 {

    private AndroidDriver driver;
    private  String phone = RandomNum.randomPhone();
    By userMboile = By.id("com.mingtimes.quanclubs:id/userMobile");

    @BeforeClass
    public void setup()throws Exception{
        driver = AppDriver.start();
        AllowPermission.allowPer();
    }

    @Test
    public void aExistingPhone() throws Exception {
        //点击注册按钮
        Actions.click(By.id("com.mingtimes.quanclubs:id/goRegister"));
        //输入已存在的手机号
        Actions.sendKeys(userMboile , "15312200089");
        //点击发送验证码
        Actions.click(By.id("com.mingtimes.quanclubs:id/vaildCode"));
        //校验是否成功
//        try{
//            getText(By.xpath("//*[contains(@text,'手机号码已存在')]"));
//        }catch (Exception e){
//            throw new Exception("未报错：手机号码已存在");
//        }
//        if(isHere.isElementExist(driver,By.xpath("//*[contains(@text,'手机号码已存在')]"))){
//            System.out.println("未报错：手机号码已存在");
//        }else{
//            System.out.println("有问题");
//        }
        Assert.assertEquals(true,isHere.whereToast(driver,"手机号码已存在"));

    }
//
//    @Test
//    public void bRegister()throws Exception{
//        //输入正确手机号
//        Actions.sendKeys(userMboile , phone);
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazz") , "000000");
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazzRepeat") , "000000");
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userVCode") , "000000");
//        //点击发送验证码
//        Actions.click(By.id("com.mingtimes.quanclubs:id/vaildCode"));
//        //同意协议
//        Actions.click(By.id("com.mingtimes.quanclubs:id/radioBtn"));
//        //点击注册
//        Actions.click(By.id("com.mingtimes.quanclubs:id/btnRegister"));
//        //校验是否成功
//        try{
//            String a = Actions.getText(By.id("com.mingtimes.quanclubs:id/btnLogin"));
//            Assert.assertEquals(a,"立即登录");
//        }catch (Exception e){
//            throw new Exception("注册失败");
//        }
//    }
//
//    @Test
//    public void cChangePasswd()throws Exception{
//        //进入忘记密码页面
//        Actions.click(By.id("com.mingtimes.quanclubs:id/forgetPazz"));
//        //判断是否为找回密码页面
//        String a = Actions.getText(By.id("com.mingtimes.quanclubs:id/userForget"));
//        Assert.assertEquals(a,"找回密码");
//        //输入不存在的手机号码
//        String newphone = RandomNum.randomPhone();
//        Actions.sendKeys(userMboile , newphone);
//        Actions.click(By.id("com.mingtimes.quanclubs:id/vaildCode"));
//        try{
//            getText(By.xpath("//*[contains(@text,'手机号码不存在')]"));
//        }catch (Exception e){
//            throw new Exception("报错：手机号码不存在");
//        }
//        Actions.sendKeys(userMboile , phone);
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazz") , "123456");
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazzRepeat") , "123456");
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userVCode") , "000000");
//        //点击发送验证码
//        Actions.click(By.id("com.mingtimes.quanclubs:id/vaildCode"));
//        //点击确认
//        Actions.click(By.id("com.mingtimes.quanclubs:id/btnSure"));
//        //校验是否成功
//        try{
//            String b = Actions.getText(By.id("com.mingtimes.quanclubs:id/btnLogin"));
//            Assert.assertEquals(b,"立即登录");
//        }catch (Exception e){
//            throw new Exception("注册失败");
//        }
//    }
//
//
//
//    @Test
//    public void dLogin()throws Exception{
//        //输入错误密码
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userMobile") , phone);
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazz") , "000000");
//        Actions.click(By.id("com.mingtimes.quanclubs:id/btnLogin"));
//        try{
//            Actions.getText(By.xpath("//*[contains(@text,'账号不存在或密码错误')]"));
//        }catch (Exception e){
//            throw new Exception("断言失败");
//        }
//        //输入正确账号密码
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userMobile") , phone);
//        Actions.sendKeys(By.id("com.mingtimes.quanclubs:id/userPazz") , "123456");
//        Actions.click(By.id("com.mingtimes.quanclubs:id/btnLogin"));
//    }

    @AfterClass
    public void close()throws Exception{
        Thread.sleep(10000);
        driver.quit();
    }


}
