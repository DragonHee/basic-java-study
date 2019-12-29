package chap2.sec5;

public class CompLogicDemo {
    public static void main(String[] args) {
        int x = 0, y = 1;
        System.out.println((x < 1) || (y-- < 1));
        System.out.println("x = " + x + ", y = " + y);

        x = 0;
        y = 1;
        System.out.println((x < 1) | (y-- < 1));
        System.out.println("x = " + x + ", y = " + y);
        // || 와 && 는 short circuit을 사용하고 | 와 & 는 사용하지 않는다.
        // |와 &는 피연산자가 정수일때 비트연산자로 사용된다.
    }
}
