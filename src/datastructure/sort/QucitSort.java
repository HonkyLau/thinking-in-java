package datastructure.sort;

public class QucitSort {

	public static void main(String[] args) {

		long[] arr = { 41, 14, 98, 15, 46, 88, 21 };
		QucitSort.display(arr);
		QucitSort.partition(arr, 0, arr.length-1, arr[arr.length-1]);
		QucitSort.display(arr);

	}

	private static int partition(long[] arr, int left, int rigth, long point) {

		// leftptr、rigthptr的作用是为了用++
		int leftptr = left - 1;
		int rightptr = rigth /*+ 1*/;
		while (true) {
			while (leftptr < rightptr && arr[++leftptr] < point) // leftptr < rightptr 判断条件很重要
				;
			while (rightptr > leftptr && arr[--rightptr] > point)
				;
			if (leftptr >= rightptr) {
				break;
			} else {
				long tmp = arr[leftptr];
				arr[leftptr] = arr[rightptr];
				arr[rightptr] = tmp;
			}
		}

		long tmp = arr[rigth];
		arr[rigth] = arr[leftptr];
		arr[leftptr] = tmp;

		return leftptr;

	}

	public static void sort(long[] arr, int left, int rigth){
		if(rigth - left <= 0){
			return;
		}else{
			//设置关键字
			long point = arr[rigth];
			//获得切入点，同时对数组进行划分
			int partition =  partition( arr,  left, rigth, point);
			sort(arr,left,partition-1);
			sort(arr,partition+1,rigth);
		}
	}

	private static void display(long[] arr){

		System.out.print("{");
		for(long l : arr){
			System.out.print(l + " ");
		}
		System.out.println("}");
	}

}
