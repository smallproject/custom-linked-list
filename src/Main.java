import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("string");
//        arrayList.set(3, "3");

        //De linkedList kunnen we als een List opslaan, omdat we in LinkedList de List interface hebben geimplementeerd
        List<String> linkedList = new LinkedList<>();
        linkedList.add("item 1");
        System.out.println(linkedList.get(0));
        linkedList.add("item 2");
        linkedList.add("item 3");
        System.out.println(linkedList.get(2));
    }
}