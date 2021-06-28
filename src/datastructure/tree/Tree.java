package datastructure.tree;

public class Tree {

	public TreeNode root;

	public void insert(long value){
		//封装节点
		TreeNode newValue = new TreeNode(value);
		//引用当前节点
		TreeNode current = root;
		//引用父节点
		TreeNode parent = null;
		if(root == null){
			root = newValue;
			return;
		}else{
			while(true){
				parent = current;
				//如果当前指向节点的数据比插入的要小，向右走
				if(current.data < value){
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newValue;
						return;
					}
				}else{
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newValue;
						return;
					}
				}
			}
		}
	}

	public TreeNode find(long value){

		TreeNode current = root;
		while(current.data != value){
			if(current.data>value){
				current = current.leftChild;
			}else{
				current = current.rightChild;
			}

			if(current == null){
				return null;
			}
		}

		return current;

	}

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(15);
		tree.insert(3);

		System.out.println(tree.root);

	}

}
