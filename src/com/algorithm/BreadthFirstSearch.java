package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/*1

   \

 	2

  		\

   		5
	
  		/  \

 		3    6

  		\

   		4 */

public class BreadthFirstSearch {
	
	public static void breadthFirstSearch(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		if(root == null)
			return;
		
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(" "+ node.data);
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
	}
	
	public static void main(String args[]) throws java.lang.Exception {
	
		Node root = new Node(1);
		Node root1 = new Node(2);
		Node root2 = new Node(5);
		root2.left = new Node(3);
		root2.left.left = new Node(4);
		root2.right = new Node(6);
		
		System.out.print("Breadth First Search Result: ");
		breadthFirstSearch(root);
		breadthFirstSearch(root1);
		breadthFirstSearch(root2);

		
	}
}
