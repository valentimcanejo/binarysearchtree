
public class Main {

	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();

		t.insert(t.root, 50, 6);

		t.insert(t.root, 25, 4);

		t.insert(t.root, 15, 2);

		t.insert(t.root, 30, 5);

		t.insert(t.root, 75, 10);

		t.insert(t.root, 85, 12);
		
		t.insert(t.root, 65, 8);

		t.insert(t.root, 60, 7);
		
		t.insert(t.root, 70, 9);

		t.insert(t.root, 80, 11);
		
		t.insert(t.root, 90, 13);
		
		t.insert(t.root, 10, 1);
		
		t.insert(t.root, 20, 3);

		// Different ways to traverse binary trees

		// theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

//                     50
//            25                75
//       15        30       65          85
//	 10     20          60     70   80      90
		
		
		// theTree.uniaoArv(theTree, theTreeB);
		// theTree.inOrderTraverseTree(theTree.root);
		//System.out.println(theTree.minNode(theTree.root));
		//System.out.println(theTree.maxNode(theTree.root));
		//System.out.println();
		//System.out.println(theTree.size(theTree.root));
		
		//t.inOrderTraverseTree(t.root);
		//System.out.println(t.minNode(t.findNode(t.root, 75)));
		System.out.println(t.size(t.root));
		
		//System.out.println(theTree.isBST(theTree.root));
		
		//System.out.println(theTree.isLeaf(theTree.findNode(theTree.root, 50)));
		
		//theTree.printElements(theTree.root);
		
		//t.remove(t.root, 25);
		System.out.println();
		t.inOrderTraverseTree(t.root);
		
		
		
	}

}
