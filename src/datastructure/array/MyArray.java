package datastructure.array;

public class MyArray {
	
	private int[] arrays;
	private int elements;
	private int length;
	
	public MyArray() {
		length = 50;
		arrays = new int[50];
	}
	
	public MyArray(int length){
		this.length = length;
		arrays = new int[length];
	}
	
	public void insert(int value){
		
		if(elements>length){
			return;
		}
		arrays[elements++] = value;
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
	
	
	
	public static void main(String[] args) {
		
		MyArray array = new MyArray();
		array.insert(10);
		array.insert(40);
		array.insert(30);
		array.insert(50);
		array.insert(60);
		array.insert(70);
		array.insert(80);
		
		//array.delete(1);
		
		System.out.println(array.search(30));
		
		System.out.println(array.get(0));
		
		//array.change(0, 20);
		
		array.display();
	}
}
