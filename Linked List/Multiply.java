public class Multiply {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static Node head;

    public static int multiply(Node h1,Node h2){
        int mod=1000000007;     // will help prevent overflow
        int n1=0,n2=0;
        Node temp=head;
        while(h1!=null || h2!=null){
            if(h1!=null){
                n1=((n1*10)+h1.data)%mod;
                h1=h1.next;
            }
            if(h2!=null){
                n2=((n2*10)+h2.data)%mod;
                h2=h2.next;
            }
        }
        return (n1*n2)%mod;
    }
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Node h1=new Node(3);
        h1.next=new Node(2);
        Node h2=new Node(2);
        System.out.print(multiply(h1,h2));
    }
}
