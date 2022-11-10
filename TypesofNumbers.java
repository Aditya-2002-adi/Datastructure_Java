import java.util.Scanner;

public class TypesofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();


//        Armstrong(n);
//        Harshad(n);
//        Automorphic(n);
//        perfectsquare(n);
//        squareroot(n);
//        perfectcube(n);
//        cuberoot(n);
    }

    private static void cuberoot(int n) {
        double rootcube=Math.cbrt(n);
//        int rcube=(int)rootcube;
        System.out.println(rootcube);
    }

    private static void perfectcube(int n) {
        double cube=Math.cbrt(n);
        int c=(int)cube;
        if(Math.floor(cube)==cube)
        System.out.println("Yes it is a perfect cube :  "+c);
        else
            System.out.println("Not a perfect cube .... ");
    }

    private static void squareroot(int n) {

    }

    private static void perfectsquare(int n) {
        double sq = Math.sqrt(n);
        int square=(int)sq;
        if (Math.floor(sq) == sq) {
            System.out.println("YES IT IS A PERFECT SQUARE :"+square);
        }
        else System.out.println("NOT");
    }


    private static void Automorphic(int num) {
        int n = num;
        int square = n * n, count = 0, r = 0;
        while (n > 0) {
            r = n % 10;
            count++;
            n /= 10;
        }

        System.out.println("Square of number : "+num+  " is : "+square);
      double last = square % (Math.pow(10,count));
        int digit = (int) last;
            if (digit == num) {
                System.out.println("yes this is a automorphic number..");
            }
            else{
                System.out.println("No this is a automorphic number..");
            }




    }private static void Harshad(int n) {
        int sum=0,r=0,num=n;
        while(num>0){
            r=num%10;
            sum+=r;
            num/=10;
        }
        System.out.println(sum);
        if(n%sum==0){
            System.out.println("YES harshad number");
        }
        else System.out.println("not a harshad number");
    }

    private static void Armstrong(int n) {
        int num = n;
        int r = 0, sum = 0;
        while (num > 0) {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if (sum == n) {
            System.out.println("yes it is a armstrong number" + sum);
        } else
            System.out.println(sum + " is OOPS not a armstrong number");
    }
}
