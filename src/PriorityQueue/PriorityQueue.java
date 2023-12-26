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
        lastNode--;
        PQ[1] = PQ[lastNode];
        PQ[lastNode] = null;

        whenRemovePeek(1);
        return max;
    }
    private void sorting (int node) {
        int parentNode = getParentNode(node);
        while(parentNode >= 1) {
            if(PQ[node] > PQ[parentNode]) {
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
        }

    }
    private int caseSelector (int node) {
        int leftChildNode = node * 2;
        int rightChildNode = node * 2 + 1;

        if(rightChildNode >= lastNode) {
            return 0;
        }
        if(PQ[node] >= PQ[leftChildNode] && PQ[node] >= PQ[rightChildNode]) {
            return 0;
        }

        if(rightChildNode > lastNode && PQ[node] < PQ[leftChildNode]) {
            return 1;
        } else if (rightChildNode > lastNode && PQ[node] > PQ[leftChildNode]) {
            return 0;
        }

        if (PQ[node] < PQ[leftChildNode] && PQ[node] < PQ[rightChildNode] && PQ[leftChildNode] > PQ[rightChildNode]) {
            return 1;
        }
        if (PQ[node] < PQ[leftChildNode] && PQ[node] < PQ[rightChildNode] && PQ[leftChildNode] < PQ[rightChildNode]) {
            return 2;
        }


        if (PQ[node] < PQ[leftChildNode] && PQ[node] > PQ[rightChildNode]) {
            return 1;
        }
        if (PQ[node] > PQ[leftChildNode] && PQ[node] < PQ[rightChildNode]) {
            return 2;
        }
        return 0;
    }
    private int getParentNode (int node) {
        if(node % 2 == 0) {
            return node / 2;
        }
        return node / 2 - 1;
    }
}
