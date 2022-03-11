import java.util.*;
public class Array {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[10][20];

        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array.length; j++) {


                int numReach = random.nextInt(40);
                numReach -= 20;

                array[i][j] = numReach;

                System.out.println(array[i][j]);


            }
        }
    }
}

