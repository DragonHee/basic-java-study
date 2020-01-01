package problem;

interface Edible{
    void eat();
}

interface Sweetable{
    void sweet();
}

interface Delicious extends Edible, Sweetable{

}
public class P2 {
}
