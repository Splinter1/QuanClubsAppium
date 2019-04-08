package publish.drivers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ShutDown extends MobileDriver {
    @AfterClass
    public void close()throws Exception{
        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void testcase78456 (){
        System.out.println("测试完毕");
    }
}
