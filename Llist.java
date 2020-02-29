package list;


class LinkedList 
{ 
	public   Node head; 

	
	class Node 
	{ 
		int data; 
		Node next; 
		
		
          Node(int d) 
          {data = d; next = null; } 
     } 
     
     
     public void addFirst(int data) 
     { 
          
          Node newnode = new Node(data); 
          newnode.next = head; 
          head = newnode; 
     } 

     public Node removeLast(Node head) 
    { 
        if (head == null) 
            return null; 
  
        if (head.next == null) { 
            return null; 
        } 
  
        
        Node second_last = head; 
        while (second_last.next.next != null) 
            second_last = second_last.next; 
  
        
        second_last.next = null; 
  
        return head; 
    } 

    public Node objectAt(int n){
         Node temp=head;
         for( int i=1;i<=n&&temp!=null;i++){
              temp=temp.next;
         }
         if(temp==null)
         return null;
         return temp;


    }
    public Node firstObject(Node head){
         
         
         return head;
    }

    public int indexOfObject(Node obj){
         if(head==null)
         return -1;
         int i=1;
         Node temp=head;
         while(temp!=null){
              if(temp.data==obj.data){
                   return i;
              }
              temp=temp.next;
              i++;
         }
         return -1;
    }
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    public static void main(String args[]){
     LinkedList llist = new LinkedList(); 
     for( int i=1;i<10;i++){
          llist.addFirst(i);
     }
     llist.printList();
     System.out.println();
     llist.removeLast(llist.head);
     llist.printList();
     System.out.println();
     Node temp=llist.firstObject(llist.head);
     if(temp!=null){
          System.out.println(temp.data);
     }
     int dat= llist.indexOfObject(temp);
if(dat!=-1){
     System.out.println(dat);
}
    }

    

}

