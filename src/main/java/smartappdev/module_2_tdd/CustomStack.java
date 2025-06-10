package smartappdev.module_2_tdd;

public class CustomStack<T> {


    private Node<T> top;
    private int size;

    public CustomStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
