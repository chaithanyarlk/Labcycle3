import java.util.Scanner;
import java.io.*;

class Stack{
     static private int top;
     static private int max;

     //this will create the array if this for second time expansion then expansion has to be sent frompush
    static  public void init (int max1){

          
          max=max1;
          //System.out.println(max+ " this the max val initialized to");
          top=-1;

          
     }

     static public int[] push (int arr[],int data){
          if(top==max-1){
               //System.out.println("came to if part of the push");
               //this need to be expanded
               int temp[] = new int[2* max];
               for(int i=0;i<=top;i++){
                    temp[i]=arr[i];
                    //System.out.println(arr[i]);
               }
               arr=temp;
               top++;
               //System.out.println(top+ "  the value of top");
               arr[top]=data;
               max=max*2;
               //System.out.println(max+" this is the max val");
               


          //  init(temp, 2*max, 1);

          }
          else{
               //System.out.println("came to else part");
               if(top<max-1){
                    
                    top++;
                   // System.out.println(top+ "  the value of top");
                    arr[top]=data;
               }
          }
          return arr;
          
     }

     static int pop (int arr[]){
          if(top==-1){
               return -1;

          }
          else{
               top--;
               return(arr[top+1]);
          }

     }

     static public void display(int arr[]){
          for(int i=0;i<=top;i++){
               System.out.println(arr[i]);
          }
     }

     static public void main(String []args){
          int m;
          int data;
          int choice;
          boolean temp = true;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the initial size of the stack");
          m=s.nextInt();
          init(m);
          int arr[] =new int[m];
          while(temp){
               System.out.println("see the choice list before starting");
               System.out.println("     press 1 to push elements ");
               System.out.println("     press 2 to pop elements ");
               System.out.println("     press 3 to display elements ");
               System.out.println("     press 4 to exit ");
               choice=s.nextInt();
               switch(choice){
                    case 1:
                    System.out.println("please eneter the value of the data item");
                    data=s.nextInt();
                    arr= push(arr, data);
                    break;
                    case 2:
                    System.out.println(pop(arr)+ " this is the poped item");
                    break;
                    case 3:
                    display(arr);
                    break;
                    case 4:
                    temp=false;
                    break;
                    default:
                    System.out.println("Please eneter a proper value");
                    
               }

          }
          System.out.println("Thanks for using");

     }


}