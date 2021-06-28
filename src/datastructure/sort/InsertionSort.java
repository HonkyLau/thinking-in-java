package datastructure.sort;

public class InsertionSort {
	
	
	private static int[] insertionSort(int[] arrays){
		
		int preIndex,current;
		for(int i=1;i<arrays.length;i++){
			preIndex = i-1;
			current = arrays[i];
			while(preIndex>=0 && arrays[preIndex]>current){
				arrays[preIndex+1] = arrays[preIndex];
				preIndex--;
			}
			
			arrays[preIndex+1] = current;
			
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
		InsertionSort.insertionSort(arrays);
		InsertionSort.display(arrays);
		
	}
}
