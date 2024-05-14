package Trees;


/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E> extends BinaryTree<E> {

	//@Override
	public void insert(Comparable<E> item) {
		if (getRoot() == null)
			setRoot(new TreeNode<E>(item));
		else {
			TreeNode<E> p = null;
			TreeNode<E> q = getRoot();
			while (q != null) {
				p = q;
				if (item.compareTo((E) p.getValue()) < 0)
					q = p.getLeft();
				else
					q = p.getRight();
			}

			if (item.compareTo((E)p.getValue()) < 0)
				p.setLeft(new TreeNode<E>(item));
			else
				p.setRight(new TreeNode<E>(item));
		}
	}

	@Override
	public TreeNode<E> find(Comparable<E> key) {
		TreeNode<E> p = getRoot();
		while (p != null && key.compareTo((E)p.getValue()) != 0) {
			if (key.compareTo((E)p.getValue()) < 0)
				p = p.getLeft();
			else
				p = p.getRight();
		}

		return p;

	}
	public TreeNode<E> first(){
		return first(root);
	}

	private TreeNode<E> first(TreeNode<E> tree){
		while(tree.getLeft() != null){
			tree = tree.getLeft();
		}
		return tree;

	}

	public TreeNode<E> last(){
		return last(root);
	}

	private TreeNode<E> last(TreeNode<E> tree){
		while(tree.getRight() != null){
			tree = tree.getRight();
		}
		return tree;
	}

	public int size(){
		return sizeHelper(root);
	}
	

	private int sizeHelper(TreeNode root){
		if(root == null){
			return 0;
		} else{
			return sizeHelper(root.getLeft()) + 1 + sizeHelper(root.getRight());
		}
	}
	public static void main(String[] args) {
		BinarySearchTree<String> one = new BinarySearchTree<String>();
		one.insert("fig");
		one.insert("apple");
		one.insert("aardvark");
		one.insert("lemon");
		one.insert("grape");
		one.insert("blueberry");
		one.insert("pineapple");
		one.insert("lime");
		one.insert("kiwi");
		one.insert("pear");
		one.insert("date");
		one.inOrder();
}
}	
	
	