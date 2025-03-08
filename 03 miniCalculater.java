import java.util.Scanner;

class miniCalculater {
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter 1st nb: ");
         int a= sc.nextInt();
         System.out.print("Enter 2st nb: ");
         int b= sc.nextInt();
         System.out.println("addistion is ="+(a+b));
         System.out.println("Substrection is ="+(a-b));
         System.out.println("division is ="+(a/b));
         System.out.println("multiplication is ="+(a*b));

     }
}
