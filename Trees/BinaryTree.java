package Trees;



public  abstract class BinaryTree<E>
{
    
 TreeNode<E> root;

public BinaryTree()
{
    root = null;
}

public void setRoot( TreeNode<E> theNewNode)
{
    root = theNewNode;
}

public TreeNode<E> getRoot()
{

return root;
}

boolean isEmpty()
{
    return (root == null);
}

public void inOrder() {
	
	inOrder(getRoot());
}
// helper method
private void inOrder(TreeNode<E> root) {
	if (root != null) {
		inOrder(root.getLeft());
		System.out.println(root.getValue());
		inOrder(root.getRight());
	}
	
}	
public abstract void insert (Comparable<E> item);

public abstract TreeNode<E> find (Comparable<E> key);











}
