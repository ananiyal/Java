package ananiyal;
import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("Gopal");  
		stack.push("Pintu");  
		stack.push("Prakash");  
		stack.push("Shivaji");  
		stack.push("Puspa");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
