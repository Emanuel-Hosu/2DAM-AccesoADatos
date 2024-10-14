package BSTStrict;

import HighInTrees.Node;

public class BST_Strict {
	private Node root;
	
	public boolean contains(int _value) {
		return containsRecursive(this.root, _value);
	}
	
	private boolean containsRecursive(Node current, int _value) {
		// TODO Auto-generated method stub
		if (current == null) {
			return false;
		}
		if(_value == current.value) {
			return true;
		}
		
		return _value < current.value ? containsRecursive(current.left, _value): containsRecursive(current.right, _value);
	}

	public void add(int _value) {
		root = addRecNode(root, _value);
	}
	
	private Node addRecNode(Node current, int _value) {
		//caso base
		if (current == null) {
			return new Node(_value);
		}
		
		if(_value < current.value) {
			current.left = addRecNode(current.left, _value);
		}
		if(_value > current.value) {
			current.right = addRecNode(current.right, _value);
		}else {
			return current;
		}
		return current;
	}
	
	public boolean strictTree() {
	    return recursiveStrictTree(this.root);
	}

	private boolean recursiveStrictTree(Node current) {
	    if (current == null) {
	        return true;
	    }
	    
	    if ((current.left == null && current.right == null) || (current.left != null && current.right != null)) {
	        return recursiveStrictTree(current.left) && recursiveStrictTree(current.right);
	    }
	    
	    return false;
	}
}
