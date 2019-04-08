package publish.drivers;

import actions.AllowPermission;
import driver.AppDriver;
import org.testng.annotations.BeforeClass;

public class StartUp extends MobileDriver {
    @BeforeClass
    public void setup()throws Exception{
        driver = AppDriver.start();
        AllowPermission.allowPer();
    }
}
