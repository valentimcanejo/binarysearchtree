
public class Node {
	int key;

	int element;
	
	Node parent;

	Node leftChild;

	Node rightChild;

	Node(int key, int name) {

		this.key = key;

		this.element = name;

	}

	public String toString() {

		return element + " has the key " + key;

		/*
		 * 218 return name + " has the key " + key + "\nLeft Child: " + leftChild + 219
		 * "\nRight Child: " + rightChild + "\n"; 220
		 */

	}

}
