import java.util.Stack;
public class InsertElementAtBottom {
    public static void main(String[] args) {
        InsertElement sp = new InsertElement();
        sp.show();
    }
}
class InsertElement {
    public void show(){
        Stack st = new Stack();
        st.push(10);
        st.push(56);
        st.push(67);
        st.push(54);
        System.out.println(st);
        insertAtBottom(st,100);
        System.out.println("work done");
        System.out.println(st);

    }
    public  void insertAtBottom(Stack st,int nb){
            if(st.empty()){
                st.push(nb);
                return;
            }
            int top = (int)st.peek();
            st.pop();
            insertAtBottom(st,nb);
            st.push(top);
    }
}
