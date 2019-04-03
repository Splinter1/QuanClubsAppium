package loginpages;

import actions.Actions;
import org.openqa.selenium.By;

public class ResetPassword {
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
    //确认按钮
    static By okButton = By.id("com.mingtimes.quanclubs:id/btnSure");
    //验证码
    static String VcodeNum = "000000";

    public static void setOkButton (){
        Actions.click(okButton);
    }

    public static void setVCodeButton (){
        Actions.click(VCodeButton);
    }

    public static void reSet(String mobile,String password){
        Actions.sendKeys(mobileText , mobile);
        Actions.sendKeys(passwordText , password);
        Actions.sendKeys(passwordTextagain , password);
        setVCodeButton();
        Actions.sendKeys(VCode , VcodeNum);
        setOkButton();
    }

}
