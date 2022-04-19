package codings;
class Solution {
	 public static boolean isPalindrome(int x) {
	        
	        int r,temp;
	        int sum = 0;
	         
	        temp=x;
	        
	        while(x>0){
	            r=x%10;
	            sum=(sum*10)+x;
	            x=x/10;
	               
	        }
	        
	        if(temp==sum){
            	System.out.println("Given number is palindrome");
	            return true;
	        }
	        else{
	        	System.out.println("Given number is not palindrome");
	        return false;
	        }
	        
	       
	    }
	    
	    public static void main(String[] args){
	        int x=455;
	        isPalindrome(x);
	    }
}
