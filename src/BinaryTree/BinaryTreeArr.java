package BinaryTree;

import Utils.ArrayUtils;

public class BinaryTreeArr<T extends Comparable<T>> {
    private int defaultSize = 10;
    private T[] BT;

    public BinaryTreeArr() {
        this.BT = (T[]) new Comparable[defaultSize];
        this.BT[0] = null;
    }
    public void insert(T number) {
        int currentIndex = 1;

        while (currentIndex < BT.length) {
            if (BT[currentIndex] == null) {
                BT[currentIndex] = number;
                break;
            } else if (number.compareTo(BT[currentIndex]) < 0) {
                currentIndex = currentIndex * 2; // 왼쪽 자식으로 이동
            } else if (number.compareTo(BT[currentIndex]) > 0) {
                currentIndex = currentIndex * 2 + 1; // 오른쪽 자식으로 이동
            } else {
                break;
            }
        }

        // 배열 크기가 부족하면 확장
        if (currentIndex >= BT.length) {
            this.BT = ArrayUtils.arrExtends(this.BT, BT.length * 2);
        }
    }

    public void findValueIndex (T number) {
        int node = 1;
        while(BT[node] != null) {
            if(BT[node] == number) {
                System.out.printf("%d은 %d번째 인덱스에 위치함\n", number, node);
                return;
            }
            if(number.compareTo(BT[node]) < 0) {
                node = node * 2;
            } else if (number.compareTo(BT[node]) > 0) {
                node = node * 2 + 1;
            }
        }
        System.out.printf("%d는 현재 BT에 존재하지 않음\n",number);
    }
    public T[] getBT() {
        return BT;
    }

}
