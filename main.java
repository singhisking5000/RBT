
public class main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here
		RedBlackTree tree = new RedBlackTree();
		tree.insert(100);
		tree.insert(200);
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(80);
		tree.insert(150);

		tree.printTree();
		System.out.println(tree.isRedBlack());
	}
}
