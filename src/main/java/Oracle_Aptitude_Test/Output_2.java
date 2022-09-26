package Oracle_Aptitude_Test;

public class Output_2 {
    public static void main(String[] args) {

        int i=3;
        i=func(i);
        i=func(i);
        System.out.println(i);


    }

    public static int func(int i)
    {
        if(i%2 == 0)
            return 0;
        else
            return 1;
    }
}
