package datastructure.stack;

/*
 * ������ʵ��ջ
 */
public class MyStack {
	
	private long[] argv = null;
	private int top;
	private int maxSize;
	
	
	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		argv = new long[maxSize];
		top = -1;
	}
	
	public void push(long value){
		argv[++top] = value;		
	}
	
	public long pop(){
		return argv[top--];
	}
	
	public long peek(){
		return argv[top];
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public static void main(String[] args) {
		
		MyStack arrays = new MyStack(4);
		arrays.push(45);
		arrays.push(21);
		arrays.push(4);
		arrays.push(5);
		
		System.out.println(arrays.isEmpty());
		System.out.println(arrays.isFull());
		
		System.out.println(arrays.peek());
		
		
	}
}
