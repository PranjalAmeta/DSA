// You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class AddTwoLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node add(Node h1,Node h2){
        Node t1=h1,t2=h2;
        Node addedll=new Node(-1);
        Node temp=addedll;
        int carry=0;
        while(t1!=null || t2!=null || carry!=0){
            int sum=carry;
            if(t1!=null){
                sum+=t1.data;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.data;
                t2=t2.next;
            }
            Node newNode=new Node(sum%10);  // as it will return last dingit of sum
            temp.next=newNode;
            temp=temp.next;
            carry=sum/10;
        }
        return addedll.next;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node l1=new Node(9);
        l1.next=new Node(9);
        Node l2=new Node(9);
        l2.next=new Node(9);
        print(l1);
        print(l2);
        Node l3=add(l1,l2);
        print(l3);
    }
}
