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

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (size == 0) {
            head = tail = newNode;
        } else {
            Node<T> temp = tail;
            tail.updateNext(newNode);
            tail = newNode;
            tail.updatePrev(temp);
        }
        size++;
    }
    public T shift () {
        T result;
        if (size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        } else if (size == 1){
            result = head.data;
            head = null;
            tail = null;
            size--;
            return result;
        } else {
            result = head.data;
            head = head.next;
            size--;
            return result;
        }
    }
    public T pop () {
        T result;
        if (size == 0) {
            throw new IllegalArgumentException("리스트 비어있음");
        } else if (size == 1){
            result = tail.data;
            head = null;
            tail = null;
            size--;
            return result;
        } else {
            result = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return result;
        }
    }
    public boolean isEmpty () {
        return size == 0;
    }


    public void printAllNodeData() {
        Node<T> node = head;
        StringBuilder result = new StringBuilder();
        while (node != null) {
            result.append(node.data).append(" -> ");
            node = node.next;
        }
        System.out.println(result.toString());
    }

    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;
        public Node(T data) {
            updateData(data);
            updateNext(null);
        }
        public void updatePrev(Node<T> node) {
            this.prev = node;
        }
        public void updateNext(Node<T> node) {
            this.next = node;
        }
        public void updateData(T data) {
            this.data = data;
        }
    }
    //    public void insert(T data, T previousData) {
//        Node<T> previousNode = findNode(previousData);
//        if (previousNode == null) {
//            throw new IllegalArgumentException("삽입하고자 하는 위치 존재하지 않음");
//        }
//
//        Node<T> newNode = new Node<>(data);
//        newNode.updateNext(previousNode.next);
//        previousNode.updateNext(newNode);
//
//        if (previousNode == tail) {
//            tail = newNode;
//        }
//
//        size++;
//    }

//    public void delete(T data) {
//        if (size == 0) {
//            throw new IllegalArgumentException("리스트 비어있음");
//        }
//
//        if (head.getData().equals(data)) {
//            head = head.next;
//            size--;
//            if (size == 0) {
//                tail = null;
//            }
//            return;
//        }
//
//        Node<T> currentNode = head;
//        while (currentNode.next != null && !currentNode.next.getData().equals(data)) {
//            currentNode = currentNode.next;
//        }
//
//        if (currentNode.next == null) {
//            throw new IllegalArgumentException("찾는 값 없음");
//        }
//
//        if (currentNode.next == tail) {
//            tail = currentNode;
//        }
//
//        currentNode.updateNext(currentNode.next.next);
//        size--;
//    }
    //    public Node<T> findNode(T data) {
//        if (size == 0) {
//            throw new IllegalArgumentException("리스트 비어있음");
//        }
//
//        Node<T> findNode = head;
//        while (findNode != null && !findNode.getData().equals(data)) {
//            findNode = findNode.next;
//        }
//
//        return findNode;
//    }
}
