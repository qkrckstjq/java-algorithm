package Structure.Algorithme;

import java.util.Arrays;

public class UnionFind {
    private final int[] UNIONARR;

    public UnionFind (int vertexNumber) {
        UNIONARR = new int[vertexNumber+1];
        for(int i = 0; i < UNIONARR.length; i++) {
            UNIONARR[i] = i;
        }
    }
    private int find (int vertex) { //해당 정점의 최고 부모 노드를 찾아서 리턴함
        if(UNIONARR[vertex] == vertex) {
            return UNIONARR[vertex];
        }
        return UNIONARR[vertex] = find(UNIONARR[vertex]);
    }
    public void union (int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) UNIONARR[b] = UNIONARR[a];
    }
    public boolean isConnected(int a, int b) {
        return UNIONARR[a] == UNIONARR[b];
    }

    public void printArr () {
        System.out.println(Arrays.toString(UNIONARR));
    }


}
