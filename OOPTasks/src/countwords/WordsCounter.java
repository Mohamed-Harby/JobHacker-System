package OOPTasks.src.countwords;

import java.io.*;
import java.util.Scanner;

public class WordsCounter {

    public static int countWords(InputStream inputStream) {
        int wordsCount = 0; // default value
        try (Scanner scanner = new Scanner(inputStream)) { // try-with-resources (closeable classes)
            while (scanner.hasNext()) {
                wordsCount++;
                scanner.next();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return wordsCount;
    }

    public static void main(String[] args) {

        final String parentPath = "./OOPTasks/src/countwords/";

        try (FileInputStream in = new FileInputStream(parentPath + "Lincoln.txt")) {
            int wordsCount = countWords(in);
            System.out.println(wordsCount);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
