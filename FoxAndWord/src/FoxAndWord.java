import java.util.*;

public class FoxAndWord {
    public int howManyPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                String word1 = words[i];
                String word2 = words[j];

                if(word1.length() != word2.length()){
                    continue;
                }

                for (int index = 1; index < word1.length(); index++) {
                    String word1_pre = word1.substring(0, index);
                    String word2_suf = word2.substring(word2.length() - index, word2.length());
                    if (word1_pre.equals(word2_suf)) {
                        String word1_suf = word1.substring(index, word1.length());
                        String word2_pre = word2.substring(0, word2.length() - index);
                        if (word1_suf.equals(word2_pre)) {
                            count++;
                            break;
                        }

                    }
                }
            }
        }
        return count;
    }
}
