public class merge {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public int size;
    public Node sort(Node lh,Node rh){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(lh!=null && rh!=null){
            if(lh.data<=rh.data){
                temp.next=lh;
                temp=temp.next;
                lh=lh.next;
            }else{
                temp.next=rh;
                temp=temp.next;
                rh=rh.next;
            }
        }
          
        while(lh!=null){
            temp.next=lh;
            temp=temp.next;
            lh=lh.next;
        } 
    
        while(rh!=null){
            temp.next=rh;
            rh=rh.next;
            temp=temp.next;
        }
        return mergedLL.next;
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

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        merge l1=new merge();
        l1.addLast(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.print();
        
        merge l2=new merge();
        l2.addLast(2);
        l2.addLast(5);
        l2.addLast(6);
        l2.print();

        Node lh=l1.head;
        Node rh=l2.head;
        merge l3=new merge();
        l3.head=l3.sort(lh,rh);
        l3.print();
    }
}
