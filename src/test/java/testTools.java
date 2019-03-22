import org.testng.annotations.Test;
import tools.RandomNum;

import java.util.Random;

public class testTools {

    @Test
    public void random(){
        String a = RandomNum.randomPhone();
        System.out.println(a);
    }
}
