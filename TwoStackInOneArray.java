
public class TwoStackInOneArray {
    public static void main(String[] args) {
        TwoStack ts = new TwoStack();
        ts.push1(10);
        ts.push1(20);
        ts.push1(30);
        ts.push1(40);
        ts.push2(100);
        ts.push2(90);
        ts.push2(80);
        ts.push2(70);
        ts.push2(60);
        ts.push2(50);
        ts.showSt1();
        ts.showSt2();
        System.out.println( ts.peek1());
        System.out.println(ts.peek2());
        ts.pop1();
        ts.pop2();
        ts.pop1();
        ts.pop2();
        ts.pop1();
        ts.pop2();
        ts.pop1();
        ts.pop2();
        ts.pop1();
        ts.pop2();
        ts.pop1();
        ts.pop2();
        ts.peek2();
        ts.peek1();
        ts.showSt1();
        ts.showSt2();
        if(ts.isEmpty1()){
            System.out.println("true");
        }
        if(ts.isEmpty2()){
            System.out.println("true");
        }
    }
}
class TwoStack{
    int [] arr = new int[10];
    int top1 = -1;
    int top2 = arr.length-1;

    public  void push1(int no){
        if(top1+1==top2){
            System.out.println("TwoStack 1 OverFLow");
            return;
        }
        arr[++top1]= no;

    }
    public void push2(int no){
        if(top1==top2+1){
            System.out.println("TwoStack 2 OverFLow");
            return;
        }
        arr[top2]=no;
        top2--;
    }
    public void showSt1(){
        if(top1==-1){
            System.out.println("Stack 1 is empty");
            return;
        }
        int temp = top1;
        while(temp>-1){
            System.out.print(arr[temp]+" ");
            temp--;
        }
        System.out.println("");
    }
    public void showSt2(){
        if(top2==arr.length){
            System.out.println("Stack 2 is empty");
            return;
        }
        int temp = top2+1;
        while(temp<arr.length){
            System.out.print(arr[temp++]+" ");

        }
        System.out.println("");
    }
    public void pop1(){
        if(top1==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Delete Element "+arr[top1--]);

    }
    public void pop2(){
        if(top2==arr.length){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Delete Element "+arr[top2++]);

    }
    public int peek1(){
        if(top1==-1){
            System.out.println("Stack first Empty");
            return -1;
        }
        return arr[top1];
    }
    public int peek2(){
        if(top2==arr.length){
            System.out.println("Stack two Empty");
            return -1;
        }
        return arr[++top2];
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public boolean isEmpty1(){
        if(top1==-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty2(){
        if(top2==arr.length){
            return true;
        }
        return false;
    }
}
