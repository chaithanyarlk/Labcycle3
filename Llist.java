package list;


class LinkedList 
{ 
	static  private Node head; 

	
	class Node 
	{ 
		int data; 
		Node next; 
		
		
          Node(int d) 
          {data = d; next = null; } 
     } 
     
     
     static public void push(int data) 
     { 
          
          Node newnode = new Node(data); 
          newnode.next = head; 
          head = newnode; 
     } 

     static Node removeLast(Node head) 
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

    static public Node objectAt(int n){
         Node temp=head;
         for( int i=1;i<=n&&temp!=null;i++){
              temp=temp.next;
         }
         if(temp==null)
         return null;
         return temp;


    }
    static public Node firstObject(){
         
         
         return head;
    }

    static public int indexOfObject(Node obj){
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

}

public class Llist{
     static public void main(String args[]){
          
     }

}

