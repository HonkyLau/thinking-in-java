package datastructure.sort;

public class SelectSort {
	
	
	private static int[] SelectSort(int[] arrays){
		
		int minIndex,temp;
		for(int i=0;i<arrays.length-1;i++){
			minIndex = i;
			for(int j=i+1;j<arrays.length;j++){
				if(arrays[j]>arrays[minIndex]){
					minIndex = j;
				}
			}
			
			temp = arrays[i];
			arrays[i] = arrays[minIndex];
			arrays[minIndex] = temp;
			
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
		
		SelectSort.SelectSort(arrays);
		SelectSort.display(arrays);
		
	}
}
