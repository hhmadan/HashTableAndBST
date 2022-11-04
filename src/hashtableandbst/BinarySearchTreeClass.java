package hashtableandbst;

public class BinarySearchTreeClass {
    public static void main(String[] args) {
        BinarySearch <Integer> bs = new BinarySearch<>();

        System.out.println("Root of this Binary Search Tree Is: 56");
        bs.add(56);
        bs.add(30);
        bs.add(70);

        System.out.println("Binary Search Tree Traversal");
        bs.traversal(bs.root);
    }
}
