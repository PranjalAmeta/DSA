public class Flattening {
    public static class Node{
        int data;
        Node next;
        Node child;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.child=null;
        }
    }
    public static Node head;

    public static Node merge(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.child=h1;
                temp=temp.child;
                h1=h1.child;
            }else{
                temp.child=h2;
                temp=temp.child;
                h2=h2.child;
            }
        }
        if(h1!=null){
            temp.child=h1;
        }else{
            temp.child=h2;
        }
        return dummy.child;
    }
    public static Node flatten(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mergedHead=flatten(head.next);

        return merge(head,mergedHead);
    }
    
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.child;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node head=new Node(1);                   //  1 -> 4 -> 3->null
        head.child=new Node(2);                  //  |    |    |
        head.next=new Node(4);                   //  2    5    6 
        head.next.child=new Node(5);             //  |    |    |
        head.next.next=new Node(3);              //  n    n    7
        head.next.next.child=new Node(6);        
        head.next.next.child.child=new Node(7);
        print(flatten(head));
    }
}
