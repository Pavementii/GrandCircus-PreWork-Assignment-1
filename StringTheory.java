package com.robinsondetroit;

public class StringTheory {

    String string1;
    String string2;


    public static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0) return false;
        }
        return true;
    }


    public boolean isValidInput(String string1, String string2) {
        if (string1.length() == string2.length()) {
            if (isInteger(string1) && isInteger(string2)) {
                return true;
            }
        }
        return false;
    }



    public boolean passesTest(String string1, String string2){
        int[] array = new int[string1.length()];

        String firstStringChar;
        String secondStringChar;

        int firstStringInt;
        int secondStringInt;

        for(int i = 0; i < string1.length(); i++){
            //convert character to string
            firstStringChar = Character.toString(string1.charAt(i));
            secondStringChar = Character.toString(string2.charAt(i));

            //convert string to int
            firstStringInt = Integer.parseInt(firstStringChar);
            secondStringInt = Integer.parseInt(secondStringChar);

            //add ints together and store in array
            array[i] = firstStringInt + secondStringInt;
            System.out.println("Digit "+ (i+1) +": " + array[i] );
        }

        //confirm that all summations are equal
        for(int i = 1; i < array.length; i++){
            if(! (array[0] == array[i])){
                System.out.println("\nAh, bummer. They totally don't.");
                return false;
            }
        }
        System.out.println("\nTa daaa! They do!");
        return true;

    }

}

