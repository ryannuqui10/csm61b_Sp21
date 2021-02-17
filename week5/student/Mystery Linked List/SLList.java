public class SLList {
    private IntNode sentinel;

    private static class IntNode {
        public int value;
        public IntNode next;

        public IntNode(int value, IntNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public SLList() {
        this.sentinel = new IntNode(-1, null);
    }

    public void print() {
        IntNode pointer = this.sentinel;
        pointer = pointer.next;
        System.out.print("Sentinel");
        while (pointer != null) {
            System.out.print(" -> ");
            System.out.print(pointer.value);
            pointer = pointer.next;
        }
        System.out.println();
    }

    public SLList multiples(int k, int j) {
        /*
         * TODO: Returns an SLList containing the elements at 
         * indices k, k + 1, k + 2*j, ...
         */
        return new SLList();
    }

    public static void main(String[] args) {
        SLList test1 = new SLList();
        IntNode pointer = test1.sentinel;

        // Create SLList object with elements 0 through 9 (inclusive)
        for (int i = 0; i < 10; i += 1) {
            pointer.next = new IntNode(i, null);
            pointer = pointer.next;
        }

        SLList test2 = test1.multiples(2, 3);

        // Expected SLList: Sentinel -> 2 -> 5 -> 8
        test2.print();
    }
}