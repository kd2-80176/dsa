
public class BSTree {

	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {

			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	private Node root;

	public BSTree() {

		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private void add(Node trav, int value) {

		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			}
			add(trav.left, value);
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
				return;
			}
			add(trav.right, value);
		}

	}

	public void add(int value) {

		if (isEmpty())
			root = new Node(value);
		else
			add(root, value);

	}

	private void inorder(Node trav) {

		if (trav == null)
			return;
		else {
			inorder(trav.left);
			System.out.print(" " + trav.data);
			inorder(trav.right);
		}

	}

	public void inorder() {
		System.out.print("BST :");
		inorder(root);
		System.out.println("");
	}

}
