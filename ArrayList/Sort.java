import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,3,6));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
    }
}
