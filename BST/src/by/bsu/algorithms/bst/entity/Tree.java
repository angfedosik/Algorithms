package by.bsu.algorithms.bst.entity;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node toFindElement(int value) {
        Node current = root;
        while (current.getValue() != value) {
            if (value < current.getValue())
                current = current.getLeft();
            else
                current = current.getRight();
            if (current == null)
                return null;
        }
        return current;
    }
    public void insert(int value) {
        Node current = root;
        Node parent;
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;
        else {
            while (true) {
                parent = current;
                if (value < current.getValue()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                }
                else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }
    public int countNodes(Node node){
        int counter=0;
        if(node!=null){
            counter+=countNodes(node.getLeft());
            counter+=countNodes(node.getRight());
        }
        return counter+1;
    }
    public Node k_min(int k){
        Node current = root;

    }
}
