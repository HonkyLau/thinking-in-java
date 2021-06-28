package datastructure.queue;

/*
 * 用数组实现循环队列
 */
public class MyQueue {
	private long[] arrays;
	private int top;
	private int end;
	private int elements;

	public MyQueue(int maxSize) {
		arrays = new long[maxSize];
		top = 0;//队头取出
		end = -1;//队尾加入
		elements = 0;//判断队列空、满
	}

	public void insert(long value){

		if(end==arrays.length-1){
			end = -1;
		}

		arrays[++end] = value;
		++elements;
	}

	public long remove(){
		long temp = arrays[top++];
		if(top == arrays.length){
			top = 0;
		}
		--elements;
		return temp;
	}

	public long peek(){
		return arrays[top];
	}

	public boolean isEmpty(){
		return elements==0;
	}

	public boolean isFull(){
		return elements==arrays.length;
	}

	public static void main(String[] args) {

		MyQueue queue = new MyQueue(5);
		queue.insert(41);
		queue.insert(10);
		queue.insert(30);
		queue.insert(21);

		queue.remove();
		queue.remove();
		queue.remove();

		queue.insert(55);
		queue.insert(60);
		queue.insert(70);
		queue.insert(81);

		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}

}
