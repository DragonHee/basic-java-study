package problem;

interface Printable{

}
class A4 implements Printable{
    public void a(){
        System.out.println("A4");
    }
}
class B4 implements Printable{
    public void b(){
        System.out.println("B4");
    }
}
class Call{
    public void invoke(Printable p){
        if(p instanceof A4)
            ((A4) p).a();
        else if(p instanceof B4)
            ((B4) p).b();
    }

}
public class P6{
    public static void main(String[] args) {
        Printable p = new B4();
        Call c = new Call();
        c.invoke(p);
    }
}
