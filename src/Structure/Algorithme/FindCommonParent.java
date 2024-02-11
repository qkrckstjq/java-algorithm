package Structure.Algorithme;

import java.util.Arrays;
import java.util.HashMap;

public class FindCommonParent {
    private final HashMap<Integer ,Integer> parentArray;
    private boolean hasCycle;
    public FindCommonParent(int vertexNumber) {
        this.parentArray = new HashMap<>();
        this.hasCycle = false;
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
        if (parent == child) {
            return;
        }
        int parentParent = findParent(parent);
        int childParent = findParent(child);
        if (parentParent != childParent) {
            this.parentArray.put(child, parentParent);
        } else {
            this.hasCycle = true;
            //부모가될 노드와 자식 노드의 집합(부모)이 같다면 이미 같은 집합내에서 연결점이 있다는 뜻인데 여기서 서로 연결시키면 사이클이 발생
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
    public boolean hasCycle() {
        for (Integer child : parentArray.keySet()) {
            int parent = findParent(child);
            if (parent == child) continue; // 부모가 자기 자신인 경우를 건너뜁니다.

            if (isConnected(parent, child)) {
                System.out.println("사이클이 존재합니다.");
                return true;
            }
        }
        System.out.println("사이클이 존재하지 않습니다.");
        return false;
    }

}
