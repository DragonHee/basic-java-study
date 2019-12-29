package chap2.sec5;

public class BitOperationDemo {
    public static void main(String[] args) {
        System.out.printf("%x\n", 0b0101 & 0b0011);
        System.out.printf("%x\n", 0b0101 | 0b0011);
        System.out.printf("%x\n", 0b0101 ^ 0b0011);
        System.out.printf("%x\n", (byte)~0b00000001);
        System.out.printf("%x\n", 0b0110 >> 2);
        System.out.printf("%x\n", 0b0110 << 2);

        int i1 = -10;
        int i2 = i1 >> 1;
        int i3 = i1 >>> 1;
        System.out.printf("%x -> %d\n", i1, i1);
        System.out.printf("%x -> %d\n", i2, i2);
        System.out.printf("%x -> %d\n", i3, i3);
        // >>> 연산자는 최상위 비트를 0으로 채운다.
    }
}
