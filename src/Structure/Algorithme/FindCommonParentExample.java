package Structure.Algorithme;

public class FindCommonParentExample {

    public static void main(String[] args) {
        int vertex = 9;
        int edge = 7;
        int findA = 3;
        int findB = 8;
        int[][] edges = {{1,2},{2,3},{3,4},{1,5},{6,7},{7,8},{8,9}};
        FindCommonParent fp = new FindCommonParent(vertex);

        for(int i = 0; i < edges.length; i++) {
            fp.setChildToParent(edges[i][0], edges[i][1]);
        }

        fp.printArray();
    }



}
