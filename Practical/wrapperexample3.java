package Ananiyal;

public class wrapperexample3 {    
	public static void main(String args[]){    
	//Converting Integer to int    
	Integer a=new Integer(8);    
	int i=a.intValue();//converting Integer to int explicitly  
	int j=a;//unboxing, now compiler will write a.intValue() internally    
	    
	System.out.println(a+" "+i+" "+j);    
	}}




