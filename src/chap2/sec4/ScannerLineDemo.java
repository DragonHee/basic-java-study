package chap2.sec4;

import java.util.Scanner;

public class ScannerLineDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("문장(띄어쓰기 포함)을 입력하세요.");
        String s =  in.nextLine();
        System.out.println("nextLine() : " + s);

        System.out.println("문장(띄어쓰기 포함)을 입력하세요.");
        s = in.next();
        System.out.println("next() : " + s);

    }
}
