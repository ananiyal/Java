package ananiyal;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ajay");  
		al.add("Rahul");  
		al.add("Robert");  
		al.add("Kunal");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		

	}
