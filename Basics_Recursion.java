public class Basics_Recursion {
    public static void main(String[] args) {
        System.out.println("Recursion pratise");
        int b = 12457;
        System.out.println("Sumof digits:"+sumofdigits(b));
        System.out.println("FACTORIAL"+ fact(5));
        System.out.println("MULTIPLICATION: "+mulofdigits(b));
         reverse(b);
        System.out.println("Reverse num:"+sum);
        System.out.println("palindrome num:"+palindrome(b));

        System.out.println("Number of zeros in number :"+countzeors(10201000,0));
    }
    public static int sumofdigits(int a){
     if(a==0) {
         return 0;
     }
     else{

         return a%10+sumofdigits(a/10);
     }
     }

     public  static int fact(int a){
         if(a<=0) {
             return 1;
         }
         else{

             return a*fact(a-1);
         }
     }
//
    public  static int mulofdigits(int a){
        if(a==0) {
            return 0;
        }
        else{

            return a%10*sumofdigits(a/10);
        }
    }
     static int sum=0;
    public  static int reverse(int a){
        if(a==0){
            return a;
        }
        else{
            int r=a%10;
            sum=sum*10+r;
           reverse(a/10);
        }

        return a;
    }
     public static int  countzeors(int a,int c){
if(a==0){
    return c ;
}

int r=a%10;
if(r==0){
   return countzeors(a/10,c+1);

}
         return countzeors(a/10,c);

    }
//
//static int m=0;
public static boolean palindrome(int a){
//        if(a==0){
//            return false;
//        }
//        else{
//            int r=a%10;
//            sum=sum*10+r;
//            m=reverse(a);
//        }


    return a==sum;
    }

}



