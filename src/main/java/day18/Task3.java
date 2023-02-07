package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int num : numbers) {
            addNode(num, root);
        }

        dfs(root);

    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }

        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    public static void addNode(int value, Node root) {
        Node newNode = root;
        Node current = null;

        while (newNode != null) {
            current = newNode;

            if (value < current.getValue()) {
                newNode = current.getLeft();
            } else {
                newNode = current.getRight();
            }
        }

        if (value < current.getValue()) {
            current.setLeft(new Node(value));
        } else {
            current.setRight(new Node(value));
        }
    }
}