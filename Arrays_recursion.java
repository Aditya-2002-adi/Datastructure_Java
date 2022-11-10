import java.util.ArrayList;

public class Arrays_recursion {
    public static void main(String[] args) {
      int arr[]={1,12,4,1,8,3,1,2};
      int array[] ={ 5,6,7,8,9,1,2,3,4};
        System.out.print("1.find array is sorted or not : "+sorted(arr,0));
        System.out.println();
        System.out.println("2.printing an array : "+print(arr,0));
        System.out.println();
        System.out.println("3.seraching: "+find(arr,0,4));
        System.out.println();
        System.out.println("4.seraching for index: "+findindex(arr,0,2));
        System.out.println();
        System.out.println("5.seraching form last  index: "+findlastindex(arr,arr.length-1,2));
        System.out.println();
        findmore( arr,0,1);
        System.out.println("6. adding more indexes : "+list);
        System.out.println();
        ArrayList<Integer> ans=findmore2( arr,0,1,new ArrayList<>());
        System.out.println("7. with passing list"+ans );
        System.out.println();
        System.out.println("8. Without passing list"+findwithoutlistindex(arr,0,1));
        System.out.println();
        System.out.println("9. Roatted binary search finding element at index: "+RBS(array,1,0, array.length-1));




    }

    public  static boolean  sorted(int[] a,int n){
        if(n==a.length){
            return true;
        }
        return a[n]<a[n+1] &&  sorted(a,n+1); }

    public  static boolean  print(int[] a,int n){
        if(n==a.length){
            return true;
        }
        System.out.print(" "+a[n]);
        return print(a,n+1);
    }

    public  static boolean  find(int[] a,int n,int t){
        if(n==a.length){
            return false;
        }

        return a[n]==t|| find(a,n+1,t);
    }
    public  static int  findindex(int[] a,int n,int t){
        if(n==a.length){
            return  -1;
        }

     if(a[n]==t)
        {
            return n+1;
        }
     return findindex(a,n+1,t);
    }
    public  static int  findlastindex(int[] a,int n,int t){
        if(n==-1){
            return  -1;
        }

        if(a[n]==t) {
            return n+1;
        }else
        return findlastindex(a,n-1,t);
    }

   static ArrayList<Integer> list=new ArrayList<>();
    static void  findmore(int[] a,int i,int t){
        if(i==a.length){
            return  ;
        }

        if(a[i]==t) {
           list.add(i);
        }
             findmore(a,i+1,t);
    }

    static  ArrayList<Integer> findmore2(int[] a,int i,int t, ArrayList<Integer> l){

        if(i==a.length){
            return l;
        }

        if(a[i]==t) {
            l.add(i);
        }
      return (findmore2(a,i+1,t,l));
    }

    public   static  ArrayList<Integer> findwithoutlistindex(int[] a,int i,int t){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==a.length){
            return list;
        }
      if(a[i]==t){
          list.add(i);

      }
      ArrayList<Integer> answer=findwithoutlistindex(a,i+1,t);
      list.addAll(answer);
      return  list;
    }

    public  static int RBS(int a[],int t,int s,int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (a[m] == t) {
            return m;
        }
        if (a[s] <= a[m]) {
            if (t >= a[s] && t <= a[m]) {
                return RBS(a, t, s, m - 1);
            } else {
                return RBS(a, t, m + 1, e);
            }
        }
        else {
            if (t >= a[m] && t <= a[e]) {
                return RBS(a, t, m + 1, e);
            }

            return RBS(a, t, s, m - 1);


        }
    }
}
