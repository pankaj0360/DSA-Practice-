import java.util.Stack;
import java.util.Vector;

public class NextSmallerElementUsingStack {
    public static void main(String[] args) {
        SmallerElement se  = new SmallerElement();
        se.show();
    }
}
class SmallerElement{
    public void show(){
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v = new Vector<>();
        st.push(-1);
        int  [] arr = {12,67,11,78,89,10,87,101,45,100};
        for(int i=arr.length-1;i>=0;i--){
           while ((st.peek()>arr[i])){
               st.pop();
           }

           v.add(st.peek());
           st.push(arr[i]);

        }

        System.out.println(v.reversed());

    }
}
