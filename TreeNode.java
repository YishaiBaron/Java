
public class TreeNode {

	private int key;
	private TreeNode leftSon;
	private TreeNode rightSon;
	public TreeNode(int key, TreeNode left,TreeNode right) {
		this.key = key;
		this.leftSon = left;
		this.rightSon = right;
	}
	public int getKey() {
		return key;
	}
	public TreeNode getLeftSon() {
		return leftSon;
	}
	public TreeNode getRightSon() {
		return rightSon;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public void setLeftSon(TreeNode leftSon) {
		this.leftSon = leftSon;
	}
	public void setRightSon(TreeNode rightSon) {
		this.rightSon = rightSon;
	}
	public String toString() {
		return "{"+this.key+"}";
	}
}
