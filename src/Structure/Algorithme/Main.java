package Structure.Algorithme;


public class Main {
    public static void main(String[] args) {
        /*
        9 7
        1 2
        2 3
        3 4
        1 5
        6 7
        7 8
        8 9
        3 8
        입력 예시 : 정점 9개 간선 7개 3번 정점과 8번째 정점은 연결되어 있는가?
         */
        int vertex = 9;
        int edge = 7;
        int findA = 3;
        int findB = 8;
        int[][] edges = {{1,2},{2,3},{3,4},{1,5},{6,7},{7,8},{8,9}};

        UnionFind uf = new UnionFind(vertex);

        for(int i = 0; i < edge; i++) {
            uf.union(edges[i][0], edges[i][1]);
        }

        boolean result1 = uf.isConnected(findA, findB);

        if(result1) {
            System.out.println("연결되어 있음");
        } else {
            System.out.println("연결되어 있지 않음");
        }

        uf.printArr();

    }
}
