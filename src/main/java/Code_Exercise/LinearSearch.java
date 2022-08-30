package Code_Exercise;

public class LinearSearch {
    //LINEAR SEARCH
    public int search(Integer n, Integer[] list) {
        Integer index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)){
                index = i;
            }
        }

        return index;
    }
}
