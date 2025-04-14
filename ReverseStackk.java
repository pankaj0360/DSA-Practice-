import java.util.*;
public class ReverseStackk {
    public static void main(String[] args) {
       ReverseTheStack start = new ReverseTheStack();
        start.reverse();
    }
}
class ReverseTheStack {
    public void insertAtBottomm(Stack st , int no){
        if(st.empty()){
            st.push(no);
            return;
        }
        int top = (int)st.peek();
        st.pop();
        insertAtBottomm(st,no);
        st.push(top);
    }
    public void doReverse(Stack st){
        if(st.empty()){
            return;
        }
        int top = (int)st.peek();
        st.pop();
        doReverse(st);
        insertAtBottomm(st,top);
    }
    public void reverse(){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        doReverse(st);
        System.out.println("After reverse");
        System.out.println(st);
    }
}
