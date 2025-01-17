import java.util.*;
public class ImplementationLinkedList{
    public static class Stack{
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        static Node head=null;
        //isEmpty()
        public boolean isEmpty(){
            return head==null;
        }

        //push()
        public void push(int data){
            Node nn=new Node(data);
            nn.next=head;
            head=nn;
        }

        //pop()
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek()
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top element is:"+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}