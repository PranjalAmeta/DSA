public class LinkedList{
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

    public void addLast(int data){       // O(1)
        // 1.Creating new node
        Node newNode=new Node(data);
        size++;
        // Check for condn(special case)
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 2.adding last to tail
        tail.next=newNode;
        // 3.making newNode=tail
        tail=newNode;       
    }

    public void add(int idx,int data){  // O(n)
        if(head==null){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp. next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){               // No need to pass any parameter as head is already present - O(1)
        if(size==0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size=0;
            return val;
        }

        Node prev=head;
        //i=size-2
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data;
        prev.next=null;
        size--;
        tail=prev;
        return val;
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
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(0);
        ll.add(2,9);
        ll.print();
        System.out.println("removed="+ll.removeFirst());
        ll.print();
        System.out.println(LinkedList.size);
        System.out.println("removed="+ll.removeLast());
        ll.print();
        System.out.println(LinkedList.size);//static variable doesnt need object and can be called directly by class
    }
}