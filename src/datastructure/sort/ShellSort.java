package datastructure.sort;


public class ShellSort {
	
	public static long[] shellSort(long[] arrays){
		
		int h = 1;
		while(h<=arrays.length/3){
			h = h * 3 + 1;
		}
		
		while(h>0){
				
/*			for(int i=h;i<arrays.length;i++){
				int preIndex = i-h;
				long tmp = arrays[i];
				while((preIndex+h>=h-1) && arrays[preIndex] > tmp){
					arrays[preIndex+h] = arrays[preIndex];
					preIndex -= h;
				}
				
				arrays[preIndex+h] = tmp;			
			}*/

			//优化后
			for(int i=h;i<arrays.length;i++){
				int j = i;
				long tmp = arrays[i];
				while((j>=h-1) && arrays[j-h] > tmp){
					arrays[j] = arrays[j-h];
					j -= h;
				}
				
				arrays[j] = tmp;			
			}
			
			h = (h - 1) / 3;
		}
		return arrays;
		
	}
	
	private static void display(long[] arrays){
		for(int i = 0;i<arrays.length;i++){
			System.out.println(arrays[i]);
		}
	}
	
	public static void main(String[] args) {
		long[] arrays = new long[]{5,9,11,45,77,14,87};
		ShellSort.shellSort(arrays);
		ShellSort.display(arrays);
	}
	
}
