import java.util.*;
class Duplicate{
static void String(String S){
char ch[]=S.toCharArray();
HashMap<Character,Integer> Hash=new HashMap <Character,Integer>();
for(int i=0;i<ch.length;i++){
if(Hash.containsKey(ch[i])){
Hash.put(ch[i],Hash.get(ch[i])+1);
}
else{ 
Hash.put(ch[i],1);
}
}

for(Character i : Hash.keySet()){
if(Hash.get(i)>1){
System.out.println(i + ":"+ Hash.get(i));
}
}
}
public static void main(String [] args){
Scanner s=new Scanner (System.in);
String S=s.nextLine();
String(S);
}
}