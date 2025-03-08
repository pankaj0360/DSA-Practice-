import java.util.Scanner;
import java.util.Stack;

public class GreatestElementUsingRecursion {
    public static void main(String[] args) {
            GreatestElement gs = new GreatestElement();
            gs.show();
    }
}
class GreatestElement{
    int greatest = 0;
    public  void show(){

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
         greatest = (int)stack.peek();
        System.out.println(stack);
        Add(stack);
        System.out.println("Some of the stack "+greatest);
        System.out.println(stack);
    }
    public void Add(Stack st){
        if(st.empty()){
            return;
        }
        int element = (int)st.peek();
        if(element>greatest){
            greatest=element;
        }
        st.pop();
        Add(st);

        st.push(element);
    }
}
