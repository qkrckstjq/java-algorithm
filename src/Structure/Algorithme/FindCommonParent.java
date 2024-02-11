package Structure.Algorithme;

import java.util.Arrays;
import java.util.HashMap;

public class FindCommonParent {
    private final HashMap<Integer ,Integer> parentArray;
    public FindCommonParent(int vertexNumber) {
        this.parentArray = new HashMap<>();
        for(int i = 1; i <= vertexNumber; i++) {
            this.parentArray.put(i,i);
        }
    }
    private int findParent(int child) {
        int parent = child;
        while (this.parentArray.get(parent) != parent) {
            parent = this.parentArray.get(parent);
        }
        return parent;
    }
    public void setChildToParent(int parent, int child) {
        int parentParent = findParent(parent);
        int childParent = findParent(child);
        if (parentParent != childParent) {
            this.parentArray.put(child, parentParent);
        }
    }
    private boolean isConnected(int a, int b) {
        int aParent = findParent(a);
        int bParent = findParent(b);
        return aParent == bParent;
    }
    public void printArray() {
        for(Integer key : this.parentArray.keySet()) {
            System.out.printf("%d의 최종 부모는 %d\n",key, this.parentArray.get(key));
        }
    }

}
