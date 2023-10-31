class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree(int rootData) {
        root = new TreeNode(rootData);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);

        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);

        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Binary Tree Structure:");
        System.out.println("   " + tree.root.data);
        System.out.println("  / \\");
        System.out.println(" " + tree.root.left.data + "   " + tree.root.right.data);
        System.out.println(" / \\");
        System.out.println(tree.root.left.left.data + "   " + tree.root.left.right.data);
    }
}
