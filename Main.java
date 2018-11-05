import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CheckWords z = new CheckWords();
        List<String> wordsList = new ArrayList<String>();
        List<String> listAnagrams = new ArrayList<String>();

        wordsList = z.wczytPlik();
        if (wordsList.size() == 0){
            System.out.println("Words not found");
        } else {
            System.out.println(String.format("Save %,d words.", wordsList.size()));

            listAnagrams = z.listDod(wordsList);

            System.out.println(String.format("Znaleziono %,d anagrams.", listAnagrams.size()));


            for (String s : listAnagrams) {
                System.out.println(s);
            }
        }
    }
}
