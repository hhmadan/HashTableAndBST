package hashtableandbst;

public class BinarySearchTreeClass {
    public static void main(String[] args) {
        BinarySearch <Integer> bs = new BinarySearch<>();

        System.out.println("Root of this Binary Search Tree Is: 56");
        bs.add(56);
        bs.add(30);
        bs.add(70);
        bs.add(22);
        bs.add(40);
        bs.add(60);
        bs.add(95);
        bs.add(11);
        bs.add(65);
        bs.add(3);
        bs.add(16);
        bs.add(63);
        bs.add(67);

        System.out.println("Binary Search Tree Traversal");
        bs.traversal(bs.root);
        bs.getSize();

    }
}
