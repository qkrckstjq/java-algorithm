package Structure;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;
    int size;
    public LinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void add (T data) {
        if(size == 0) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> previousNode = this.tail;
            this.tail = new Node<T>(data);
            previousNode.updateNext(this.tail);
        }
        this.size++;
    }
    public void insert (T data, T previousData) throws IllegalArgumentException {
        Node<T> previousNode = findNode(previousData);
        if (previousNode == null) {
            throw new IllegalArgumentException("삽입하고자 하는 위치 존재하지 않음");
        }
        if (size == 0) {
            throw new IllegalArgumentException("삽입하고자 하는 위치 존재하지 않음");
        }
        Node<T> newNode = new Node<>(data);
        Node<T> temp = previousNode.getNext();
        previousNode.updateNext(newNode);
        newNode.updateNext(temp);
        this.size++;
    }
    public void delete(T data) throws IllegalArgumentException {
        if (size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        }
        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
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
    public Node<T> findNode (T data) throws IllegalArgumentException{
        if(size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        }
        Node<T> findNode = this.head;
        while(!findNode.getData().equals(data) && findNode != null) {
            findNode = findNode.getNext();
            if(findNode == null) {
                return null;
            }
        }
        return findNode;
    }
    public void printAllNodeData () {
        Node<T> node = this.head;
        String result = "";
        while(node != null) {
            result+=node.data + " -> ";
            node = node.getNext();
        }
        System.out.println(result);
    }
    private static class Node <T> {
        private T data;
        private Node<T> next;
        public Node (T data) {
            updateData(data);
            updateNext(null);
        }
        public void updateNext (Node<T> node) {
            this.next = node;
        }
        public void updateData (T data) {
            this.data = data;
        }
        public T getData () {
            return this.data;
        }
        public Node<T> getNext () {
            return this.next;
        }
    }
}
