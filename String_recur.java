import java.util.ArrayList;

public class String_recur {
    public static void main(String[] args) {
//
//        skipletter("","aamehnaazd");
//        skipm("","aammmehnaazd");
//
//        System.out.println(skipword("yesapplemehnaaztabu"));
//        System.out.println(skipwordnot("yesapplmehnaaztabu"));
//      sequencesum("abcd"," ");
        System.out.println(seqwitharraylistreturn("abc"," "));
//        char c='a';
//        System.out.println(c+1);
        System.out.println(seqwitharraylistreturn1("abc"," "));

    }

    private static ArrayList seqwitharraylistreturn(String up, String p) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=seqwitharraylistreturn(up.substring(1),p);
        ArrayList<String>right=seqwitharraylistreturn(up.substring(1),p+ch);

        left.addAll(right);
        return left;

    }
    private static ArrayList seqwitharraylistreturn1(String up, String p) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>fist=seqwitharraylistreturn1(up.substring(1),p);
        ArrayList<String>sec=seqwitharraylistreturn1(up.substring(1),p+ch);
        ArrayList<String>thi=seqwitharraylistreturn1(up.substring(1),p+(ch+0));

       fist.addAll(sec);
       fist.addAll(thi);
        return fist;

    }


    private static void sequencesum(String up,String p) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);


        sequencesum(up.substring(1),p+ch); //adding 1st charceter
        sequencesum(up.substring(1),p); //ignoring 1st character

    }

    private static String skipwordnot(String s2) {
        if(s2.isEmpty()){
            return " ";
        }
        if(!s2.startsWith("apple")&&s2.startsWith("app")){
            return skipword(s2.substring(3));
        }
        else
            return s2.charAt(0)+skipwordnot(s2.substring(1));

    }

    static void skipletter(String empty,String s){
        if(s.isEmpty()){
            System.out.println(empty);
            return;
        }
       char c=s.charAt(0);
            if(c =='a'){
               skipletter(empty,s.substring(1));
        }
            else {
                skipletter( empty+c, s.substring(1));
            }


    }

    public static void skipm(String empty,String s1){
        if(s1.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch=s1.charAt(0);
        if(ch=='m'){
            skipm(empty, s1.substring(1));
        }
        else{
            skipm(empty+ch, s1.substring(1));
        }

    }
     static String skipword(String s1) {
        if (s1.isEmpty()) {

            return " ";
        }

        if (s1.startsWith("apple")) {
           return skipword(s1.substring(5));
        }else
            return s1.charAt(0) + skipword(s1.substring(1));

    }



}
