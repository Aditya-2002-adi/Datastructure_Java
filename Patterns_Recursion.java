import java.util.Arrays;
import java.util.Scanner;

public class Patterns_Recursion {


    public static void main(String[] args) {

//        int[] a = {1, 3, 5, 2, 4, 6, 7};
//        System.out.println(swap(a,a.length));
//        queries();
//        starspattern(4,0);
//        starspatternreverse(4,0);
//        bublesort(5,0,a);
//        System.out.println(Arrays.toString(a));

//        selectionsort(5,0,0,a);
//        System.out.println(Arrays.toString(a));
int[] ar={12,1,2,67,9,10};
      int[]  ans=mergesort(ar);
        System.out.println(Arrays.toString(ar));


    }

     static int[] mergesort(int[] a) {
        if(a.length==1)
            return a;
        int mid=a.length/2;
        int[] left=mergesort(Arrays.copyOfRange(a,0,mid));
        int [] right=mergesort(Arrays.copyOfRange(a,mid+1,a.length));

       return merge(left,right);

    }

     static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[left.length+right.length];
        while (j<right.length&&i<left.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;

        }
        while (i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
         while (j<right.length){
             mix[k]=right[j];
             j++;
             k++;
         }
return mix;
    }


    public static   void selectionsort(int r, int c,int m, int[] a) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (a[c] > a[m])
                selectionsort(r, c+1, c, a);
         else
            selectionsort(r, c+1, m, a);
        }
else{
            int temp = a[r-1];
            a[r-1] = a[m];
            a[m] = temp;
            selectionsort(r-1, 0, 0, a);
        }
    }




    static int swap(int[] arr, int n) {

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        return count; }

    public static void queries() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int s = a;

            for (int j = 0; j < c; j++) {
                s = (int) (s + Math.pow(2, j) * b);
                System.out.println(s);
            }
        } }

    public  static void starspattern(int r,int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("*");
            starspattern(r, c + 1);
            // print one line
        } else {
            //going into next line and row reducing
            System.out.println();
            starspattern(r - 1, 0);
        }

    }
    public  static void starspatternreverse(int r,int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            starspatternreverse(r, c+1);
            System.out.print("*");
            // print one line
        } else {
            //going into next line and row reducing
            starspatternreverse(r -1, 0);
            System.out.println();
        }
    }

    public static void bublesort(int r,int c,int[] a){
        if(r==0){
            return;
        }
//        4  0   4 1    4 2    4 3
//        3 0   3 1     3 2
//       2 0    2 1
//      1 0
//
//

         if(r>c){

             if(a[c]>a[c+1]){
                 int temp=a[c];
                 a[c]=a[c+1];
                 a[c+1]=temp;
             }
            bublesort(r,c+1,a);

             }
         else{
             bublesort(r-1,0,a);
         }

    }
    
}




