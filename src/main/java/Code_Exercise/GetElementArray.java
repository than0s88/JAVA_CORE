package Code_Exercise;

import java.util.List;

public class GetElementArray {
    public static Integer getElement(List<Integer> list, Integer n) {
        Integer element = 0;
        Integer counter = 1;

        if (n>list.size()-1){
            return -1;
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) % 2 != 0 && counter<=n){
                element = list.get(i);
                counter++;
            }
        }

        return element;
    }
}
