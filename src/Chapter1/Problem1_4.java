package Chapter1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1_4 {

    /*
    Palindrome Permutation:
    Given a string, write a function to check if it is a permutation of a palindrome.
    The palindrome does not need to be limited to just dictionary words.
     */

    @Test
    public void problem() throws Exception {
        String input = "aba";
        input = input.replace(" ", "");
        input = input.toLowerCase();

        Map<Character, Integer> trackMap = new HashMap<>();

        for(int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);

            if (trackMap.containsKey(c)){
                trackMap.replace(c, trackMap.get(c) + 1);
            } else {
                trackMap.put(c, 1);
            }
        }

        Character mid = null;
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Character, Integer> e: trackMap.entrySet()) {
            Character eKey = e.getKey();
            Integer eVal = e.getValue();

            if (eVal%2 != 0) {
                if (mid == null){
                    mid = eKey;
                    eVal --;
                } else {
                    throw new Exception();
                }
            }

            for (int i = 0; i < eVal; i+=2) {
                builder.append(eKey);
            }
        }

        List<StringBuilder> perms = new ArrayList<>();
        permutations("", builder.toString(), perms);

        for (StringBuilder sb: perms) {
            if (mid != null) {
                System.out.println(sb.toString() + mid + sb.reverse().toString());
            } else {
                System.out.println(sb.toString() + sb.reverse().toString());
            }
        }
    }

    private void permutations(String prefix, String str, List<StringBuilder> result) {
        int length = str.length();

        if (length == 0) {
            result.add(new StringBuilder(prefix));
        } else {
            for (int i = 0; i<length; i++){
                permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, length), result);
            }
        }
    }

}
