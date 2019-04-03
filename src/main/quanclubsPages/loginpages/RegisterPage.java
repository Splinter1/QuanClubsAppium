package loginpages;

import actions.Actions;
import org.openqa.selenium.By;

public class RegisterPage {
    //手机号
    static By mobileText = By.id("com.mingtimes.quanclubs:id/userMobile");
    //密码
    static By passwordText = By.id("com.mingtimes.quanclubs:id/userPazz");
    //重复输入密码
    static By passwordTextagain = By.id("com.mingtimes.quanclubs:id/userPazzRepeat");
    //验证码
    static By VCode = By.id("com.mingtimes.quanclubs:id/userVCode");
    //获取验证码
    static By VCodeButton = By.id("com.mingtimes.quanclubs:id/vaildCode");
    //同意协议
    static By agreeButton = By.id("com.mingtimes.quanclubs:id/radioBtn");
    //注册按钮
    static By registerButton = By.id("com.mingtimes.quanclubs:id/btnRegister");
    //验证码
    static String VcodeNum = "000000";

    public static void setRegisterButton (){
        Actions.click(registerButton);
    }

    public static void setAgreeButton (){
        Actions.click(agreeButton);
    }

    public static void setVCodeButton (){
        Actions.click(VCodeButton);
    }

    public static void registerUser(String mobile,String password){
        Actions.sendKeys(mobileText , mobile);
        Actions.sendKeys(passwordText , password);
        Actions.sendKeys(passwordTextagain , password);
        setVCodeButton();
        Actions.sendKeys(VCode , VcodeNum);
        setAgreeButton();
        setRegisterButton();
    }

    public static void checkMobile(String mobile){
        Actions.sendKeys(mobileText , mobile);
        setVCodeButton();
    }

}
