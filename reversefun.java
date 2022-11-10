class Solution
{
    public static void main(String[] args) {
        System.out.println(isPalin(121));
    }
    // Complete the function
    // N: input element
    static int helper(int n,int res)
    {
        if(n/10==0){
            return res*10+n;
        }
        return helper(n/10,res*10+n%10);
    }

    static boolean isPalin(int N)
    {
        // Check if the number is palindrome or not
        //You may use a helper function if you like
        int m= helper(N,0);
        if(N==m)
            return true;
        return false;
    }
}