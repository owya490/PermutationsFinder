import java.util.*;

public class Permutations {


    public static void finder(int arr[]) {
        if (arr.length ==1 ) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i ++) {
            ls.add(arr[i]);
        }
        for (int j = 0 ; j < arr.length; j ++){
            for (int i = arr.length-1; i > 0; i --) {
                int tmp = ls.get(i);
                ls.remove(i);
                ls.add(i - 1, tmp);
                System.out.println(ls.toString());
            }
        }
    }

    public static int dividor(int arr[]) {
        for (int i = 1; i <= arr.length; i ++) {
            for (int j = 0; j + i <= arr.length; j ++) {
                int[] newA = Arrays.copyOfRange(arr, j, j + i);
                finder(newA);
            }
        }
        return 0;
    }


    public static void main(String args[]) {

        int o[] = {1, 2, 3, 4};

        dividor(o);

        //finder(o);



    }
}