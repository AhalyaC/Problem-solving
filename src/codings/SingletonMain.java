package codings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton x = Singleton.Singleton();
		
		Singleton y = Singleton.Singleton();
		
		Singleton z = Singleton.Singleton();
		
		System.out.println("Hashcode of x is "
                + x.hashCode());
System.out.println("Hashcode of y is "
                + y.hashCode());
System.out.println("Hashcode of z is "
                + z.hashCode());
	


	if (x == y && y == z) {
		 
        // Print statement
        System.out.println(
            "Three objects point to the same memory location on the heap i.e, to the same object");
    }
	
	else {
        // Print statement
        System.out.println(
            "Three objects DO NOT point to the same memory location on the heap");
        
        

    }
	
	}
	
	Set<Integer> num = new HashSet<>();
    
	List<Integer> number = Arrays.asList(2,3,4,5);
	  
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
    
	
	List<String> names =
            Arrays.asList("Reflection","Collection","Stream");
	
	 List<String> result = names.stream().filter(s->s.startsWith("S")).
             collect(Collectors.toList());
     

}
