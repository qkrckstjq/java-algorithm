package Structure;

import ArraySort.InsertSort;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        BinaryTreeArr<Integer> BT = new BinaryTreeArr();
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
//        BinaryTreeClass<Integer> BT = new BinaryTreeClass(1);
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
//        int findValue = 4868;
//        Integer value = BT.findValue(findValue);
//        Integer node = BT.findNode(findValue);
//        System.out.printf("%d는 %d노드에 위치함",value, node);
// ------------------------------------------------------------

//        PriorityQueue<Integer> PQ = new PriorityQueue();
//        PQ.insert(1);
//        PQ.insert(5);
//        PQ.insert(6);
//        PQ.insert(16);
//        PQ.insert(81);
//        PQ.insert(91);
//        PQ.insert(451);
//        PQ.insert(631);
//        PQ.insert(12);
//        System.out.println(Arrays.toString(PQ.getPQ()));
//        PQ.removePeek();
//        System.out.println(Arrays.toString(PQ.getPQ()));
//        PQ.removePeek();
//        System.out.println(Arrays.toString(PQ.getPQ()));
//        PQ.removePeek();
//        System.out.println(Arrays.toString(PQ.getPQ()));
//        PQ.removePeek();
//        System.out.println(Arrays.toString(PQ.getPQ()));
//        PQ.removePeek();
// ----------------------------------------------------
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(45);
        linkedList.add(5136);
        linkedList.add(865);
        linkedList.add(545);
        linkedList.add(5123);
        linkedList.add(554);
        linkedList.add(5423);
        linkedList.printAllNodeData();

        linkedList.insert(1111, 5123);
        linkedList.printAllNodeData();
        linkedList.delete(1111);
        linkedList.printAllNodeData();

    }
}