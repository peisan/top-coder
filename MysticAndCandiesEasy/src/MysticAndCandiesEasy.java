import java.util.*;

public class MysticAndCandiesEasy {
	public int minBoxes(int C, int X, int[] high) {
        Arrays.sort(high);
        int sum_of_high = 0;
        for(int i = 0; i < high.length; i++){
            sum_of_high += high[i];
        }
        int num_of_empty = sum_of_high - C;

        int possible_max = 0;
        for (int i = 1; i <= high.length; i++){
            possible_max += high[high.length - i];
            if(num_of_empty + X <= possible_max){
                return i;
            }
        }
        return 0;
	}
}
