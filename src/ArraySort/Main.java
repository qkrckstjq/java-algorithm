package ArraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,3,2,51,12,3,6,2,4,7,78};

//        Integer[] arr = {5,4,7,3,1,2};
//        System.out.println("퀵솔트전 배열\n"+Arrays.toString(arr));
//        QuickSort.sort(arr);
//        System.out.println("퀵솔트후 배열\n"+Arrays.toString(arr));

//-------------------------------------------------------------
        Integer[] arr = {5,4,7,3,1,2};
        System.out.println("병합정렬전 배열\n"+Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("병합정렬후 배열\n"+Arrays.toString(arr));
// ----------------------------------------------------------------
//        Integer[] arr = {5,4,7,3,1,2,1223,6,3,74,574,56,34,23,521,37635,7};
//        System.out.println("삽입정렬전 배열\n"+Arrays.toString(arr));
//        InsertSort.sort(arr);
//        System.out.println("삽입정렬후 배열\n"+Arrays.toString(arr));
    }
}
