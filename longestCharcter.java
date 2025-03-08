import java.util.*;
public class longestCharcter {
    public static void main(String[] args) {
        String str = "adzjklmnopqr";

        Stack s = new Stack();
        for (int i = 0; i<str.length(); i++) {
           s.push(str.charAt(i));
        }
        char str1 =(char)s.peek();
        s.pop();
        while(!s.empty()){
           char ch = (char)s.peek();
           if(ch>str1){
               str1 = ch;
           }
           s.pop();

        }
        System.out.println(str1);
    }

}
