public class LinkedList{
   public  Node head=null;
    class Node{
        int data ;
        Node next;
       public  Node(int val){
        data =val;
        next =null;
        }
    }

    public void add_node(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }

    }

    public void display(){
        Node temp=head;
        for(;temp.next!=null;temp=temp.next){
            System.out.print(temp.data + "->");
        }
        System.out.println(temp.data);
    }
}