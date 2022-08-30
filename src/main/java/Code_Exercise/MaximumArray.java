package Code_Exercise;

public class MaximumArray {
    public Integer maximum(Integer[] list) {
        Integer temp = 0;
        for(Integer i = 0; i < list.length; i++){

            if(temp<list[i]){
                temp = list[i];
            }
        }
        return temp;
    }
}
