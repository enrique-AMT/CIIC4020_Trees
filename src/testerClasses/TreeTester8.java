package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTester8 {

	public static void main(String[] args) throws CloneNotSupportedException { 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		LinkedBinaryTree<Integer> t2 = t.clone();
		// display elements as a list
				Utils.displayTree("The elements of the tree are: ", t2);
	}

}
