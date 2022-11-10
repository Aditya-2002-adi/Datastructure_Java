public class recursionstring {
    public static void main(String[] args) {
        String s = "abscdttt";
        int count = 0;
        int [] arr={1,2,3,4,5,6};
//        lettersstring(s, count);
//        System.out.println(isPowerOfTwo(53));
//        System.out.println(isPowerOfThree(217));
//        System.out.println(isPowerOffour(64));
//        Arraysorted(arr,1);
     numberofstepsofzeros(123,0);
     



    }

    private static void numberofstepsofzeros(int n, int count) {
         if(n==0){
             System.out.println(count);
        }
        if(n>1&&n%2==0){
            count++;
            n/=2;
            numberofstepsofzeros(n,count);

        }
        else if(n%2!=0){
            n=n-1;
            count++;
            numberofstepsofzeros(n,count);

        }

    }

    private static void Arraysorted(int[] arr,int i) {
  if(i<arr.length) {
      if (arr[i-1] < arr[i]) {
          Arraysorted(arr, i + 1);
          System.out.println("true");
      }
      else{
          System.out.println("False");
      }
  }

}




    private static boolean isPowerOfThree(int i) {
        if(i==1){
            return true;
        }
        double result= (Math.log(i)/Math.log(3));
      if(i%3==0 && (Math.floor(result)==result))
        {
            return true;
        }
      else if(i<0 ||i==0){
          return  false;
      }
      else return  false;
    }

    private static boolean isPowerOffour(int i) {
        if(i==1){
            return true;
        }
        double result= (Math.log(i)/Math.log(4));
        if(i%4==0 && (Math.floor(result)==result))
        {

            return true;
        }
       else if(i<0 ||i==0){
            return  false;
        }
       else return  false;
    }

    public  static  boolean isPowerOfTwo(int n) {
                if(n==1){
                    return true;
                }
               double result =(Math.log(n) / Math.log(2));
                System.out.println(result);

                if(n%2==0&& Math.floor(result)==result ){
                    return true;
                }
                else{
                    return false;
                }
            }




    private static void lettersstring(String s,int count) {
        if (s.isEmpty())
            System.out.println(count);
        else {
            count++;
            lettersstring(s.substring(1), count);
        }
    }

}
