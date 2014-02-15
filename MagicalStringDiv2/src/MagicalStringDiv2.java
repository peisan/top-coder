import java.util.*;

public class MagicalStringDiv2 {
	public int minimalMoves(String S) {
        int length = S.length();
        int changeCount = 0;
        for (int i = 0; i < length / 2; i++){
            if(S.charAt(i) == '<'){
                changeCount++;
            }
        }

        for (int i = length / 2; i < length; i++){
            if(S.charAt(i) == '>'){
                changeCount++;
            }
        }
		return changeCount;
	}
}
