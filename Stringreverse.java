import java.util.*;
class Stringreverse{
public static void main(String [] args){
String s="My name is Suyash Kasat i work at gammastack";
String words[]=s.split("\\s");

String reverseword="";
for(int i=0;i<words.length;i++){
StringBuilder sb=new StringBuilder(words[i]);
if(i%3==2){
reverseword+=sb.toString()+ " ";

}
else{
sb.reverse();
reverseword+=sb.toString() + " ";

}
}
System.out.print(reverseword);
}
}