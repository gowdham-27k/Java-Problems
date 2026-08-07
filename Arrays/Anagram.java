
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="listen";
	    String t="silet";
	    boolean anag=false;
	    if(s.length()!=t.length()){
	        anag= false;
	        System.out.print(" length Not equal-> ");
	        
	    }
	    char a[]=s.toCharArray();
	     char b[]=t.toCharArray();
	    Arrays.sort(a);
	    Arrays.sort(b);
	  String c=String.valueOf(a);
	  String d=String.valueOf(b);
	 if(c.contains(d)){
	     anag=true;
	     System.out.print("Anag");
	 }
	if(!anag){
	     System.out.print("not");
	 }
	    
	   
	}
}
