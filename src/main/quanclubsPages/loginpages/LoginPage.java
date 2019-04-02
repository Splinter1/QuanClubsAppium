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


    public static  void clickLogin(){
        Actions.click(loginButten);
        return;
    }

    public static void senduserinfo(String mobile,String password){
        Actions.sendKeys(mobileText , mobile);
        Actions.sendKeys(passwordText , password);
        return;
    }
}
