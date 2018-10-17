package task2;

public class Palindrom {
    //Searches for the closest palindrome
    public static int nearPalindromForNumber(int number) {
        while (!getPalindrom(number)) {
            number++;
        }
        return number;
    }

    //Checks whether the number is palindrome
    public static boolean getPalindrom(int a) {

        String s = String.valueOf(a);
        if (s.length() == 1 || s.charAt(0) == '-') {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
