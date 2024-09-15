public class Palindrome {
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
    public static int size;

    public void addFirst(int data){    // O(1)
        // 1.Creating new Node
        Node newNode=new Node(data);
        size++;
        // check for condn
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 2.pointing new Node to head
        newNode.next=head;
        // 3.new head
        head=newNode;
    }

    public Node findMid(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public boolean isPanlindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // 1.Find mid
        Node midNode=findMid();

        // 2.reverse half LL
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;
        // 3.Check for equal
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }
    public void print(){          // O(n)
        if(head==null){
            System.out.print("LL is empty.");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Palindrome ll=new Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.print(ll.isPanlindrome());
        
    }
}
