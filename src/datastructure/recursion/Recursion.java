package datastructure.recursion;

public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(test(3));
	}
	
	public static int test(int n){
		
		if(n==1){
			return 1;
		}
		
		return n + test(n-1);
		
	}
}
