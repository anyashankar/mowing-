//Anya Shankar
//period 2

import java.util.*;

public class mowing {

    public static void main(String[] args) {
        String b = "mississippi";
        System.out.println(Reverse(b));
        System.out.println(removeDuplicates(b));
    }

    public static String Reverse(String a) {
        String d = "", e = "";
        for (int i = a.length(); i >= 1; i--) {
            d = a.substring(i - 1, i);
            e = e + d;
        }
        return e;
    }

    public static String removeDuplicates(String a)
    {
        int c = a.length(); String d = ""; String e = "";
        for (int i = 0; i < c; i++){
            if (i == 0){
                d = a.substring(i, i + 1);
            }
            else {
                e = a.substring(i, i + 1);
                if ((d.indexOf(e)) == -1) {
                    d += e;
                }
            }
        }
        return d;
    }
}



