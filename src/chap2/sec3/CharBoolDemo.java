package chap2.sec3;

public class CharBoolDemo {
    public static void main(String[] args) {
        char ga1 = '가';
        char ga2 = '\uac00';
        boolean cham = true;
        boolean geogit = false;

        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(cham + "가 아니면 " + geogit + "입니다.");
    }
}
