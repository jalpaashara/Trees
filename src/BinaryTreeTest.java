package Trees;

public class BinaryTreeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(10);
        tree_level.root.left = new Node(20);
        tree_level.root.right = new Node(30);
        tree_level.root.left.left = new Node(40);
        tree_level.root.left.right = new Node(50);
        tree_level.root.right.right = new Node(60);
        tree_level.root.left.right.left = new Node(70);
        tree_level.root.left.right.right = new Node(80);
        tree_level.root.right.right.left = new Node(90);
        
        System.out.println("Height of binary tree is - "+ tree_level.height(tree_level.root));
        
        System.out.println("\nLevel order traversal of binary tree is - ");
        tree_level.levelOrderTraversal(tree_level.root);
        
        System.out.println("\n\nLevel order traversal using Recusrion of binary tree is - ");
        tree_level.printLevelOrder(tree_level.root);
        
        System.out.println("\n\nPre order traversal of binary tree is - ");
        tree_level.preOrderTraversal(tree_level.root);
        
        System.out.println("\n\nIN order traversal of binary tree is - ");
        tree_level.inOrderTraversal(tree_level.root);
        
        System.out.println("\n\nPost order traversal of binary tree is - ");
        tree_level.postOrderTraversal(tree_level.root);
        
        System.out.println("\n\nReverse Level order traversal of binary tree is - ");
        tree_level.printReverseLevelOrder(tree_level.root);
        
        System.out.println("\n\nSpiral Level order traversal of binary tree is - ");
        tree_level.printSpiralLevelOrder(tree_level.root);
	}


}
