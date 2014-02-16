import java.util.*;

public class VocaloidsAndSongs {

    long cache[][][][];
    final long MOD = 1000000007L;

    public int count(int S, int gumi, int ia, int mayu) {

        cache = new long[S + 1][gumi + 1][ia + 1][mayu + 1];

        for (int s = 0; s <= S; s++) {
            for (int g = 0; g <= gumi; g++) {
                for (int i = 0; i <= ia; i++) {
                    for (int m = 0; m <= mayu; m++) {
                        cache[s][g][i][m] = -1L;
                    }
                }
            }
        }
        return (int) dp(S, gumi, ia, mayu);
    }

    private long dp(int s, int g, int i, int m) {

        if (s > (g + i + m)) {
            return 0;
        }

        if (s == 0) {
            if (g == 0 && i == 0 && m == 0) {
                return 1L;
            } else {
                return 0L;
            }
        }

        if (g < 0 || i < 0 || m < 0) {
            return 0L;
        }

        if (cache[s][g][i][m] == -1L) {
            cache[s][g][i][m] = dp(s - 1, g - 1, i, m) +
                    dp(s - 1, g, i - 1, m) +
                    dp(s - 1, g, i, m - 1) +
                    dp(s - 1, g - 1, i - 1, m) +
                    dp(s - 1, g - 1, i, m - 1) +
                    dp(s - 1, g, i - 1, m - 1) +
                    dp(s - 1, g - 1, i - 1, m - 1);

        }

        return cache[s][g][i][m] % MOD;
    }

}
