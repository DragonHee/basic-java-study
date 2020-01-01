package problem;

import chap6.sec8.Person;

interface Human{
    void eat();
    default void print(){
        System.out.println("인간입니다.");
    }
    static void echo(){
        System.out.println("야호!!!");
    }
}
class Worker implements Human{
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
}

class Student implements Human{
    private int num;

    public Student(int num) {
        this.num = num;
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println("학생입니다.");
    }
}
public class P7 {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Worker p = new Worker();
        p.print();
        p.eat();
    }
}
