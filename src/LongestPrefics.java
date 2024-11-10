import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestPrefics {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] charArray = strs[0].toCharArray();
        List<Character> prefs = new ArrayList<Character>();
        for (char c : charArray) {
            prefs.add(c);
        }
        for(int i = 0; i< strs.length; i++){
            for(int k = 0; k<Math.min(prefs.size(), strs[i].length()) ; k++){
                if(prefs.get(k) != strs[i].charAt(k)){
                    int s = prefs.size();
                    for(int j = k; j<s; j++){
                        prefs.remove(k);
                    }



                }

            }
        }
        StringBuilder result = new StringBuilder();
        for (Character c : prefs) {
            result.append(c);
        }
        return result.toString();


    }

    public static void main(String[] args) {
        String[] b = {"a"};
        LongestPrefics pr = new LongestPrefics();
        System.out.print(pr.longestCommonPrefix(b));
    }
}
