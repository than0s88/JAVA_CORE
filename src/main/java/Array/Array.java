package Array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        if(items.length == count) {
            int[] temp = new int[count * 2];
            for (int i = 0; i < count; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
        items[count++] = item;
    }

    public void remove(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int search(int index){
        for (int i = 0; i <count; i++) {
            if (index == items[i]) {
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}