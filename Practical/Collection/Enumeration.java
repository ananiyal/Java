package ananiyal;
import java.util.*;

public class Enumeration {

		public static void main(String[] args) {
			Enumeration days;
		      Vector dayNames = new Vector();// Creating the the object for the class 

		      dayNames.add("Sunday");
		      dayNames.add("Monday");
		      dayNames.add("Tuesday");
		      dayNames.add("Wednesday");
		      dayNames.add("Thursday");
		      dayNames.add("Friday");
		      dayNames.add("Saturday");
		      days = dayNames.elements();// copying the elements to enumeration type variable->days

		      while (days.hasMoreElements()) {// same function as hasNext() method
		         System.out.println(days.nextElement());
		      }

		}

	}
