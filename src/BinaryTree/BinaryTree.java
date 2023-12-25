package BinaryTree;

import java.util.Arrays;

public class BinaryTree {
    private int defaultSize = 10;
    private Integer[] BT;
    public BinaryTree() {
        this.BT = new Integer[defaultSize];
        this.BT[0] = null;
    }
    public void insert(int number) {
        int currentIndex = 1;

        while (currentIndex < BT.length) {
            if (BT[currentIndex] == null) {
                BT[currentIndex] = number;
                break;
            } else if (number < BT[currentIndex]) {
                currentIndex = currentIndex * 2; // 왼쪽 자식으로 이동
            } else if (number > BT[currentIndex]) {
                currentIndex = currentIndex * 2 + 1; // 오른쪽 자식으로 이동
            } else {
                break;
            }
        }

        // 배열 크기가 부족하면 확장
        if (currentIndex >= BT.length) {
            arrExtends(BT.length * 2);
        }
    }

    public void findValueIndex (int number) {
        int node = 1;
        while(BT[node] != null) {
            if(BT[node] == number) {
                System.out.printf("%d은 %d번째 인덱스에 위치함\n", number, node);
                return;
            }
            if(number < BT[node]) {
                node = node * 2;
            } else if (number > BT[node]) {
                node = node * 2 + 1;
            }
        }
        System.out.printf("%d는 현재 BT에 존재하지 않음\n",number);
    }


    private void arrExtends(int length) {
        this.BT = Arrays.copyOf(this.BT, length);
    }

    public Integer[] getBT() {
        return BT;
    }

}
