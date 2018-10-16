package task1;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class YAMLExample {
    public static void main(String[] args) throws IOException {
        Integer[] array = {1, 1, 2, 3, 5, 5, 3, 4, 4, 6};

        writeFile(array);

        Integer[] arrayYAML = readFromFile("task1.yml");

        uniqueDigits(arrayYAML);

    }

    public static void writeFile(Integer[] array) throws IOException {
        Yaml yaml = new Yaml();
        FileWriter fileWriter = new FileWriter("task1.yml");
        yaml.dump(array, fileWriter);
        fileWriter.close();
    }

    public static Integer[] readFromFile(String file) throws IOException {
        List<Integer> list;
        Yaml yaml = new Yaml();
        FileReader fileReader = new FileReader(file);
        list = yaml.load(fileReader);
        Integer[] array = list.toArray(new Integer[list.size()]);
        fileReader.close();
        return array;
    }

    public static void uniqueDigits(Integer[] arrayYAML) {
        Arrays.sort(arrayYAML);
        for (int i = 0; i < arrayYAML.length; i++) {
            if (i < arrayYAML.length - 1 && arrayYAML[i] == arrayYAML[i + 1])
                i++;
            else
                System.out.print(arrayYAML[i] + " ");
        }
    }
}