import java.util.Scanner;

class SwipTwoNb {
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter 1st nb: ");
         int a= sc.nextInt();
         System.out.print("Enter 2st nb: ");
         int b= sc.nextInt();
         System.out.println("Before swiping nb: "+a +","+b);
         int temp = a;
         a=b;
         b= temp;
         System.out.println("After swiping nb: "+a +","+b);

     }
}
