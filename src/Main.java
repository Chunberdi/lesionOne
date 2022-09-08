import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("salam java 3 ");


        ArrayList <String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("chree");
        all.add("foue");
        all.add("tive");
        System.out.println("all  =" +all);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("chree");
        al2.add("four");
        al2.add("tean");

        all.removeAll(al2);
        System.out.println("all = " + all);




    }
}