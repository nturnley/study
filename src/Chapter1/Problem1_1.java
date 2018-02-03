package Chapter1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Problem1_1 {

    /*
    Is Unique:
    Implement an algorithm to determine if a string has all unique characters.
     */

    @Test
    public void problem() {
        String input = "abcdefg";
        Set<Character> set = new HashSet<>();
        boolean unique = true;

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (!set.contains(c)){
                set.add(c);
            } else {
                unique = false; break;
            }
        }

        if (!unique) {
            System.out.println("String is non-unique.");
        } else {
            System.out.println("String is unique.");
        }

    }



}
