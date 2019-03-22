package tools;

public class RandomNum {

    public static String randomPhone() {
        String num  = "";
        num = String .valueOf((long)(Math.random() * Math.pow(10 , 8)));
        String phone = "151"+num;
        return phone;
    }

}
