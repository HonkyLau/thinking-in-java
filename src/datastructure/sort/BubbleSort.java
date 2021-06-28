package datastructure.sort;

public class BubbleSort {
	
	
	private static int[] bubbleSort1(int[] arrays){
		int temp;
		for(int i = 0;i<arrays.length-1;i++){
			for(int j=0;j<arrays.length-i-1;j++){
				if(arrays[j]>arrays[j+1]){
					temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			}
		}
		
		return arrays;
		
	}
	
	private static int[] bubbleSort2(int[] arrays){
		int temp;
		for(int i = 0;i<arrays.length-1;i++){
			for(int j=arrays.length-1;j>i;j--){
				if(arrays[j]<arrays[j-1]){
					temp = arrays[j];
					arrays[j] = arrays[j-1];
					arrays[j-1] = temp;
				}
			}
		}
		
		return arrays;
		
	}
	
	private static void display(int[] arrays){
		for(int i = 0;i<arrays.length;i++){
			System.out.println(arrays[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arrays = new int[]{5,9,11,45,77,14,87};
		BubbleSort.bubbleSort2(arrays);
		BubbleSort.display(arrays);
		
	}
}
