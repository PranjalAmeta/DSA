// Delete Node in a linked list
public class DeleteNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public void delete(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);   
        Node fourth=new Node(4);
        head.next=second;
        second.next=third;
        third.next=fourth;
        DeleteNode ll=new DeleteNode();
        print(head);
        ll.delete(second);
        print(head);
    }
}
