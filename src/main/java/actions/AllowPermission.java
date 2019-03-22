package actions;

import org.openqa.selenium.By;

public class AllowPermission {

    public static void allowPer()throws  Exception{
        Actions.click(By.id("com.android.packageinstaller:id/permission_allow_button"));
        Actions.click(By.id("com.android.packageinstaller:id/permission_allow_button"));
        Actions.click(By.id("com.android.packageinstaller:id/permission_allow_button"));
        //跳过广告
        Thread.sleep(2000);
        Actions.click(By.id("com.mingtimes.quanclubs:id/skip_view"));
    }
}
