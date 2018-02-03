package Chapter1;

import org.junit.Test;

public class Problem1_5 {

    /*
    One Away:
    There are three types of edits that can be preformed on strings:
    Insert a Character, Remove a Character, Replace a Character.
    Given two strings, write a function to check if they are
    one edit (or zero edits) away.

     */

    @Test
    public void problem() throws Exception {

        String a = "pales";
        String b = "pale";

        if (a.length() - b.length() > Math.abs(1)){ System.out.println("False"); throw new Exception(); }

        if (a.length() == b.length()) { //Replace
            int offBy = 0;
            for (int i =0; i < a.length(); i++){
                if (a.charAt(i) != b.charAt(i)){
                    offBy ++;
                }
                if (offBy > 1) { System.out.println("False"); throw new Exception(); }
            }
        } else if (a.length() < b.length()){ // add || Remove
            checkOff(a,b);
        } else { // add || Remove
            checkOff(b,a);
        }

        System.out.println("True");
    }

    private void checkOff(String smaller, String larger) throws Exception {
        int offBy = 0;
        for (int i =0; i < smaller.length(); i++){
            if (smaller.charAt(i) != larger.charAt(i + offBy)){
                offBy ++;
            }
            if (offBy > 1) { System.out.println("False"); throw new Exception(); }
        }

    }


}
