package indexpage;

import actions.Actions;
import org.openqa.selenium.By;

public class index {
    //个人信息
    static By userinfoButten = By.id("com.mingtimes.quanclubs:id/userHead");

    //点击个人信息
    public static void clickUserInfo(){
        Actions.click(userinfoButten);
    }

}
