package Structure;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.updateNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void insert(T data, T previousData) {
        Node<T> previousNode = findNode(previousData);
        if (previousNode == null) {
            throw new IllegalArgumentException("삽입하고자 하는 위치 존재하지 않음");
        }

        Node<T> newNode = new Node<>(data);
        newNode.updateNext(previousNode.getNext());
        previousNode.updateNext(newNode);

        if (previousNode == tail) {
            tail = newNode;
        }

        size++;
    }

    public void delete(T data) {
        if (size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            if (size == 0) {
                tail = null;
            }
            return;
        }

        Node<T> currentNode = head;
        while (currentNode.getNext() != null && !currentNode.getNext().getData().equals(data)) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getNext() == null) {
            throw new IllegalArgumentException("찾는 값 없음");
        }

        if (currentNode.getNext() == tail) {
            tail = currentNode;
        }

        currentNode.updateNext(currentNode.getNext().getNext());
        size--;
    }

    public Node<T> findNode(T data) {
        if (size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        }

        Node<T> findNode = head;
        while (findNode != null && !findNode.getData().equals(data)) {
            findNode = findNode.getNext();
        }

        return findNode;
    }

    public void printAllNodeData() {
        Node<T> node = head;
        StringBuilder result = new StringBuilder();
        while (node != null) {
            result.append(node.getData()).append(" -> ");
            node = node.getNext();
        }
        System.out.println(result.toString());
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            updateData(data);
            updateNext(null);
        }

        public void updateNext(Node<T> node) {
            this.next = node;
        }

        public void updateData(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

        public Node<T> getNext() {
            return this.next;
        }
    }
}
