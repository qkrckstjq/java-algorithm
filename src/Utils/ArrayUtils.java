package Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtils<T> {
    public T[] arrExtends(T[] arr, int length) {
        return Arrays.copyOf(arr, length);
    }
    public void swap (T[] arr, int base, int next) {
        T temp = arr[base];
        arr[base] = arr[next];
        arr[next] = temp;
    }
}
