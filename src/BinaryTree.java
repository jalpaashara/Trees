package Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
	int key;
	Node left,right;
	Node (int key){
		this.key=key;
		left=null;
		right=null;
	}
}

public class BinaryTree {
	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	//Recursive
	public void inOrderTraversal(Node node) {
		if(node==null) return;
		inOrderTraversal(node.left);
		System.out.print(node.key+"->");
		inOrderTraversal(node.right);
	}
	//Recursive
	public void preOrderTraversal(Node node) {
		if(node==null) return;
		System.out.print(node.key+"->");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	//Recursive
	public void postOrderTraversal(Node node) {
		if(node==null) return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.key+"->");
	}
	//Level order Using Queue
	public void levelOrderTraversal(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()) {
        	Node tempNode=queue.poll();
        	System.out.print(tempNode.key+"->");
        	if (tempNode.left!=null) queue.add(tempNode.left);
        	if (tempNode.right!=null) queue.add(tempNode.right);
        }
	}
	//Using two methods printLevelOrder - we need to first get the height of the tree
	//and printGivenLevel
	void printLevelOrder(Node root){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
        	printGivenLevel(root, i);
        	System.out.println();// This will print each node value line by line for each level
        							//instead of in a single line
        }
    }
	
	int height(Node root){
        if (root == null)
           return 0;
        /* compute  height of each subtree */
        int lheight = height(root.left);
        int rheight = height(root.right);
             
        /* use the larger one */
        return Math.max(lheight, rheight)+1;
    }
	
	void printGivenLevel (Node root ,int level){
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1){
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
	
	public void printReverseLevelOrder(Node root) {
		if (root==null) return;
		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root=queue.remove();
			stack.push(root);
			if(root.right!=null) queue.add(root.right);
			if(root.left!=null) queue.add(root.left);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().key+"->");
		}
	}
	
	//Spiral Level Order Using 2 Stacks 
	public void printSpiralLevelOrder(Node root) {
		if (root==null) return;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.add(root);
		while(true) {
			while(!s1.isEmpty()) {
				root=s1.pop();
				System.out.print(root.key + "->");
				if(root.left!=null) s2.add(root.left);
				if(root.right!=null) s2.add(root.right);
			}
			while(!s2.isEmpty()) {
				root=s2.pop();
				System.out.print(root.key + " ");
				if(root.right!=null) s1.add(root.right);
				if(root.left!=null) s1.add(root.left);
			}
			if (s1.isEmpty() && s2.isEmpty()) break;
		}
	}
}
