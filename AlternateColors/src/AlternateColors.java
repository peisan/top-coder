import java.util.*;

public class AlternateColors {
    public String getColor(long r, long g, long b, long k) {

        Long[] rgb = {r, g, b};
        Arrays.sort(rgb);

        if (k <= rgb[0] * 3) {
            if (k % 3 == 1) {
                return "RED";
            } else if (k % 3 == 2) {
                return "GREEN";
            } else if (k % 3 == 0) {
                return "BLUE";
            }
        }

        if (k <= rgb[0] * 3 + (rgb[1] - rgb[0]) * 2) {
            k = k - rgb[0];
            r = r - rgb[0];
            g = g - rgb[0];
            b = b - rgb[0];

            if (k % 2 == 1) {
                if (r > 0) {
                    return "RED";
                } else if (g > 0) {
                    return "GREEN";
                } else {
                    return "BLUE";
                }

            } else if (k % 2 == 0) {
                if (b > 0) {
                    return "BLUE";
                } else if (g > 0) {
                    return "GREEN";
                } else {
                    return "RED";
                }
            }
        }


        k = k - rgb[1];
        r = r - rgb[1];
        g = g - rgb[1];
        b = b - rgb[1];

        if (r > 0) {
            return "RED";
        } else if (g > 0) {
            return "GREEN";
        } else {
            return "BLUE";
        }
    }
}
