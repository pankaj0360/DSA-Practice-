import java.util.Scanner;
import java.util.Stack;

public class ValidUserName {
    public static void main(String[] args) {
        UserName.UserName();
    }
}
class UserName{
    public  static void UserName(){
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int capitalChar=0,underScore=0,lowerLetter=0,specilSymbol=0;
        System.out.print("Enter The User Name: ");
        String userName = sc.nextLine();
        for(int i=0;i<userName.length();i++){
            stack.push(userName.charAt(i));
        }
        while (!stack.empty()){
            char ch = (char)stack.peek();
            if(ch =='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F'||ch=='G'||ch=='H'||ch=='I'||ch=='J'||ch=='K'||ch=='L'||ch=='M'||ch=='N'||ch=='O'||ch=='P'||ch=='Q'||ch=='R'||ch=='S'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='Z'){
                capitalChar++;
            }
            if(ch =='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'){
                lowerLetter++;
            }
            if(ch=='@'){
                specilSymbol++;
            }
            if(ch=='_'){
                underScore++;
            }
            stack.pop();
        }
        if(capitalChar>=2 && lowerLetter>=3 && underScore==2 && specilSymbol==1){
            System.out.println(userName +" is valid user name");
        }
        else {
            System.out.println("Please enter valid user name");
        }
    }
}
