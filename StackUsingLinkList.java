
class Node{
    int no;
    Node next;
    Node(int no){
        this.no = no;
        this.next = null;
    }
}
class MyStack{
    Node top = null;
    public void push(int no){
        Node p = new Node(no);
        if(p==null){
            System.out.println("Memory full");
        }
        p.next = top;
        top = p;
    }
    public void treverse(){
        Node temp ;
        temp = top;
        while (temp!=null){

            System.out.print(temp.no);
            temp = temp.next;
        }
    }
}
public class StackUsingLinkList {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(90);
        stack.push(80);
        stack.push(70);
        stack.push(60);
        stack.treverse();
    }
}

