import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        QueueImplementation Qu = new QueueImplementation();
        Qu.iQueue(20);
        Qu.iQueue(30);
        Qu.dQueue();
        System.out.println("size "+ Qu.size());



//        Qu.iQueue(50);
//        Qu.iQueue(60);
//        Qu.dQueue();
//        Qu.dQueue();
//        Qu.dQueue();
//        Qu.dQueue();
//        Qu.iQueue(70);

    }
}
class  QueueImplementation{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    boolean isEmpty(){
        if(s1.empty()&&s2.empty()){
            return true;
        }
        return false;
    }
    void  iQueue(int no){
        s1.push(no);
    }
    void dQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        else {
            if(s2.empty()){
                transferItem();
            }
        }
        System.out.println("Delete item :" + s2.pop());
    }
    int peek(){
        if(!s2.empty()){
            return s2.peek();
        }
        else{
            if(!s1.empty()){
                transferItem();
                return s2.peek();
            }else{
                throw new NoSuchElementException("Queue is empty");
            }
        }
   }
   int size(){
        if(isEmpty()){
            return -1;
        }
        return s1.size()+s2.size();
   }
   void transferItem(){
       while(!s1.empty()){
           s2.push(s1.pop());
       }
   }
}
