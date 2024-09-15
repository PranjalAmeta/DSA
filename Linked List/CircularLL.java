// Not necessary for interviews
public class CircularLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 

    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            tail=newNode;
            tail.next=tail;
            return;
        }
        newNode.next=tail.next;
        tail.next=newNode;
    }

    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=tail.next;
        int i=0;
        while(i!=idx){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            tail=newNode;
            tail.next=tail;
            return;
        }
        newNode.next=tail.next;
        tail.next=newNode;
        tail=newNode;
    }

    public int removeLast(){
        if(size==1){
            int val=tail.data;
            tail=null;
            return val;
        }
        Node temp=tail.next;
        Node prev=null;
        while(temp!=tail){
            prev=temp;
            temp=temp.next;
        }
        int val=tail.data;
        prev.next=tail.next;
        tail=prev;
        size--;
        return val;
    }

    public int remove(int idx){
        if(size==1){
            int val=tail.data;
            tail=null;
            return val;
        }
        Node temp=tail.next;
        int i=0;
        Node prev=null;
        while(i!=idx){
            prev=temp;
            temp=temp.next;
            i++;
        }
        int val=temp.data;
        prev.next=temp.next;
        size--;
        return val;
    }

    public void print(){
        Node temp=tail.next;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        while(temp!=tail.next);
        System.out.println(tail.next.data);
    }

    public static void main(String args[]){
        CircularLL cll=new CircularLL();
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addFirst(0);
        cll.print();
        cll.add(1,4);
        cll.print();
        cll.addLast(3);
        cll.print();
        cll.removeLast();
        cll.print();
        cll.remove(2);
        cll.print();
        System.out.print(cll.size);
    }
}
