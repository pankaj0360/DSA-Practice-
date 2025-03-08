import java.util.Stack;

public class ExpresionRendent {
    public static void main(String[] args) {
        Rendent.redent();
    }
}
class Rendent{
    public static void redent(){
        int flag =0;
        int right=0,left=0;
        Stack stack = new Stack();
        String expression = "(a+(a+(a+b))))";
        for (int i=0;i<expression.length();i++){
           stack.push(expression.charAt(i));
        }

        while(!stack.empty()){
            char ch = (char) stack.peek();
            if(ch=='('){
                left++;
            }
            if(ch==')'){
                right++;
            }
            stack.pop();
            char ch2;
           if(!stack.empty()){
               ch2 = (char) stack.peek();
               if(ch=='('&&ch2=='('){
                   flag = 1;
               }

           }
        }
        if(flag==0&&(left==right)){
            System.out.println("Expression not redent");
        }else System.out.println("Expression redent");
    }
}
