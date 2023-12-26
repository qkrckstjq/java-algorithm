import PriorityQueue.PriorityQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        BinaryTree BT = new BinaryTree();
//        BT.insert(5);
//        BT.insert(3);
//        BT.insert(7);
//        BT.insert(89);
//        BT.insert(1);
//        BT.insert(3);
//        BT.insert(14);
//        BT.insert(15);
//        BT.insert(734);
//        BT.insert(12);
//        BT.insert(3457);
//        BT.insert(657);
//        BT.insert(7344);
//        BT.insert(123);
//        BT.insert(7547);
//        BT.insert(4868);
//        BT.findValueIndex(123);  //123은 60번째 인덱스에 위치함
//        System.out.println(Arrays.toString(BT.getBT()));
        PriorityQueue PQ = new PriorityQueue();
        PQ.insert(1);
        PQ.insert(5);
        PQ.insert(6);
        PQ.insert(16);
        PQ.insert(81);
        PQ.insert(91);
        PQ.insert(451);
        PQ.insert(631);
        PQ.insert(12);
        System.out.println(Arrays.toString(PQ.getPQ()));
        PQ.removePeek();
        System.out.println(Arrays.toString(PQ.getPQ()));
        PQ.removePeek();
        System.out.println(Arrays.toString(PQ.getPQ()));
        PQ.removePeek();
        System.out.println(Arrays.toString(PQ.getPQ()));
        PQ.removePeek();
        System.out.println(Arrays.toString(PQ.getPQ()));
        PQ.removePeek();
    }
}