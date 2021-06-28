package datastructure.array;

public class MyOrderArray {
	
	private int[] arrays;
	private int elements;
	private int length;
	
	public MyOrderArray() {
		length = 50;
		arrays = new int[50];
	}
	
	public MyOrderArray(int length){
		this.length = length;
		arrays = new int[length];
	}
	
	public void insert(int value){
		
		int i;
		for(i=0;i<elements;i++){
			if(arrays[i]>value){
				break;
			}
		}

		//从后往前 向后一个位置挪
		for(int j=elements;j>i;j--){
			arrays[j] = arrays[j-1];
		}
		
		arrays[i] = value;
		elements++;
	}
	
	public void display(){
		for(int i=0;i<elements;i++){
			System.out.println(arrays[i]);
		}
	}
	
	public void delete(int index){
		if(index>elements || index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			for(int i = index;i<elements;i++ ){
				arrays[i] = arrays[i+1];
			}
			elements--;
		}
	}
	
	public void change(int index,int value){
		if(index>elements || index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			arrays[index] = value;
		}
	}
	
	public int search(int value){
		int i;
		for(i=0;i<elements;i++){
			if(value==arrays[i]){
				break;
			}
		}
		
		return i;
		
	}
	
	public int get(int index){
		if(index>elements || index<0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			return arrays[index];
		}
	}
	
	/*
	 * ���ַ���������
	 */
	public int binarySearch(int value){
		int middle = 0;
		int low = 0;
		int pow = elements;
		
		while(true){
			
			middle = (low+pow)/2;
			if(arrays[middle]==value){
				System.out.println(middle);		
				return middle;
			}else if(low>pow){
				return -1;
			}else {
				if(arrays[middle]>value){
					pow = middle-1;
				}else if(arrays[middle]<value){
					low = middle+1;
				}
			}
			
		}
		
		
//		while(true){
//			
//			middle = (low+pow)/2;
//			if(arrays[middle]==value){
//				System.out.println(middle);		
//				break;
//			}else{
//				if(low>pow){
//					break;
//				}else if(arrays[middle]>value){
//					pow = middle-1;
//				}else if(arrays[middle]<value){
//					low = middle+1;
//				}
//			}
//			
//		}
//		
//		return middle;
		
	}
	
	
	public static void main(String[] args) {
		
		MyOrderArray array = new MyOrderArray();
		array.insert(10);
		array.insert(40);
		array.insert(30);
		array.insert(50);
		array.insert(90);
		array.insert(70);
		array.insert(80);
		
		array.binarySearch(40);
		
		//array.delete(1);
		
		//System.out.println(array.search(30));
		
		//System.out.println(array.get(0));
		
		//array.change(0, 20);
		
		array.display();
	}
}
