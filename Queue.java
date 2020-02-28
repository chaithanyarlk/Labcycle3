import java.util.Scanner;
import java.io.*;

class Queue{
     private static int front;
     private static int rear;
     private static  int max;

     static public void init (int max1){
          front=-1;
          rear=-1;
          max=max1;
     }

     static public int []enQueue (int arr[],int data){
          if(rear==max-1){

               int temp[]= new int[2*max];
               max=2*max;
               for(int i=0;i<rear;i++){
                    temp[i]=arr[i];

               }
               arr=temp;

          }
          if(rear==-1){
               //insertion of first elemnet
               front=0;
          }
          rear++;
          arr[rear]=data;
          return (arr);
          

     }

     static public int deQueue(int arr[]){
          if(front==-1)
          return -1;
          else if(front==rear){
               int t=arr[front];
               front=-1;
               rear=-1;
               return(t);
          }
          else{
               front++;
               return(arr[front-1]);
          }
     }

     static public int peep (int arr[]){
          if(rear==-1){
               return -1;

          }
          return(arr[rear]);

     }
     static public void display(int arr[]){
          if(front!=-1 && rear!=-1)
          for(int i=front;i<=rear;i++){
               System.out.println(arr[i]);
          }
     }


     static void main(String args[]){
          int choice;
          int arr[] = new int [1];
          //basic initialization of the object of array class
          int data;
          boolean temp=true;
          int ret;
          Scanner s=new Scanner(System.in);
          while(temp){
               System.out.println("see the choice list before starting");
               System.out.println("     press 1 to enqueue elements ");
               System.out.println("     press 2 to dequeue elements ");
               System.out.println("     press 3 to display elements ");
               System.out.println("     press 5 to exit ");
               choice=s.nextInt();
               switch(choice){
                    case 1:
                    System.out.println("please eneter the value of the data item");
                    data=s.nextInt();
                    arr= enQueue(arr, data);
                    break;
                    case 2:
                    ret=deQueue(arr);
                    if(ret==-1)
                    System.out.println("Your Queue is Empty please try by inserting some element!");
                    else
                    System.out.println(ret+ " this is the poped item");
                    break;
                    case 3:
                    display(arr);
                    break;
                    case 4:
                    ret=peep(arr);
                    if(ret==-1)
                    System.out.println("Your Queue is Empty please try by inserting some element!");
                    else
                    System.out.println(ret+ " this is the peeped item");
                    break;

                    case 5:
                    temp=false;
                    break;
                    default:
                    System.out.println("Please eneter a proper value");
                    
               }

          }
     
     }
}