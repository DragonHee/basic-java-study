package chap10.challenge;

public class EnglishScore implements Comparable<EnglishScore>{
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return name + ", " + score;
    }

    @Override
    public int compareTo(EnglishScore o) {
        return score - o.score;
    }
}
