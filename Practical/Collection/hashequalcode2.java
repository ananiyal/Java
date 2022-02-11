package ananiyal;

class hashequalcode2 {

	public static void main(String[] args) {
		hashcodeequalcodemethod g1 = new hashcodeequalcodemethod("a",1);
		hashcodeequalcodemethod g2 = new hashcodeequalcodemethod("b",1);
		if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. ");

	}

}
