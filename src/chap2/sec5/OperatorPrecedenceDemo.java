package chap2.sec5;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.printf("%d\t%d\t%d\n", x, y, z);

        int year = 2018;
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
