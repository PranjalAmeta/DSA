import java.util.LinkedList;
public class LlusingJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        // add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(3);
        // print
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
