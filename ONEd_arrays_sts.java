import java.util.Arrays;

public class ONEd_arrays_sts {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6};
        int []b={2,1,3,5,7,9,0,9};
//        findmax(a);
//        sum2arrays(a,b);
//        compatiblearrays(a,b);
//        searchelement(a);
//        sumeven(a);
        finddisticnt(b);
        Compare2arrays(a,b);
        Insertion(a);
        deletion();
//        int[] arr={10,20,30,40,50,60};
//        Arthmeticmean_mode_median(arr);
        Range();
    }


    private static void findmax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max);
            max=arr[i];

        }
        System.out.println("Maximum element in an array"+max);
    }

    private static void sum2arrays(int[] a,int[]b) {
        int sum[]=new int[a.length];
        if (a.length == b.length) {
            for (int i = 0; i < a.length && i < b.length; i++) {
                sum[i]=a[i]+b[i];

            }
            System.out.println("Adding two arrays..");
            for(int e: sum){
                System.out.print(e+ " ");
            }
        }
        else{
            System.out.println(" oops length is not same we cant ...");
        }
    }

    private static void compatiblearrays(int[] a,int[] b) {
        int flag=1;
        if (a.length == b.length) {
            for (int i = 0; i < a.length && i < b.length; i++) {
   if(a[i]>=b[i]){
    flag++;
}

            }
            if(flag==a.length){
                System.out.println("yes compatible...");
            }
            else{
                System.out.println("not compatible..");
            }

        }
        else{
            System.out.println("oops arrays are of differnt sizes ....");
        }

    }



    private static void searchelement(int [] a) {
        int element=4;
int flag=0;
        for(int i=0;i<a.length;i++){
            if(element==a[i]){
                flag=1;
                System.out.println("element found at poistion :"+ i);
            }


        }
        if(flag==1){
            System.out.println("element..found");
        }
        else{
            System.out.println("not found..");
        }
    }

    private static void finddisticnt(int []a) {
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                } else if (a[i] != a[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }


    }

    private static void sumeven(int []a) {
        int sumeven=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            sumeven+=a[i];

        }
        System.out.println(sumeven);


    }

    private static void Compare2arrays(int []a,int[] b) {
     if(Arrays.equals(a,b)){
            System.out.println("yes");
        }

    }

    private static void Insertion(int []a) {
        int []b=new int[a.length+1];
        int x=20;
        int p=3;
        for (int i=0;i<b.length;i++){
            b[i]=a[i];
            if(i==p){
                b[i]=p;

            }


        }
    }

    private static void deletion() {
    }

    private static void Arthmeticmean_mode_median(int[] a) {
        double mean=0;
       double sum=0;
        for(int i=0;i<a.length;i++){
          sum+=a[i];
        }
        mean=sum/a.length;
        System.out.println("Arthematic Mean: "+mean);


        System.out.println("finding medain");
        int m=0,m1=0,m2=0;
        for(int i=1;i<=a.length;i++){
            if(a.length%2!=0){

                 m=(a.length/2); }
//            System.out.println(a[m]);

            for(i=1;i<=a.length;i++) {
                if(a.length%2==0){
                    m1 = (a.length / 2);
                    m2 = (a.length / 2)+1 ;
                }

            }
            int medianeven = (a[m2-1] + a[m1-1])/2;
            System.out.println(medianeven);
        }

    }

    private static void Range() {
    }
}
