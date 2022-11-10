import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        strongnumber(n);
//    perfectnumber(n);
    Armstrongnumber(n);
    }

    public static void Armstrongnumber(int n) {
        int r=0,sum=0;
        while(n>0) {
            r = r % 10;

            sum = sum + r;


            n = n / 10;
        }
        System.out.println(sum);
    }

    public static void perfectnumber(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum)
            System.out.println("yes it is perfect number" + sum);
        else
            System.out.println(sum+"not a perfect number");


    }

    public static void strongnumber(int n) {
        int sum = 0;
        int num=n;
        while (num> 0) {
            int fact = 1;
            int m = num % 10;
            num = num / 10;
            while (m > 0) {
                fact = fact * (m);
                m = m - 1;

            }
            sum = sum + fact;
        }
        if (sum != n) {
        System.out.println("not a Strong number"+ sum);
        }
        else{
            System.out.println("yes it is strong number"+sum);

        }
    }

}

