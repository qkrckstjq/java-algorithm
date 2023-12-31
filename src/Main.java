import MergeSort.MergeSort;
import PriorityQueue.PriorityQueue;
import QuickSort.QuickSort;
import java.util.Arrays;
import BinaryTree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();
        BT.insert(5);
        BT.insert(3);
        BT.insert(7);
        BT.insert(89);
        BT.insert(1);
        BT.insert(3);
        BT.insert(14);
        BT.insert(15);
        BT.insert(734);
        BT.insert(12);
        BT.insert(3457);
        BT.insert(657);
        BT.insert(7344);
        BT.insert(123);
        BT.insert(7547);
        BT.insert(4868);
        BT.findValueIndex(123);  //123은 60번째 인덱스에 위치함
        System.out.println(Arrays.toString(BT.getBT()));
// ------------------------------------------------------------

//        PriorityQueue PQ = new PriorityQueue();
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
//        int[] arr = {1,3,2,51,12,3,6,2,4,7,78};

//        Integer[] arr = {5,4,7,3,1,2};
//        System.out.println("퀵솔트전 배열\n"+Arrays.toString(arr));
//        QuickSort.sort(arr);
//        System.out.println("퀵솔트후 배열\n"+Arrays.toString(arr));

//-------------------------------------------------------------
//        Integer[] arr = {5,4,7,3,1,2};
//        System.out.println("병합정렬전 배열\n"+Arrays.toString(arr));
//        MergeSort.sort(arr);
//        System.out.println("병합정렬후 배열\n"+Arrays.toString(arr));
    }
}
