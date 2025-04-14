import java.util.Stack;

public class PStack{
    public static void main(String[] args) {
        TStack t= new TStack();
        t.check();
    }

}



 class TStack {
    public void check(){
        Stack <Character> stack = new Stack<>();
        String s = "Racecar";
        int len = s.length();
        int p = len/2;
        System.out.println(len);
        System.out.println(p);
        for (int i=0;i<=p-1;i++){
            stack.push(s.charAt(i));
        }
        System.out.println(stack);
        for(int i =(p+1);i<s.length();i++){
            char ch = stack.peek();
            if(ch==s.charAt(i)){
                stack.pop();
            }
        }
        if(stack.empty()){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

}
