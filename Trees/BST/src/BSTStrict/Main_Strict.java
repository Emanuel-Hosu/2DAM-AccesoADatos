package BSTStrict;

import BSTTree.BST;

public class Main_Strict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST_Strict treeItem = new BST_Strict();
		
		treeItem.add(20);
		treeItem.add(10);
		treeItem.add(9);
		treeItem.add(12);
		treeItem.add(11);
		treeItem.add(13);
		treeItem.add(25);
		treeItem.add(23);
		//treeItem.add(26);
		
		System.out.println(treeItem.strictTree());
	}

}
