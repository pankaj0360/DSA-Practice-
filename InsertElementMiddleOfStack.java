import java.util.Stack;

public class InsertElementMiddleOfStack {
    public static void main(String[] args) {
    InsertElementMiddle sp = new InsertElementMiddle();
    sp.show();;
    }
}
class InsertElementMiddle{
    public void show(){
        int no = 90;

        Stack stack = new Stack();
        stack.push(12);
        stack.push(43);
        stack.push(15);
        stack.push(75);
        stack.push(35);
        stack.push(63);
        stack.push(18);
        stack.push(50);
        int pos = (int)stack.size()/2;
        System.out.println(stack);
        insertMiddle(stack,pos,no);
        System.out.println(stack);


    }
    public void insertMiddle(Stack st,int pos,int no){
        if(st.size()==pos){
            st.push(no);
            return;
        }
        int top = (int)st.peek();
        st.pop();
        insertMiddle(st,pos,no);
        st.push(top);
    }
}
