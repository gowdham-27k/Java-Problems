Input:

java spring java sql spring java

Output:

java = 3
spring = 2
sql = 1
==============================
import java.util.*;
class Main {
	public static void main(String[] args) {
    String s="java spring java sql spring java";
    String word[]=s.split(" ");
    Map<String,Integer> map=new HashMap<>();
    for(String words:word){
        map.put(words,map.getOrDefault(words,0)+1);
    }
    for(String key : map.keySet()){
        System.out.println(key+"="+map.get(key));
    }
	}
}
