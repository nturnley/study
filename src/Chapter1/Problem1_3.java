package Chapter1;

import org.junit.Test;

public class Problem1_3 {

    /*
    URLify:
    Write a method to replace all spaces in a string with %20.
    you may assume that the string has sufficient space at the
    end to hold the additional characters, and that you are given
    the "true" length of the string.
     */

    @Test
    public void problem() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        Character[] inputArray = new Character[] {'a', 'b', ' ', 'c', ' '};
        int inputLength = 5;

        if (inputArray.length < inputLength) {
            throw new Exception();
        }

        for (int i = 0; i < inputLength; i++){
            UrlChar urlChar = UrlChar.search(inputArray[i]);

            if (urlChar != null) {
                stringBuilder.append(urlChar.getOutput());
            } else {
                stringBuilder.append(inputArray[i]);
            }
        }
        System.out.println("Output: " + stringBuilder.toString());
    }

    protected  enum UrlChar {
        space(' ', "%20");

        private Character input;
        private String output;

        UrlChar(Character input, String output){
            this.input = input;
            this.output = output;
        }

        public String getOutput() {
            return output;
        }

        static UrlChar search(Character input){
            for (UrlChar urlChar : UrlChar.class.getEnumConstants()) {
                if (urlChar.input.equals(input)) { return urlChar; }
            }
            return null;
        }

    }


}
