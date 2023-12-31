package ArraySort.BinaryTree;

public class BinaryTreeClass <T extends Comparable<T>> {
    private T value;
    private int node;
    private BinaryTreeClass leftChild;
    private BinaryTreeClass rightChild;
    public BinaryTreeClass (int node) {
        setNode(node);
        this.value = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    public void insert (T value) {
        if(this.value == null){
            this.value = value;
            return;
        }
        if(value.compareTo(this.value) < 0) {
            if(this.leftChild == null) {
                this.leftChild = new BinaryTreeClass(node*2);
            }
            this.leftChild.insert(value);
        } else if (value.compareTo(this.value) > 0) {
            if(this.rightChild == null) {
                this.rightChild = new BinaryTreeClass(node*2+1);
            }
            this.rightChild.insert(value);
        }
    }
    public T findValue (T value) {
        if(this.value.compareTo(value) == 0) {
            return value;
        }
        if(value.compareTo(this.value) < 0 && this.leftChild != null) {
            return (T) this.leftChild.findValue(value);
        } else if (value.compareTo(this.value) > 0 && this.rightChild != null){
            return (T) this.rightChild.findValue(value);
        }
        return null;
    }
    public Integer findNode (T value) {
        if(this.value.compareTo(value) == 0) {
            return node;
        }
        if(value.compareTo(this.value) < 0 && this.leftChild != null) {
            return this.leftChild.findNode(value);
        } else if (value.compareTo(this.value) > 0 && this.rightChild != null){
            return this.rightChild.findNode(value);
        }
        return null;
    }
    public void setNode (int node) {
        this.node = node;
    }


}
