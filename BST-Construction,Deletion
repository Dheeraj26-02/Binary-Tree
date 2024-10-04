public class BSTConstruct {

    class Node {
        int val;
        Node left;
        Node right;
    };

    private Node root;

    public void Binary_Search_Tree(int[] in) {

        root = CreateTree(in, 0, in.length - 1);
    }
    //Creation using inorder..............................................................................................................

    public Node CreateTree(int[] in, int si, int ei) {

        if (si > ei) {
            return null;
        }
        Node root = new Node();

        int mid = (si + ei) / 2;
        root.val = in[mid];

        root.left = CreateTree(in, si, mid - 1);
        root.right = CreateTree(in, mid + 1, ei);
        return root;
    }

    //Displaying in pre-order..............................................................................................................

    public void pre() {
        preorder(root);
    }

    private void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.val + "->");
        preorder(root.left);
        preorder(root.right);

    }
    //Searching .................................................................................................................................

    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node node, int item) {//  O(log n)

        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }

        if (node.val > item)
            return find(node.left, item);
        else
            return find(node.right, item);

    }
    //Maximum...................................................................................................................................

    public int max() {
        return max(root);
    }

    private int max(Node node) { // O(log n)
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int Right = max(node.right);

        return Math.max(node.val, Right);
    }

    public Node delete(int item) {

        return del(root, item);
    }
    //Deletion.................................................................................................................................. 

    public Node del(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val > key) {
            root.left = del(root.left, key);
        } else if (root.val < key) {
            root.right = del(root.right, key);
        } else {

            if (root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.val = lmax;
                root.left = del(root.left, lmax);

            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }
}
