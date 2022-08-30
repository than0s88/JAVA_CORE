package Code_Exercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayUpperCase {
    public static List<String> arrayUpperCase(List<String> list) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            temp.add(i, list.get(i).toLowerCase());

        }
        return temp;
    }
}
