package hashtableandbst;

public class HashTableClass {
    static class MyMapNode{
        int value;
        MyMapNode next;
        String key;

        MyMapNode(String key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
        public MyMapNode head = null;
        public MyMapNode tail = null;

        public void add(String data, int cnt){
            MyMapNode myMapNode = new MyMapNode(data,cnt);
            if(head == null){
                head = myMapNode;
            }
            else{
                tail.next = myMapNode;
                myMapNode.next = null;
            }
            tail = myMapNode;
        }
        public void getHashTable(String string, HashTableClass hT){
            int timesVisited = -1;
            int freq;
            String[] storeWords = string.toLowerCase().split(" ");
            int[]count = new int[storeWords.length];
            for(int i =0; i< storeWords.length; i++){
                freq =1;
                for (int j = i + 1; j < count.length; j++){
                    if (storeWords[i].equals(storeWords[j]))
                    {
                        freq++;
                        count[j] = timesVisited;
                    }
                }
                if (count[i] != timesVisited)
                    count[i] = freq;
            }
            for (int i = 0; i < count.length; i++)
            {
                if (count[i] != timesVisited)
                {
                    hT.add(storeWords[i], count[i]);
                }
            }
        }
        public void displayHT(){
            MyMapNode current = head;
            if (head == null) {
                System.out.println("HashTable is empty");
            }
            else{
                System.out.println("Frequency of Words in given Statement");
                while (current != null) {
                    System.out.println(current.key + "==>" + current.value);
                    current = current.next;
                }
            }
        }

    public static void main(String[] args) {
        HashTableClass hTable = new HashTableClass();
        String statement = "To be or not to be";
        hTable.getHashTable(statement,hTable);
        hTable.displayHT();
    }
}

