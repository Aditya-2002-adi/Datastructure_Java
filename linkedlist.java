
    //linkedlist search:o(n)
//    linkedlist insert:o(1) non contigouts, varliable size

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public class linkedlist {
    public static void main(String[] args) {
   Node head=new Node(10);
   Node next1=new Node(20);
        Node next2=new Node(30);
        Node next3=new Node(40);
        Node next4=new Node(50);

        head.next=next1;
        next1.next=next2;
        next2.next=next3;
        next3.next=next4;

//        addend(head,88);
//      addbegin(head,56);
//      deletefirst(head);
        deltelast(head);
        printlist(head);
//        deltelast(head);
//        addend(head,88);
//        knowposition(head,80);
//        deltelast(head);
//        System.out.println(recursiveknowpostion(head,10));


    }

        private static void deltelast(Node head) {
        if(head==null){
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        }

        private static void deletefirst(Node head) {
        if(head==null){
            System.out.println("null");
        }
        head=head.next;

        }


        private static void addend(Node head, int i) {
        Node last=new Node( i);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=last;


        }
        private static void addbegin(Node head, int i) {
            Node begin=new Node( i);
            if(head==null)
               head=begin;

                Node temp=head;
                head = begin;
                head.next = temp;


            }

        private static int recursiveknowpostion(Node head, int i) {

        if(head==null){
            return -1;
        }
        if(head.data==i){
            return 1;
        }
        else{
            int result=recursiveknowpostion(head.next,i);
            if(result==-1)
            return -1;
            else return (result+1);
        }


        }

        private static void knowposition(Node head,int x) {
        int pos=1;int flag=0;
        Node curr=head;
            if (head == null) {
                System.out.println("empty");
            }
            while(curr!=null){
            if(curr.data==x){
                flag=1;
                System.out.println("position of node is :"+pos);
                break;
            }
            else{
                pos++;
                curr=curr.next; }
        }
            if(flag==0){

                System.out.println("  element not present..");
            }
    }


        private static void printlist(Node head)
        {
            Node curr=head;
            if(head==null){
                System.out.println("empty list");
            }
            while(curr!=null){
                System.out.print(" ->"+curr.data);
                curr=curr.next;
            }
        }
    }
