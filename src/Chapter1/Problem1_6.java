package Chapter1;

import org.junit.Test;

public class Problem1_6 {

    /*
    String Compression:
    Implement a method to preform basic string compression
    using the counts of repeated characters. If the compressed
    string would not become smaller than the original then your
    method should return the original string. You can assume the
    string has only uppercase and lowercase letters (a-z).
     */

    @Test
    public void problem() throws Exception {

        String input = "aabccccaa";
        if (input == null) { throw new Exception(); }

        if (input.length() == 0 || input.length() == 1) {
            System.out.println(input);
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        Character c = input.charAt(0);
        for (int i=1; i < input.length();i++){
            if (c.equals(input.charAt(i))){
                count ++;
            } else {
                stringBuilder.append(String.valueOf(c));
                stringBuilder.append(String.valueOf(count));
                count = 1;
                c = input.charAt(i);
            }
        }

        stringBuilder.append(String.valueOf(c));
        stringBuilder.append(String.valueOf(count));

        if (stringBuilder.length() >= input.length()){
            System.out.println(input);
        } else {
            System.out.println(stringBuilder.toString());
        }


    }


}
