package problem;

abstract class Abstract{
    private int i;

    public Abstract(int i){
        this.i = i;
    }

    public void show(){
        System.out.println("i = " + i);
    }

    public int getI() {
        return i;
    }
}

class Concrete extends Abstract{
    private int j;

    public Concrete(int i, int j) {
        super(i);
        this.j = j;
    }

    public void show(){
        System.out.println("i = " + super.getI() + ", j = " + j);
    }
}
public class P1 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
