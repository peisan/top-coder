import java.util.*;

public class PackingBallsDiv2 {
    public int minPacks(int R, int G, int B) {
        int count = 0;

        int min = 0;
        if (R <= G && R <= B) {
            min = R;
        } else if (G <= B) {
            min = G;
        } else {
            min = B;
        }

        count = min;
        R = R - min;
        G = G - min;
        B = B - min;

        if (R >= 3) {
            count = count + (R / 3);
            R = R % 3;
        }

        if (G >= 3) {
            count = count + (G / 3);
            G = G % 3;
        }

        if (B >= 3) {
            count = count + (B / 3);
            B = B % 3;
        }


        if (R == 2) {
            count++;
            R = 0;
        }

        if (G == 2) {
            count++;
            G = 0;
        }

        if (B == 2) {
            count++;
            B = 0;
        }

        if(R == 1 || G == 1 || B == 1){
            count ++;
        }

        return count;
    }
}
