public class Zigzag {
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

    public void zigZag(){
        // 1.Find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // 2.Divide & Reverse half 
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node lh=head;
        Node rh=prev;
        Node nextl,nextr;

        // 3.merge in zig-zag fashion
        while(lh!=null && rh!=null){
            nextl=lh.next;
            lh.next=rh;
            nextr=rh.next;
            rh.next=nextl;

            lh=nextl;
            rh=nextr;
        }

    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.print("LL is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Zigzag ll=new Zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
