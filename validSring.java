import java.util.Stack;
public class validSring {
    public static void main(String[] args) {
        Stack s=new Stack();
        String str = "PankAjjFYJFVHV";
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        int count = 0;
        while (!s.empty()){
            char ch = (char)s.peek();
            if(ch =='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'){
            count++;
            }

            s.pop();
        }
        if(count>2){
            System.out.println("invalid");
        }
        else System.out.println("correct");
    }
}
