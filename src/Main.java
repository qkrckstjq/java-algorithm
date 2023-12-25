import BinaryTree.BinaryTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        BT.insert(5);
        BT.insert(3);
        BT.insert(7);
        BT.insert(89);
        BT.insert(1);
        BT.insert(3);
        BT.insert(8);
        BT.findValueIndex(89);  //89은 7번째 인덱스에 위치함
        System.out.println(Arrays.toString(BT.getBT())); //[null, 5, 3, 7, 1, null, null, 89, null, null, null, null, null, null, null, null, null, null, null, null]
    }
}