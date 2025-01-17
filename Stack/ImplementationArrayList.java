import java.util.ArrayList;
public class ImplementationArrayList{
    public static class Stack{
        static ArrayList<Integer> list =new ArrayList<>();
        
        //isEmpty()-checks if an array is empty
        public boolean isEmpty(){
            return (list.size()==0);
        }
        
        //push()-push an element at the top of stack
        public void push(int data){
            list.add(data);
        }

        //pop()-removes an element at the top of stack
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek()-return the top element of the stack
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.print(s.pop());     
    }
}