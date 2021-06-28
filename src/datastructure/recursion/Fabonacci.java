package datastructure.recursion;

public class Fabonacci {
	public static void main(String[] args) {
		
		System.out.println(getFabonacciNum(4));
		
	}
	
	public static int getFabonacciNum(int index){
		if(index == 1){
			return 0;
		}else if(index == 2){
			return 1;
		}else{
			return getFabonacciNum(index-1) + getFabonacciNum(index-2);
		}
	}
}
