import java.util.*;
public class InsertElement3rdPosition {
    public static void main(String[] args) {
        InsertElements sp = new InsertElements();
        sp.show();
    }
}
class InsertElements{
    public void show(){
        int pos = 3;
        int no = 90;
        Stack stack = new Stack();
        stack.push(12);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(40);
        stack.push(67);
        stack.push(54);
        System.out.println(stack);
        int indx = stack.size()-pos+1;
        insertElementAtPosition(stack,indx,no);
        System.out.println(stack);

    }
    public void insertElementAtPosition(Stack st,int pos, int no){
        if (st.size()==pos){
            st.push(no);
            return;
        }
        int top = (int)st.peek();
        st.pop();
        insertElementAtPosition(st,pos,no);
        st.push(top);
    }
}
