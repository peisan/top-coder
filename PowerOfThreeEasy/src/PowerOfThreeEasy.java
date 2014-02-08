import java.util.*;

public class PowerOfThreeEasy {
	public String ableToGet(int x, int y) {
        final String possible = "Possible";
        final String impossible = "Impossible";

        if(x == 0 && y == 0){
            return possible;
        }

        int k = 0;
        boolean result = check(k, x, y);
        if(result){
            return possible;
        }else{
            return impossible;
        }

	}

    private boolean check(int k, int x, int y){
        int units = (int)Math.pow(3, k);
        System.out.println(k + " / " + x + " / " + y + " / " + units);

        if(x < 0 || y < 0){
            return false;
        }

        if(x == 0 && y == 0){
            return true;
        }

        return check(k+1, x - units, y) || check(k+1, x, y - units);
    }
}
