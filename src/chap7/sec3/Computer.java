package chap7.sec3;

public class TV implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("turnON tv...");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOFF tv...");
    }
}
