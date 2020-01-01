package problem;


import javax.naming.ldap.Control;

abstract class Controller{
    private boolean power;

    public Controller(boolean power){
        this.power = power;
    }
    public void show(){

    }

    public boolean isPower() {
        return power;
    }

    public abstract String getName();
}

class TV extends Controller{

    public TV(boolean power) {
        super(power);
    }

    @Override
    public String getName() {
        return "TV";
    }

    public void show(){
        if(super.isPower())
            System.out.println(getName() + "가 켜졌습니다.");
        else
            System.out.println(getName() + "가 꺼졌습니다.");
    }
}

class Radio extends Controller{

    public Radio(boolean power) {
        super(power);
    }

    @Override
    public String getName() {
        return "라디오";
    }

    public void show(){
        if(super.isPower())
            System.out.println(getName() + "가 켜졌습니다.");
        else
            System.out.println(getName() + "가 꺼졌습니다.");
    }
}
public class P5 {
    public static void main(String[] args) {
        Controller[] c = {new TV(false), new Radio(true)};

        for(Controller controller : c)
            controller.show();
    }
}
