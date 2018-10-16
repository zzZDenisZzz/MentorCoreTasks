package task3;

public class Main {
    public static void main(String[] args) {
        String[] array = {"five", "fivetwo", "fourfive", "fourfivetwo",
                "one", "onefiveone", "two", "twofivefourone"};

        int lengthWord = array[0].length();
        int indexWord = 0;

        for (int i = 0; i < array.length; i++)
            if (lengthWord < array[i].length()) {
                lengthWord = array[i].length();
                indexWord = i;
            }

        System.out.println("Длинное слово: " + array[indexWord] + ", (" + lengthWord + ") символов.");
    }
}
