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
    private void sorting (int node) {
        int parentNode = getParentNode(node);
        while(parentNode >= 1) {
            if(PQ[node] > PQ[parentNode]) {
                int temp = PQ[node];
                PQ[node] = PQ[parentNode];
                PQ[parentNode] = temp;
                node = parentNode;
                parentNode = getParentNode(node);
            } else {
                break;
            }
        }
    }
    private int getParentNode (int node) {
        if(node % 2 == 0) {
            return node / 2;
        }
        return node / 2 - 1;
    }



}
