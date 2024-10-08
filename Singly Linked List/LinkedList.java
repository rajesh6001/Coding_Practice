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

    public void addbyposition(int val, int pos){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            if(pos==1){
                newnode.next=head;
                head=newnode;
            }
            else{
                Node temp=head;
                for(int i=0;temp!=null&&i<pos-2;i++){
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;

            }

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