import java.util.Scanner;
import java.util.Stack;

public class AddElementOfStack {
    public static void main(String[] args) {
        AddElement sp = new AddElement();
        sp.show();
    }

}
class AddElement{
    int sum = 0;
    public  void show(){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the size of stack: ");
        int nb = sc.nextInt();
        for(int i=0;i<nb;i++){
            System.out.print("Enter the element : ");
            stack.push(sc.nextInt());
        }
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//        stack.push(25);
//        stack.push(30);
        System.out.println(stack);
        Add(stack);
        System.out.println("Some of the stack "+sum);
        System.out.println(stack);
    }
    public void Add(Stack st){
        if(st.empty()){
            return;
        }
        int element = (int)st.peek();
//        if(element%2==0){
//            sum = sum+element;
//        }

        if(isPrime(element)){
            sum = sum+element;
        }
        st.pop();
        Add(st);

        st.push(element);
    }
    public boolean isPrime(int x){
        for(int i=2;i<x/2;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}
