import java.util.ArrayList;
import java.util.LinkedList;

public class Hashing {
    public static void main(String[] args) {

        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        Linerprobinginsert(45,arr,0);
//        linearprobingdelete(20,arr);
        Linerprobinginsert(23,arr,0);
        Linerprobinginsert(15,arr,0);
        Linerprobinginsert(20,arr,0);

        System.out.println("searching ");
       Linerprobingsearch(85,arr);

    }

    private static void linearprobingdelete(int key, int[] arr) {
        int i=key%5;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                //deleted position we make it as -2
            }
            i=(i+1)%5;
        }
        if(i==5){
            System.out.println("array is full");
        }
        System.out.println("deledt aray updated values");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    private static void Linerprobingsearch(int hash,int[] arr) {
        int h=hash%5;
        int i=h;

        while(arr[i]!=-1)  //not empty then goes inside the loop
        {
            if (arr[i] == hash) {
                System.out.println("found at index : " + i);
            } else {
                i = (i + 1) % 5;
                if (i == 5) {
                    System.out.println(" full not found ");
                }

            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);

            }
        }


    private static void Linerprobinginsert(int key,int[] arr,int size) {
        int i=key%5; //i means modulo value

        //if collison occured we need to go to next slot

        while(arr[i]!=-1 &&arr[i]!=-2 && arr[i]!=key){
            i=(i+1)%5;
            //if not empty not deleted not equal to key then only we add i value
        }
        if(arr[i]==key){
            System.out.println("already inserted");
        }
        else{
            arr[i]=key;
            size++;
            System.out.println("inserted");
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static void arraylistmethod () {
            ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
            for (int i = 0; i < 5; i++) {
                list.add(new LinkedList<Integer>());
            }

            int i = 70 % 5;
            int ia = 60 % 5;
            int im = 71 % 5;
            int imm = 72 % 5;


            list.get(ia).add(60);
            list.get(im).add(71);
            list.get(imm).add(72);

            list.get(ia).remove(60);

            System.out.println(list);

        }

    }

