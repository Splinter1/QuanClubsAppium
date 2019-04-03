package loginpages;

import actions.Actions;
import org.openqa.selenium.By;

public class LoginPage {
    //注册按钮
    static By loginButten = By.id("com.mingtimes.quanclubs:id/btnLogin");
    //手机号输入框
    static By mobileText = By.id("com.mingtimes.quanclubs:id/userMobile");
    //密码输入框
    static By passwordText = By.id("com.mingtimes.quanclubs:id/userPazz");
    //注册按钮
    static By goRegisterButton = By.id("com.mingtimes.quanclubs:id/goRegister");
    //重置密码
    static By resetPasswordButton = By.id("com.mingtimes.quanclubs:id/forgetPazz");

    public static void clickLogin(){
        Actions.click(loginButten);
        return;
    }

    public static void registerButton(){
        Actions.click(goRegisterButton);
        return;
    }

    public static void resetpassword(){
        Actions.click(resetPasswordButton);
        return;
    }

    public static void senduserinfo(String mobile,String password){
        Actions.sendKeys(mobileText , mobile);
        Actions.sendKeys(passwordText , password);
        clickLogin();
        return;
    }
}
