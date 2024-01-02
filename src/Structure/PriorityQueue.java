package Structure;

import Utils.ArrayUtils;

import java.util.Arrays;

public class PriorityQueue<T extends Comparable<T>> {
    private int defaultSize = 10;
    private T[] PQ;
    private int lastNode;
    public PriorityQueue () {
        this.PQ = (T[]) new Comparable[defaultSize];
        this.PQ[0] = null;
        this.lastNode = 1;
    }
    public void insert (T number) {
        if(lastNode >= PQ.length) {
            PQ = ArrayUtils.arrExtends(PQ, PQ.length * 2);
        }
        PQ[lastNode] = number;
        if(lastNode == 1) {
            lastNode++;
            return;
        }
        sorting(lastNode);
        lastNode++;
    }
    public T[] getPQ () {
        return PQ;
    }
    public T getPeek () {
        return PQ[1];
    }
    public T removePeek () {
        T max = PQ[1];
        lastNode--;
        PQ[1] = PQ[lastNode];
        PQ[lastNode] = null;

        whenRemovePeek(1);
        return max;
    }
    private void sorting (int node) {
        int parentNode = getParentNode(node);
        while(parentNode >= 1) {
            if(PQ[node].compareTo(PQ[parentNode]) > 0) {
                ArrayUtils.swap(PQ, node, parentNode);
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
                ArrayUtils.swap(PQ, node, leftChildNode);
                node = node * 2;
            }
            if(nodeCase == 2) {
                ArrayUtils.swap(PQ, node, rightChildNode);
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
        if(PQ[node].compareTo(PQ[leftChildNode]) >= 0 && PQ[node].compareTo(PQ[rightChildNode]) >= 0) {
            return 0;
        }

        if(rightChildNode > lastNode && PQ[node].compareTo(PQ[leftChildNode]) < 0) {
            return 1;
        } else if (rightChildNode > lastNode && PQ[node].compareTo(PQ[leftChildNode]) > 0) {
            return 0;
        }

        if (PQ[node].compareTo(PQ[leftChildNode]) < 0 && PQ[node].compareTo(PQ[rightChildNode]) < 0 && PQ[leftChildNode].compareTo(PQ[rightChildNode]) > 0) {
            return 1;
        }
        if (PQ[node].compareTo(PQ[leftChildNode]) < 0 && PQ[node].compareTo(PQ[rightChildNode]) < 0 && PQ[leftChildNode].compareTo(PQ[rightChildNode]) < 0) {
            return 2;
        }

        if (PQ[node].compareTo(PQ[leftChildNode]) < 0 && PQ[node].compareTo(PQ[rightChildNode]) > 0) {
            return 1;
        }
        if (PQ[node].compareTo(PQ[leftChildNode]) > 0 && PQ[node].compareTo(PQ[rightChildNode]) < 0) {
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
