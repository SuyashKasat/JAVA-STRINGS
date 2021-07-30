import java.util.*;
class Palindrome{
static boolean isPalindrome(String S){
char ch[]=S.toCharArray();
Stack<Character> stack=new Stack<Character>();
boolean ans=false;
for(int i=0;i<ch.length;i++){
stack.push(ch[i]);
}
System.out.println(stack);
for(int i=0;i<ch.length;i++){
if(ch[i]==stack.peek()){
stack.pop();
}
else{
return false;
}
}

if(stack.empty()==true){
ans= true;}

return ans;

}
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String S=s.nextLine();
boolean ans=isPalindrome(S);
System.out.println(ans);
}
}
