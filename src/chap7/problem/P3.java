package problem;

import java.util.Arrays;

class Book implements Comparable{
    private int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [" +
                "price=" + price +
                ']';
    }

    @Override
    public int compareTo(Object o) {
        Book b = (Book)o;

        if(price > b.price) return 1;
        else if(price == b.price) return 0;
        else return -1;
    }
}
public class P3 {
    public static void main(String[] args) {
        Book[] books = {new Book(15000), new Book(50000), new Book(20000)};

        System.out.println("정렬 전");
        for(Book b : books)
            System.out.println(b);

        Arrays.sort(books);

        System.out.println("정렬 후");
        for(Book b : books)
            System.out.println(b);
    }
}
