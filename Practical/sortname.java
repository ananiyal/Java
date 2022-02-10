package ananiyal;
import java.util.*;  
public class sortname {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Aman");  
		al.add("Ashok");  
		al.add("Nairobi");  
		al.add("Pankaj"); 
		al.add("Anjali");
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  

	}
