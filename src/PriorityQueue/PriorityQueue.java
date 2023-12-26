package PriorityQueue;

import Utils.ArrayUtils;

import java.util.Arrays;

public class PriorityQueue {
    private int defaultSize = 10;
    private Integer[] PQ;
    private int lastNode;
    private ArrayUtils<Integer> intArrayUtils = new ArrayUtils<>();
    public PriorityQueue () {
        this.PQ = new Integer[defaultSize];
        this.PQ[0] = null;
        this.lastNode = 1;
    }
    public void insert (int number) {
        if(lastNode >= PQ.length) {
            PQ = intArrayUtils.arrExtends(PQ, PQ.length * 2);
        }
        System.out.println(lastNode);
        PQ[lastNode] = number;
        if(lastNode == 1) {
            lastNode++;
            return;
        }
        sorting(lastNode);
        lastNode++;
    }
    public Integer[] getPQ () {
        return PQ;
    }
    public int getPeek () {
        return PQ[1];
    }
    public int removePeek () {
        int max = PQ[1];
        PQ[1] = PQ[lastNode];
        PQ[lastNode] = null;
        lastNode--;
        whenRemovePeek(1);
    }
    private void sorting (int node) {
        int parentNode = getParentNode(node);
        while(parentNode >= 1) {
            if(PQ[node] > PQ[parentNode]) {
//                int temp = PQ[node];
//                PQ[node] = PQ[parentNode];
//                PQ[parentNode] = temp;
                intArrayUtils.swap(PQ, node, parentNode);
                node = parentNode;
                parentNode = getParentNode(node);
            } else {
                break;
            }
        }
    }
    private void whenRemovePeek (int node) {
        while(node <= lastNode) {
            int leftChildNode = node * 2;
            int rightChildNode = node * 2 + 1;
            int nodeCase = caseSelector(node);
            if(nodeCase == 0) {
                return;
            }
            if(nodeCase == 1) {
                intArrayUtils.swap(PQ, node, leftChildNode);
                node = node * 2;
            }
            if(nodeCase == 2) {
                intArrayUtils.swap(PQ, node, rightChildNode);
                node = node * 2 + 1;
            }
            if(nodeCase == 3) {
                intArrayUtils.swap(PQ, node, leftChildNode);
                node = node * 2;
            }
            if(nodeCase == 4) {
                intArrayUtils.swap(PQ, node, rightChildNode);
                node = node * 2 + 1;
            }
        }

    }
    private int caseSelector (int node) {
        int now = PQ[node];
        int leftChild = PQ[node * 2];
        int rightChild = PQ[node * 2 + 1];
        if(now >= leftChild && now >= rightChild) {
            return 0;
        }
        if (now < leftChild && now < rightChild && leftChild > rightChild ) {   //왼쪽 자식 노드와 교체
            return 1;
        }
        if (now < leftChild && now < rightChild && leftChild < rightChild ) {   //오른쪽 자식 노드와 교체
            return 2;
        }
        if (now < leftChild && now > rightChild) {  //왼쪽 자식 노드와 교체
            return 3;
        }
        if (now > leftChild && now < rightChild) {  //오른쪽 자식 노드와 교체
            return 4;
        }
        return 5;
    }
    private int getParentNode (int node) {
        if(node % 2 == 0) {
            return node / 2;
        }
        return node / 2 - 1;
    }
}
