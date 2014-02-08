import java.util.*;

public class MiddleCode {
    public String encode(String s) {
        String t = "";
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) {
            //even
            if (sb.length() % 2 == 0) {
                int middle1 = sb.length() / 2 - 1;
                int middle2 = sb.length() / 2;

                if (sb.charAt(middle1) < sb.charAt(middle2)) {
                    t += sb.charAt(middle1);
                    sb.deleteCharAt(middle1);
                } else {
                    t += sb.charAt(middle2);
                    sb.deleteCharAt(middle2);
                }
                //odd
            } else {
                int middle = sb.length() / 2;
                t += sb.charAt(middle);
                sb.deleteCharAt(middle);
            }
        }
        return t;
    }
}
