package hashtableandbst;

public class BinarySearch<T extends Comparable<T>> {
    Node<T> root;
    int size = 0;
    public class Node<T extends Comparable<T>>{
        int data;
        Node<T>left;
        Node<T>right;
    }
    public BinarySearch(){
        root = null;
    }
    public void add(int i){
        Node<T> newNode = new Node<T>();
        newNode.data = i;
        if (root == null)
        {
            root = newNode;
            size++;
        }
        else
        {
            Node<T> current = root;
            Node<T> parent;
            while(true)
            {
                parent = current;
                if (i < current.data)
                {
                    current = current.left;
                    if (current == null)
                    {
                        parent.left = newNode;
                        size++;
                        return;
                    }
                }
                else
                {
                    current = current.right;
                    if (current == null)
                    {
                        parent.right = newNode;
                        size++;
                        break;
                    }
                }
            }
        }
    }
    public void getSize(){
        if(root == null){
            System.out.println("Binary Search is Empty");
        }
        System.out.println("\nSize of this BST is: "+size);
    }
    public void getNode(Node<T> newNode, int val){
        if(newNode == null){
            System.out.println(val+" is NOT PRESENT in Binary Search Tree");
        } else if(newNode.data == val){
            System.out.println(val+" is PRESENT in Binary Search Tree");
        } else if (val > newNode.data) {
            getNode(newNode.right, val);
        } else if (val < newNode.data) {
            getNode(newNode.left, val);
        }

    }
    public void traversal(Node<T> root)
    {
        if(root != null)
        {
            traversal(root.left);
            System.out.println(root.data+" ");
            traversal(root.right);
        }
    }
}