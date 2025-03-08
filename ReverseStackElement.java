import java.util.Stack;

public class ReverseStackElement {
    public static void main(String[] args) {
        ReverseStack start = new ReverseStack();
        start.show();
    }
}
class ReverseStack{
    public void show(){
        Stack stack = new Stack();
        Stack rev = new Stack();
        stack.push(43);
        stack.push(15);
        stack.push(75);
        stack.push(35);
        stack.push(63);
        stack.push(18);
        System.out.println(stack);
       while(!stack.empty()){
           rev.push((int)stack.pop());
       }
        System.out.println(rev);

    }

}
