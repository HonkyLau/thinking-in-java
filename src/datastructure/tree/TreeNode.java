package datastructure.tree;

public class TreeNode {
	
	public long data;
	public TreeNode leftChild;
	public TreeNode rightChild;
	
	public TreeNode(long data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
	
}




