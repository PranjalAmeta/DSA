import java.util.ArrayList;
public class AL{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);  // used to add new element at the end - O(1)
        list.add(2);  
        list.add(4);
        list.add(2,3); // adds element at the particular index - O(n)
        
        System.out.println(list);
        
        /*System.out.println(list.get(2));   // used to get the element at that index - O(1)

        list.remove(3);  // removes an element from the list - O(n)
        System.out.println(list);

        list.set(2,4); // set an element at a particular index if the index doesnt exist then throws error
        // O(n)
        System.out.println(list);

        System.out.println(list.contains(3)); // checks if the element exists in the list - O(n)

        System.out.println(list.size());  // size() is similar to .length() in array but here size is fuction where as in array it was function

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        */
        for(int i=list.size()-1;i>=0;i--){ // O(n)
            System.out.print(list.get(i)+" ");
        }

        
    }
}