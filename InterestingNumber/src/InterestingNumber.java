import java.util.*;

public class InterestingNumber {

    public String isInteresting(String x) {
        boolean[] skip = new boolean[x.length()];
        for (int i = 0; i < x.length(); i++) {

            if (skip[i]) {
                continue;
            }

            int count = 0;
            boolean interesting = false;
            for (int j = i + 1; j < x.length(); j++) {
                if (x.charAt(j) == x.charAt(i)) {
                    if (count == Integer.parseInt("" + x.charAt(i))) {
                        interesting = true;
                        skip[j] = true;
                    }else{
                        interesting = false;
                        break;
                    }
                }
                count++;
            }

            if (interesting != true) {
                return "Not interesting";
            }

        }

        return "Interesting";
    }
}
