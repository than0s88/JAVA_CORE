package Code_Exercise;

import java.util.List;

public class AverageArray {
    public static Double average(List<Integer> list) {

        Double average;
        Double sum = 0.0;
        int length = list.size();
        for(Integer i = 0; i<list.size(); i++){
            sum+=list.get(i);
        }
        average = sum / length;

        return average;
    }
}
