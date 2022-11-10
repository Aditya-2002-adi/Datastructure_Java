import java.util.Arrays;

public class Recurison_Examples {
    public static void main(String[] args) {
        int[] arr = {0, 21, 23, 24, 5};
//        sumtraingle(arr,5);
//        maxmin(arr, arr[0], 0);
//        maxmin1(arr[0],arr);
        System.out.println(maxminrecur(arr[0],arr,1));
    }

    private static void maxmin1(int max,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }


    private static int maxminrecur(int max, int[] arr, int i) {
        if (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
                maxminrecur(max, arr, arr[i + 1]);
            }

        } return max;


    }

    private static void sumtraingle(int[] arr,int n) {
        if(arr.length==0){
            return;
        }

        else if (arr.length>0) {
            int[] temp = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++)
            {
                int x = arr[i] + arr[i + 1];
                temp[i] = x;
            }
            sumtraingle(temp,arr.length);

        }
        System.out.println(Arrays.toString(arr));


    }
}



