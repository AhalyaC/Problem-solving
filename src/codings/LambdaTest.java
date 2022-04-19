package codings;

public class LambdaTest {


	
	    // operation is implemented using lambda expressions
	    interface FuncInter1
	    {
	        int operation(int a, int b);
	    }
	  
	    // sayMessage() is implemented using lambda expressions
	    // above
	    interface FuncInter2
	    {
	        void sayMessage(String message);
	    }
	  
	    // Performs FuncInter1's operation on 'a' and 'b'
	    private int operate(int a, int b, FuncInter1 fobj)
	    {
	        return fobj.operation(a, b);
	    }
	  
	    public static void main(String args[])
	    {
	       
	        FuncInter1 add = (int x, int y) -> x + y;
	  
	        
	        FuncInter1 multiply = (int x, int y) -> x * y;
	  
	       
	        LambdaTest tobj = new LambdaTest();
	  
	       
	        System.out.println("Addition is " +
	                        tobj.operate(6, 3, add));
	  
	        
	        System.out.println("Multiplication is " +
	                          tobj.operate(6, 3, multiply));
	  
	       
	        FuncInter2 fobj = message ->System.out.println("Hello "
	                                                 + message);
	        fobj.sayMessage("Geek");
	    }
}
