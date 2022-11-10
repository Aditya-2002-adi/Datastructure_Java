public class digits {
    public static void main(String[] args) {
        int m = 19994;
        System.out.println(countd(m));
        int arr[]={1,2,3,4};
        int n=4;
        printArrayRecursively(arr,n);
    }
static int c=0;
   public static int countd(int m) {

        if (m != 0) {
      c++;
      countd(m / 10);
        }
       return c;

    }

        public static void printArrayRecursively(int arr[], int n)
        {
            // Print the array elements recursivelyin

                if(n>=1){
                    printArrayRecursively(arr,n-1);
                    System.out.print(arr[n]);
                }
            }
        }





