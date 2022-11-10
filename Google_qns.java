import java.util.ArrayList;

public class Google_qns {
    public static void main(String[] args) {
        String up = "12";//initial string
        String p = " ";//final answer string
        telephone(p, up);
        System.out.println(Arraylisttelephone(p, up));
        System.out.println(counttelephone(p, up));
        dice(" ",4);
    }

    private static void dice(String p, int target) {
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 &&i<=target;i++)
        {
           dice(p+i,target-i);
        }

    }


    private static int counttelephone(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return 1;
        }int count=0;
        int h = up.charAt(0) - '0';
        for (int i = (h - 1) * 3; i < h * 3; i++) {
            char ch = (char) ('a' + i);
           count+=counttelephone(p + ch, up.substring(1));

        }
        return count;
    }

    public static void telephone(String p, String up) {
      if(up.isEmpty()){
          System.out.println(p);
          return;
      }
      int digit=up.charAt(0)-'0';
      for(int i=(digit-1)*3;i<digit*3;i++){
          char c=(char)('a'+i);
          telephone(p+c,up.substring(1));

      }
    }

    public static ArrayList<String> Arraylisttelephone(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int h = up.charAt(0) - '0';
        for (int i = (h - 1) * 3; i < h * 3; i++) {
            char ch = (char) ('a' + i);
            telephone(p + ch, up.substring(1));
            list.addAll(Arraylisttelephone(p + ch, up.substring(1)));
        }
        return list;
    }
}
