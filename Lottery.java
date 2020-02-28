import java.util.Scanner;


class Lottery{
     static public int reverse(int num){
          int sum=0;
          int rem=0;
          while(num!=0){
               rem=num%10;
               sum=sum*10+rem;
               num=num/10;
          }
          return(sum);
     }
     static public int check(int num,int data){
          int rem=0;
          int data1=0;
          while(data!=0){
               data1=data%10;
               data=data/10;
          while(num!=0){
               rem=num%10;
               if(rem==data1)
               return 1;
               num=num/10;
          }}
          return 0;
     }

     static public void main(String args[]){
          int data;
          int num=(int)(10+((Math.random())*89));
          System.out.println("Check your luck in the Lottery by entering a number (2 digit only)");
          System.out.println(num);
          Scanner s= new Scanner(System.in);
          data=s.nextInt();
          if(data==num){
               System.out.println("Wow Congratulations! you have won 100000/- ");

          }
          else if(reverse(num)==data){
               System.out.println("Wow Congratulations you have won 50000/-");
          }
          else if(check(num, data)==1){
               System.out.println("Wow Congratulations you have won 20000/-");
          }
          else
          System.out.println("Sorry you have Lost!");
     }

}
