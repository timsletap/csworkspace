package Trees;

public class IntegerTree<T> extends BinarySearchTree<T>
{
   
	public int treeSum() {
		return treeSum(root);
	}
	
	private int treeSum(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		return ((Integer) node.getValue()) + treeSum(node.getLeft()) + treeSum(node.getRight());
	}

	public int height() {
		return height(root);
	}
	
	private int height(TreeNode<T> node) {
		if (node == null) {
			return -1;
		}
		return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
	}

	public int countNodes() {
		return countNodes(root);
	}
	
	private int countNodes(TreeNode<T> node) {
		if (node == null) {
			return 0;
		}
		return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
	}

	public int max() {
		return max(root);
	}
	
	private int max(TreeNode<T> node) {
		if (node == null) {
            return 0;
        }
        int leftMax = max(node.getLeft());
        int rightMax = max(node.getRight());
        return Math.max(Math.max(leftMax, rightMax), (Integer) node.getValue());
	}

    public double treeAverage(){
        return treeAverage(root);
    }

	private double treeAverage(TreeNode<T> node) {
        if (root == null) {
            return 0;
        }
        int sum = treeSum();
        int count = countNodes();
        return count == 0 ? 0 : (double) sum / count;
    }
	
    
    public static void main(String[] args)
	{  
	  IntegerTree<Integer> t = new IntegerTree<Integer>();
	  t.insert(2); 
	  t.insert(5);
	  t.insert(3);
	  t.insert(4);
	  t.insert(11);
	  t.insert(9);
	  t.insert(7);
	  t.insert(12);
	  t.insert(19);
	  t.inOrder(); 
	
	  
	  
	  
	  
	  
	  System.out.println("Sum:");
	 System.out.println(t.treeSum());
	 System.out.println("COUNT:");
	 System.out.println((t.countNodes()));  
	 System.out.println("Max Value:");
	 System.out.println(t.max());
	 System.out.println("AVERAGE:");
	 System.out.println(t.treeAverage());
	 System.out.println("HEIGHT:");
	 System.out.println(t.height());
	}
}		


