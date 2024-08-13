public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
/////////////////////////////////////////////////////////////////////////
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");

    }
/////////////////////////////////////////////////////////////////////////
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);

    }
/////////////////////////////////////////////////////////////////////////
    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node node) {

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node rv = q.poll();
            System.out.print(rv.val + " ");
            if (rv.left != null) {
                q.add(rv.left);
            }
            if (rv.right != null) {
                q.add(rv.right);
            }
        }
        System.out.println();

    }
