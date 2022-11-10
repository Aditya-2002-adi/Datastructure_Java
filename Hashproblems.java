import java.util.Arrays;
import java.util.HashSet;
import java.lang.*;

 class Main {
//    static int x=10;
    public static void main(String[] args) {

////        naviemethodtimensquare();
////        Hashmethod();
//        System.out.println(longestsubaray());
//        System.out.println(longestsubaraywithhash());
//        System.out.println(sumarryahash());
//        System.out.println(arraywithequal0s());
//        Linearprobing();
//        Quadraticporbing();
//        System.out.println(searchinsorted());
//        squareroot();
    }




    private static void squareroot() {
        int x=5;
        long sqr=(long)Math.sqrt(x);
        long sqrtfloor=(long)(Math.floor(sqr));
        if(sqrtfloor==sqr){
            System.out.println(sqr);
        }
        System.out.println(sqrtfloor);
    }


    private static int searchinsorted() {
        int N=5;
        int arr[]={1,2,3,4,5};
        int K=12;
        // Your code here
        int mid=(N/2);
        System.out.println(mid);
        for(int i=0;i<N;i++){


            if(arr[mid]==K){
                return 1;

            }
            else if(arr[mid]>K){
                while(mid<N){
                    mid++;
                    if(arr[mid]==K)
                        return 1;

//                    System.out.println("1"+mid);
                }
                return 1;

            }
            else if(arr[mid]<K){
                while(mid>0){
                    mid--;
                    if(arr[mid]==K)
                        return 1;
//                    System.out.println("2"+mid);

                }
                return 1;
            }
            else{
                return -1;
            }
            // if(arr[i]==K){
            //     return 1;
            // }
        }
        return -1;

    }


    private static void Quadraticporbing() {
        int arr[] = {9, 99, 999, 9999};
        int hash_size = 16;
        int sizeOfArray = 4;
        int hash[] = new int[hash_size];

        for (int i = 0; i < hash_size; i++) {
            hash[i] = -1;
        }

        for (int i = 0; i < sizeOfArray; i++) {

            int k = (arr[i] % hash_size);
            int p = k;
            int x = 1;
            while (hash[k] != -1 && hash[k] != arr[i]) {
                k = (arr[i] + (x*x)) % hash_size;
                x++;
                if (k == p)
                    break;
            }
            if (hash[k] == -1) {
                hash[k] = arr[i];
            }
        }
        for (int i = 0; i < hash_size; i++) {
            System.out.println(hash[i]);
        }
    }

    private static void Linearprobing() {

        int arr[] = {9, 99, 999, 9999};
        int hash_size = 10;
        int sizeOfArray = 4;
        int hash[]=new int[hash_size];


        for (int i = 0; i < sizeOfArray; i++) {

            int k = (arr[i] % hash_size);
            int p = k;
            int x = 1;
            while (hash[k] != -1 && hash[k] != arr[i]) {
                k = (arr[i] + x) % hash_size;
                x++;
                if (k == p)
                    break;
            }
            if (hash[k] == -1) {
                hash[k] = arr[i];
            }
        }
        for (int i = 0; i < hash_size; i++) {
            System.out.println(hash[i]);
        }
    }


    private static int arraywithequal0s() {
        int a[]={1,0,1,1,1,0,0};
        int n=a.length;
        int res=0;
//        int c0=0,c1=0;
        for(int i=0;i<n;i++){
//            int c=0;
            int c0=0,c1=0;
            for(int j=i;j<n;j++){

                if(a[j]==0){
                    c0++;
                }
                else if(a[j]==1){
                    c1++;
                }
                if(c1==c0){
                   res=Math.max(res,j-i+1);
                }

            }
        }
        return res;
    }

    private static int longestsubaraywithhash() {
        int[] a = {1, 1, 2, 4, 2,1, 5,4};

        HashSet<Integer> hash=new HashSet<Integer>();
        int sum = 9;
        int res = 0;
        int cur=0;
        for (int i = 0; i < a.length; i++) {

           cur+=a[i];
            System.out.println(cur);
           if(cur==sum){
               res=i+1;
           }
           if(hash.contains(cur)==false){
               hash.add(cur);
//               System.out.println(hash);

           }
           if(hash.contains(cur-sum)){
               res=Math.max(res,i-(cur-sum)+1);
           }

           }


        return res;
    }

    private static int longestsubaray() {
        int[] a = {1, 8, 3, 3, 3, 5};
        int sum = 9;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int cur = 0;
            for (int j = i; j < a.length; j++) {
                cur += a[j];
                if (cur == sum) {
                    res = Math.max(res, j - i + 1);

                }

            }
        }
        return res;
    }

    private static boolean sumarryahash() {
        HashSet<Integer> hash = new HashSet<Integer>();
        int[] a = {1, 8, 1, 3, -10, 5};
        int curr = 0;
        for (int i = 0; i < a.length; i++) {
            curr += a[i];

            if (hash.contains(curr)) {
                return true;
            }
            if (curr == 10) {
                return true;
            }
            hash.add(curr);
//            System.out.println(hash);
        }
        return  false;
        }



    private static void Hashmethod() {
        HashSet<Integer> hash = new HashSet<Integer>();
        int[] a = {1, 4, 13, -3, -10, 5};
        int curr = 0;
        for (int i = 0; i < a.length; i++) {

            curr += a[i];

//            hash.add(curr);
//            System.out.println(hash);

            if (hash.contains(curr)) {
                System.out.println("avaliable");
            } else if (curr == 0) {
                System.out.println("yes");
            } else {
                System.out.println("nottt");
            }
            hash.add(curr);
//            System.out.println(hash);
        }
    }


    private static void naviemethodtimensquare() {


        int [] a={1,4,13,-3,-10,5};
        int curr=0;
        for(int i=0;i<a.length;i++){
            curr=0;
            for(int j=i;j<a.length;j++){
                curr+=a[j];
//                System.out.println(curr);
                if(curr==0){
                    System.out.println("yes sum found"+curr);
                }

            }
        }
    }
}
