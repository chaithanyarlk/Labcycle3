import java.util.Scanner;
import java.io.*;

class Employee{
     public static void sorter(int arr[][],int n){
          int t;
          int temp[]= new int [n];
          for(int i=0;i<n;i++){
               temp[i]=0;
               for(int j=1;j<=7;j++){
                    temp[i]=temp[i]+arr[i][j];
               }
          }
          for(int i=0;i<n-1;i++){
               for(int j=0;j<n-i-1;j++){
                    if(temp[j]>temp[j+1]){
                         t=temp[j];
                         temp[j]=temp[j+1];
                         temp[j+1]=t;
                         for(int k=0;k<=7;k++){
                              t=arr[j][k];
                              arr[j][k]=arr[j+1][k];
                              arr[j+1][k]=t;
                         }
                         
                    }
               }
          }

     }
     static public void display(int arr[][],int n){
          for(int i=n-1;i>=0;i--)
          System.out.println(arr[i][0]);
     }

     static public void main(String args[]){
          int n;
          Scanner s= new Scanner(System.in);
          System.out.println("enter number of employee present");
          n=s.nextInt();
          int arr[][]= new int[n][8];
          for(int i=0;i<n;i++){
               System.out.println("please enetr the emeployee id");
               arr[i][0]=s.nextInt();
               for(int j=1;j<8;j++){
                    System.out.println("Enter the emeployee details of day "+j);
                    arr[i][j]=s.nextInt();
               }
          }
          sorter(arr, n);
          System.out.println("displaying order of employee ids in decreasing order");
          display(arr, n);
          System.out.println("Thanks for Using!");


     }
}
