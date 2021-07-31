import java.util.*;
class Paranthesis{

static boolean balance(String S){
char[] ch=S.toCharArray();
Stack<Character> stack=new Stack<Character>();
boolean ans=false;
for(int i=0;i<ch.length;i++){
if(ch[i]=='{' ||  ch[i]=='[' ||  ch[i]=='(' ){
stack.push(ch[i]);
}

else{
if(ch[i]=='}' && stack.peek()=='{'){
stack.pop();
}
if(ch[i]==')' && stack.peek()=='('){
stack.pop();
}
if(ch[i]==']' && stack.peek()=='('){
stack.pop();
}
else{
break;
}
}
}

if(stack.empty()==true){
ans=true; }

return ans;

}
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String S=s.nextLine();
boolean ans=balance(S);
System.out.println(ans);
}
}