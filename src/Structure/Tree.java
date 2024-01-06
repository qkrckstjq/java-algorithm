package Structure;

import Utils.ArrayUtils;

public class Tree <T>{
    private T data;
    private Tree<T>[] childrens;
    private int depth;
    public Tree (T data, int number) {
        this.data = data;
        this.childrens = new Tree[0];
        this.depth = number;
    }
    public static <T> void addChildren (Tree<T> node,T data) {
        node.childrens = ArrayUtils.arrExtends(node.childrens, node.childrens.length+1);
        node.childrens[node.childrens.length-1] = new Tree<T>(data, node.depth+1);
    }
    public static <T> Tree<T> findDfs (Tree<T> root, T data) {
        LinkedList<Tree<T>> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Tree<T> cur = stack.pop();
            if(cur.data.equals(data)) {
                return cur;
            }
            for(Tree children : cur.childrens) {
                stack.push(children);
            }
        }
        throw new IllegalArgumentException("찾는값 이 존재 하지 않음");
    }
    public static <T> void findRoute (Tree<T> root, T data) {
        LinkedList<Tree<T>> stack = new LinkedList<>();
        LinkedList<StringBuilder> stackResult = new LinkedList<>();
        stack.push(root);
        stackResult.push(new StringBuilder(root.data.toString()));

        while(!stack.isEmpty()) {
            Tree<T> cur = stack.pop();
            StringBuilder curResult = stackResult.pop();
            if(cur.data.equals(data)) {
                System.out.println(curResult);
                return;
            }
            for(Tree children : cur.childrens) {
                stack.push(children);
                stackResult.push(new StringBuilder(String.format("%s -> %d", curResult, (int) children.data)));
            }
        }
        throw new IllegalArgumentException("찾는값 이 존재 하지 않음");
    }
//    public T getData () {
//        return this.data;
//    }
//    public Tree[] getChildren () {
//        return this.childrens;
//    }
}

