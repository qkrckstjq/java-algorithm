package PriorityQueue;

import Utils.ArrayUtils;

public class PriorityQueue {
    private int defaultSize = 10;
    private Integer[] PQ;
    private int realSize;
    private ArrayUtils<Integer> intArrayUtils = new ArrayUtils<>();
    public PriorityQueue () {
        this.PQ = new Integer[defaultSize];
        this.PQ[0] = null;
        this.realSize = 1;
    }
    public void insert (int number) {
        if(realSize >= PQ.length) {
            PQ = intArrayUtils.arrExtends(PQ, PQ.length*2);
        }
        PQ[realSize] = number;
        sorting(realSize);
        realSize++;
    }
    public Integer[] getPQ () {
        return PQ;
    }
    public int getPeek () {
        return PQ[1];
    }
    private void sorting (int node) {
        int parentNode = getParentNode(node);
        while(parentNode != 0 || PQ[node] > PQ[parentNode]) {
            int temp = PQ[node];
            PQ[node] = PQ[parentNode];
            PQ[parentNode] = temp;
            node = parentNode;
            parentNode = getParentNode(node);
        }
    }
    private int getParentNode (int node) {
        if(node / 2 == 0) {
            return node / 2;
        }
        return node / 2 - 1;
    }



}
