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
    public void addChildren (T data) {
        this.childrens = ArrayUtils.arrExtends(childrens, childrens.length+1);
        this.childrens[childrens.length-1] = new Tree<T>(data, depth+1);
    }
    public StringBuilder findDfs (T data, Tree<T> root) {
        StringBuilder result = new StringBuilder();
        LinkedList<Tree<T>> stack = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Tree cur = stack.pop();
            for(Tree children : cur.childrens) {
                stack.push(children);
            }

        }
    }
    public T getData () {
        return this.data;
    }
    public Tree[] getChildren () {
        return this.childrens;
    }
}

