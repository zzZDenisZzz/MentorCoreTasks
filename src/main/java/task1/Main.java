package task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Integer[] array = {1, 1, 2, 3, 5, 5, 3, 4, 4, 6};

        YAMLExample yamlExample = new YAMLExample();
        yamlExample.saveToFile(array);
        Integer[] arrayYAML = yamlExample.readFromFile("task1.yml");
        yamlExample.uniqueDigits(arrayYAML);
    }
}
