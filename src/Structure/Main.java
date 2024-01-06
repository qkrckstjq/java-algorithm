package Structure;

import ArraySort.InsertSort;
import org.w3c.dom.Node;

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
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.push(5);
//        linkedList.push(45);
//        linkedList.printAllNodeData();
//        linkedList.pop();
//        linkedList.pop();
//        linkedList.pop();
//        linkedList.printAllNodeData();
//------------------------------------------------------
        Tree<Integer> root = new Tree<>(1,1);
        Tree.addChildren(root,2);
        Tree.addChildren(root,6);
        Tree.addChildren(root,62);
        Tree.addChildren(root,72);
        Tree.addChildren(Tree.findDfs(root, 6), 51);
        Tree.addChildren(Tree.findDfs(root, 6), 511);
        Tree.addChildren(Tree.findDfs(root, 6), 5116);
        Tree.addChildren(Tree.findDfs(root, 51), 5123116);
//        Tree<Integer> findNode = Tree.findDfs(root, 5116);
//        Tree<Integer> findNode2 = Tree.findDfs(root, 5123116);
        Tree.findRoute(root, 5123116);
    }
}
