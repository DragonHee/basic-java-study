package problem;

interface Talkable{
    void talk();
}

class Korean implements Talkable{

    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable{

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}
public class P4 {
    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
    static void speak(Talkable t){
        t.talk();
    }
}

