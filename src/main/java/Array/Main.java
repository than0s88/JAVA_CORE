package Array;

public class Main {
    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.remove(3);
        array.print();

        System.out.println("The index is: " +array.search(20));

        System.out.println(findSum(20));
        findSum2(5);
    }

    public static int findSum(int n){
        return n * (n + 1) /2;
    }
    public static void findSum2(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
