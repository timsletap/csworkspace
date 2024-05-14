package Trees;

/**
 * Implementation of a node of a binary tree.
 *
 * Adapted from the College Board's AP Computer Science AB: Implementation
 * Classes and Interfaces.
 * 
 * @param <E>
 */
public class TreeNode<E> {
	private Comparable<E> value;
	private TreeNode<E> left;
	private TreeNode<E> right;

	/**
	 * Constructs a new TreeNode with object initValue,
	 *
	 * @param initValue New element object
	 * @param initLeft  Reference to the left element
	 * @param initRight Reference to the right element
	 */
	public TreeNode(Comparable<E> initValue, TreeNode<E> initLeft, TreeNode<E> initRight) {
		value = initValue;
		left = initLeft;
		right = initRight;
	}

	/**
	 * Constructs a single leaf TreeNode
	 *
	 * @param item New element object
	 */
	public TreeNode(Comparable<E> item) {
		this(item, null, null);
	}

	/**
	 * Sets the value attribute of the TreeNode object
	 *
	 * @param theNewValue value attribute of the TreeNode object
	 */
	public void setValue(Comparable<E> theNewValue) {
		value = theNewValue;
	}

	/**
	 * Sets the left attribute of the TreeNode object
	 *
	 * @param theNewLeft reference to a TreeNode
	 */
	public void setLeft(TreeNode<E> theNewLeft) {
		left = theNewLeft;
	}

	/**
	 * Sets the right attribute of the TreeNode object
	 *
	 * @param theNewRight The new right value
	 */
	public void setRight(TreeNode<E> theNewRight) {
		right = theNewRight;
	}

	/**
	 * Gets the value attribute of the TreeNode object
	 *
	 * @return The value value
	 */
	public Comparable<E> getValue() {
		return value;
	}

	/**
	 * Gets the left attribute of the TreeNode object
	 *
	 * @return The left value
	 */
	public TreeNode<E> getLeft() {
		return left;
	}

	/**
	 * Gets the right attribute of the TreeNode object
	 *
	 * @return The right value
	 */
	public TreeNode<E> getRight() {
		return right;
	}

	public String toString() {
		return value.toString();
	}

}
