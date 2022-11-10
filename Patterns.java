import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
//        pattern1(n);
//        System.out.println();
//        pattern2(n);
//        System.out.println();
//        pattern3(n);
//        System.out.println();
//        pattern4(n);
//        System.out.println();
//        pattern5(n);
//        System.out.println();
//        pattern6(n);
//        System.out.println();
//        pattern7(n);
//        System.out.println();
//        pattern8(n);
//        System.out.println();
        pattern9(n);
//        System.out.println();
//        pattern10(n);
//        System.out.println();
//
    }

    private static void pattern10(int n) {
    }

    private static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                
            }
            for (int k = i; k < n; k++) {
                System.out.print("*" + " ");
            }
        }
            System.out.println();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k < n; k++) {
                    System.out.print("*" + " ");
                }

            }
        }


    private static void pattern8(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for(int i=1;i<=n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.println();
            }
        }
    } //floyyds and pascals triangle..

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

    }

    public static void pattern2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

    public static void pattern3(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i + 1; k < n; k++) {
                System.out.print("*" + " ");
            }
        }
        System.out.println();


    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                if (i == 1 && j == 1 || i == 2 && j == 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }


    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j>=0; j--) {

                    System.out.print(" ");
                }

                 for(int k=0;k<2*i+1;k++) {
                     System.out.print("*");
                 }

            System.out.println();

        }

    }
}
