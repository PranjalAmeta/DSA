// Sort a linked list of 0s-1s-or-2s
public class SortZOT {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public Node sort(Node head){  
        int cnt[]={0,0,0};
        Node ptr=head;
        while(ptr!=null){
            cnt[ptr.data]+=1;
            ptr=ptr.next;
        }
        ptr=head;
        int idx=0;
        while(ptr!=null){
            if(cnt[idx]==0){
                idx++;
            }else{
                ptr.data=idx;
                cnt[idx]--;
                ptr=ptr.next;
            }
        }
        return head;
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
        Node head=new Node(0);
        head.next=new Node(1);
        head.next.next=new Node(0);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(0);
        head.next.next.next.next.next=new Node(1);
        SortZOT sr=new SortZOT();
        sr.print(head);
        Node ll=sr.sort(head);
        sr.print(ll);
    }
}
