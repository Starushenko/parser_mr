
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String exitCmd = "exit";
    private static final String PATH = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        BookParser bookParser = new BookParser();
        Scanner scanner = new Scanner(System.in);
        BookStatSerialize bookStatSerialize = new BookStatSerialize();
        System.out.println("Press any key or enter exit for EXIT");



        while (!scanner.next().equals(exitCmd)) {
            System.out.println("Please enter the book");
            File book = new File(PATH + scanner.next());
            List<String> words = bookParser.getText(book);
            List<String> topWords = bookParser.topWords(words, 3);
            int uniqWords = bookParser.uniqWords(words);
            BookStatistic bookStatistic = new BookStatistic(topWords, uniqWords);
            System.out.println(bookStatistic);
            bookStatSerialize.serialize(bookStatistic, new File(PATH + "statistic_of_"+ book.getName()));
            System.out.println("Press " + exitCmd + " to exit");

        }

        scanner.close();


    }

}