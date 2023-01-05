import java.util.Stack;

public class BinarySearch {
    public static void main(String[] args)
    {
        BST tree = new BST();
        //7, 5, 1, 8, 3, 6, 0, 9, 4, 2
        tree.insert(7);
        tree.insert(5);
        tree.insert(1);
        tree.insert(8);
        tree.insert(3);
        tree.insert(6);
        tree.insert(0);
        tree.insert(9);
        tree.insert(4);
        tree.insert(2);
        System.out.print("Tree: ");
        tree.inorder();
    }
}

class Node {
    Node left;
    int val;
    Node right;
    Node(int val) { this.val = val; }
}

class BST {
    Node root;

    public void insert(int key)
    {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            if (temp.val > key) {
                prev = temp;
                temp = temp.left;
            }
            else if (temp.val < key) {
                prev = temp;
                temp = temp.right;
            }
        }
        if (prev.val > key)
            prev.left = node;
        else
            prev.right = node;
    }

    public void inorder()
    {
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.add(temp);
                temp = temp.left;
            }
            else {
                temp = stack.pop();
                System.out.print(temp.val + " ");
                temp = temp.right;
            }
        }
    }
}
