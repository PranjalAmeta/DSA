// Remove Duplicates from Linked list -O(n2) can be solved in O(n) with hashset
public class RemoveDuplicates {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void remove(Node head){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while(temp.next!=null){
                if(curr.data==temp.next.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            curr=curr.next;
        }
    }

    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(4);
        RemoveDuplicates ll=new RemoveDuplicates();
        ll.print(head);
        ll.remove(head);
        ll.print(head);
    }
}
