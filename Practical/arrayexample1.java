package Ananiyal;

public class arrayexample1 {
	public static void main (String args[]){
	int a[] = new int [5]; // declaring and instantiating an array
	a[0] = 10; // initialization
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50; //  printing the value
  for(int i=0;i<a.length;i++)  //length is the property of array
	  System.out.println(a[i]); //printing the value
	}
	
}
