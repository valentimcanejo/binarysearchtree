
public class BinarySearchTree {
	Node root;

	public void insert(Node node, int key, int element) {

		Node newNode = new Node(key, element);

		if (root == null) {
			root = newNode;
		} else {

			if (key < node.key) {
				if (node.leftChild == null) {
					node.leftChild = newNode;
					

				}
				insert(node.leftChild, key, element);

			} else if (key > node.key) {
				if (node.rightChild == null) {
					node.rightChild = newNode;
					

				}
				insert(node.rightChild, key, element);
			}

		}

	}

	

	public Node remove(Node node, int key) {

		if (key == root.key) {
			root = null;
		} else {

			if (key > node.key) {

				node.rightChild = remove(node.rightChild, key);

			} else if (key < node.key) {

				node.leftChild = remove(node.leftChild, key);

			} else

			if (isLeaf(node)) {
				node = null;

			} else if (node.leftChild == null) {
				return node.rightChild;

			} else if (node.rightChild == null) {
				return node.leftChild;
			} else if (node.rightChild != null && node.leftChild != null) {
				Node minValue = minNode(node.rightChild);
				node.key = minValue.key;
				node.rightChild = remove(node.rightChild, minValue.key);
			}

		}

		return node;

	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
//          50
//     25       75
// 15     30        85
			// Traverse the left node

			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

	public void leftTree(Node root) {

		if (root == getRoot()) {
			root = root.leftChild;
		}

		if (root != null) {
			System.out.println(root);

			leftTree(root.leftChild);

			leftTree(root.rightChild);

		}

	}

	public void rightTree(Node root) {

		if (root == getRoot()) {
			root = root.rightChild;
		}

		if (root != null) {
			System.out.println(root);

			rightTree(root.leftChild);

			rightTree(root.rightChild);

		}

	}

	public void preOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preOrderTraverseTree(focusNode.leftChild);

			preOrderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);

			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}

	public int height(Node key) {

		if (key == null)
			return -1;
		else {

			int rHeight = height(key.rightChild);
			int lHeight = height(key.leftChild);

			if (lHeight > rHeight) {
				return (lHeight + 1);
			} else {
				return (rHeight + 1);
			}
		}
	}

	public int depth(Node key) {

		if (key == null) {
			return 0;
		}

		return 0;

	}

	public int size(Node key) {

		if (key == null) {
			return 0;
		} else {

			return size(key.leftChild) + 1 + size(key.rightChild);

		}

	}

	public Node findNode(Node node, int key) {

		if (node == null || node.key == key) {
			return node;
		} else if (key > node.key) {
			return findNode(node.rightChild, key);
		} else if (key < node.key) {
			return findNode(node.leftChild, key);
		}
		return null;

	}

	public Node getRoot() {
		return root;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void deleteTree(Node key) {

		if (key == root) {
			root = null;
		}

	}

	public BinarySearchTree uniaoArv(BinarySearchTree A, BinarySearchTree B) {

		if (A.isEmpty() && B.isEmpty()) {
			System.out.println("Árvores vazias");
		}

		Node root1 = B.getRoot();
		while (root1 != null) {
			A.insert(root, root1.key, root1.element);
			root1 = root1.rightChild;
		}
		Node root2 = B.getRoot();
		while (root2 != null) {
			A.insert(root, root2.key, root2.element);
			root2 = root2.leftChild;
		}
		return A;
	}

	public void deleteNode(Node root, int item) {

	}

	public Node minNode(Node node) {

		if (node.leftChild != null) {
			node = minNode(node.leftChild);

		}

		return node;

	}

	public Node maxNode(Node node) {

		if (node.rightChild != null) {
			node = maxNode(node.rightChild);

		}

		return node;

	}

	public boolean isBST(Node node) {

		if (node != null) {

			if (node.leftChild.key < node.key && node.rightChild.key > node.key) {

				return true;

			}
			if (isBST(node.leftChild) || isBST(node.rightChild)) {
				return true;
			}

		}

		return false;

	}

	public boolean isLeaf(Node node) {

		if (node.leftChild == null && node.rightChild == null) {

			return true;

		}

		return false;

	}

	public void printElements(Node element) {

		if (element != null) {

			printElements(element.leftChild);
			System.out.println(element.element);
			printElements(element.rightChild);

		}

	}

	
	

}