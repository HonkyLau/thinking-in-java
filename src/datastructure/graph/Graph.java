package datastructure.graph;



import datastructure.graph.Vertax;
import datastructure.queue.MyQueue;
import datastructure.stack.MyStack;

public class Graph {
	//顶点数组
	private Vertax[] vertaxs;
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize = 20;
	//当前顶点
	private int nVertax;
	//用于深度优先级搜索的栈
	private MyStack stack = null;
	//用于广度优先级搜索的栈
	private MyQueue queue = null;

	public Graph() {
		vertaxs = new Vertax[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i=0;i<maxSize;i++){
			for(int j=0;j<maxSize;j++){
				adjMat[i][j] = 0;
			}
		}
		nVertax = 0;
		stack = new MyStack(20);
		queue = new MyQueue(20);
	}

	public void addVertax(char label){
		vertaxs[nVertax++] = new Vertax(label);
	}

	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][end] = 1;
	}

	/*
	 * 获取一个未访问过的邻节点
	 */
	public int getadjunvisitvertax(int n){
		for(int i=0;i<nVertax;i++){
			if(adjMat[n][i] == 1 && vertaxs[i].isVisit == false){
				return i;
			}
		}

		return -1;
	}

	public void dispalyVertax(int n){
		System.out.println(vertaxs[n].name);
	}

	/*
	 * 深度优先搜索
	 */
	public void dfs(){

		vertaxs[0].isVisit = true;
		dispalyVertax(0);
		stack.push(0);
		while(!stack.isEmpty()){
			int n = getadjunvisitvertax((int)stack.peek());
			if(n == -1){
				stack.pop();
			}else
			{
				stack.push(n);
				dispalyVertax(n);
				vertaxs[n].isVisit = true;
			}
		}

		for(int i =0;i<nVertax;i++){
			vertaxs[i].isVisit = false;
		}

	}

	/*
	 * 广度优先搜索
	 */
	public void bfs(){

		vertaxs[0].isVisit = true;
		dispalyVertax(0);
		queue.insert(0);
		int v2;
		while(!queue.isEmpty()){
			int v1 = (int)queue.remove();
			while((v2=getadjunvisitvertax(v1))!= -1){
				queue.insert(v2);
				dispalyVertax(v2);
				vertaxs[v2].isVisit = true;
			}
		}

		for(int i =0;i<nVertax;i++){
			vertaxs[i].isVisit = false;
		}
	}

	/*
	 * 最小生成树
	 */
	public void mst(){

		vertaxs[0].isVisit = true;
		dispalyVertax(0);
		stack.push(0);
		while(!stack.isEmpty()){
			int currentVertax = (int)stack.peek();

			int v = getadjunvisitvertax(currentVertax);
			if(v == -1){
				stack.pop();
			}else
			{
				stack.push(v);
				dispalyVertax(currentVertax);
				System.out.print("-");
				dispalyVertax(v);
				System.out.print(" ");
				vertaxs[v].isVisit = true;
			}
		}

		for(int i =0;i<nVertax;i++){
			vertaxs[i].isVisit = false;
		}

	}

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertax('A');
		g.addVertax('B');
		g.addVertax('C');
		g.addVertax('D');
		g.addVertax('E');
		g.addVertax('F');
		g.addVertax('G');

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(0, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 6);
		g.addEdge(3, 6);

		g.bfs();

	}



}
