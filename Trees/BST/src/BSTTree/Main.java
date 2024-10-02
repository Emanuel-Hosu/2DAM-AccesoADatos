package BSTTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST treeItem = new BST();
		
		treeItem.add(10);
		treeItem.add(9);
		treeItem.add(22);
		treeItem.add(3);
		treeItem.add(33);
		
		System.out.println("9 (esperado True); " + treeItem.contains(9));
		System.out.println("22 (esperado True); " + treeItem.contains(22));
		System.out.println("55 (esperado False); " + treeItem.contains(55));
		System.out.println("33 (esperado True); " + treeItem.contains(33));
		System.out.println("100 (esperado False); " + treeItem.contains(100));
	}

}
