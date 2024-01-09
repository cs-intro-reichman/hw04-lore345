public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            char toCheck = lowerCase(string.charAt(i));
            if (toCheck == 'i' || toCheck == 'e' || toCheck == 'o' || toCheck == 'u' || toCheck == 'a') {
                char newChar = upperCase(string.charAt(i));
                res += newChar;
            } else {
                char newChar = lowerCase(string.charAt(i));
                res += newChar;
            }
        }
        return res;
    }

    public static boolean isCapitalLetter(char c) {
        // Compare ASCII values to check if the character is an uppercase letter
        return c >= 'A' && c <= 'Z';
    }

    public static char upperCase(char s) {
        // Check if the character is a lowercase letter before converting
        if (s >= 'a' && s <= 'z') {
            return (char) (s - 'a' + 'A');
        } else {
            return s; // Return unchanged for non-alphabetic characters
        }
    }

    public static char lowerCase(char s) {
        // Check if the character is an uppercase letter before converting
        if (s >= 'A' && s <= 'Z') {
            return (char) (s - 'A' + 'a');
        } else {
            return s; // Return unchanged for non-alphabetic characters
        }
    }

    public static String camelCase(String string) {
        boolean isCapitalLetter = false;
        boolean isFirst = false;
        String res = "";

        for (int i = 0; i < string.length(); i++) {
            if (!isFirst && string.charAt(i) != ' ') {
                res += lowerCase(string.charAt(i));
                isFirst = true;
                isCapitalLetter = false;
                continue;
            }
            if (isCapitalLetter && string.charAt(i) != ' ') {
                res += upperCase(string.charAt(i));
                isCapitalLetter = false;
            } else if (string.charAt(i) != ' ' && !isCapitalLetter) {

                res += lowerCase(string.charAt(i));

            }
            if (string.charAt(i) == ' ') {

                isCapitalLetter = true;
            }


        }
        return res;


    }

    public static int[] allIndexOf(String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }

        }
        int[] arr = new int[count];
        int idx=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[idx] = i;
                idx++;
            }

        }
        return arr;

    }
}
