package hashtableandbst;

public class BinarySearch<T extends Comparable<T>> {
    Node<T> root;
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
                        return;
                    }
                }
                else
                {
                    current = current.right;
                    if (current == null)
                    {
                        parent.right = newNode;
                        break;
                    }
                }
            }
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