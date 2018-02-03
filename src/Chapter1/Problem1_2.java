package Chapter1;

import org.junit.Test;

public class Problem1_2 {

    /*
    Check Permutation:
    Given two strings, write a method to decide if one is a permutation of the other
     */

    @Test
    public void problem() {
        boolean isPerm;

        String a = "abdefgd";
        String b = "abcdefg";

        if (a.length() == b.length()) {
            isPerm = a.equals(b);
        } else if (a.length() > b.length()) {
            isPerm = a.contains(b);
        } else {
            isPerm = b.contains(a);
        }

        if (isPerm) {
            System.out.println("One string is a permutation of the other");
        } else {
            System.out.println("One string is not a permutation of the other");
        }
    }


}
