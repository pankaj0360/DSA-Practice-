import java.util.Stack;
public class correctParanthisis {
    public static void main(String[] args) {
       Mystack p = new Mystack();
       p.validate();

    }
}
class Mystack{
    public void validate(){
        String str = "[{(";
        Stack s = new Stack();
        int flag= 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else {
                if(!s.empty()){
                    char symbol = (char)s.peek();
                    if (ch == ']') {
                        if(symbol!='['){
                            flag = 1;
                            break;
                        }
                    }
                    if (ch == '}') {
                        if(symbol!='{'){
                            flag = 1;
                            break;
                        }
                    }
                    if (ch == ')') {
                        if(symbol!='('){
                            flag = 1;
                            break;
                        }
                    }
                    s.pop();
                }else {
                    flag =1;
                    break;
                }
            }
        }
        if(flag==0&&s.empty()){
            System.out.println("valid expression");
        }
        else{
            System.out.println("Invalid Expresssion");
        }
    }
}

