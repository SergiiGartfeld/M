import javafx.scene.shape.Path;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.*;
import java.util.List;

public class CheckWords {

private final  String TEXT = "C:\\Users\\sergi\\IdeaProjects\\qwert2\\Anagram\\src\\main\\java\\slowa2.txt";

    public List<String> wczytPlik() throws Exception {
        List<String> listWords = new ArrayList<String>();
        Set<String> setWords = new HashSet<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(TEXT));
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    setWords.add(line);
                }
            }
            bufferedReader.close();
            listWords.addAll(setWords);
        } catch (Exception e) {
            System.out.println("Error open file");
        }
        return listWords;
    }


    public List<String> listDod(List<String> stringLit) {
        Date start = new Date();
        String c = "Wyszukiwanie anagramów ";

        long total = 0;

        List<String> stringL = new ArrayList<String>();


        for (int x = 0; x < stringLit.size(); x++) {
            for (int y = x + 1; y < stringLit.size(); y++) {

                String c1 = stringLit.get(x).toString();
                String c2 = stringLit.get(y).toString();

                total++;

                if (cheWord(c1, c2)) {
                    if ((x % 20 == 0)) {
                        System.out.print(".");
                    }
                    stringL.add(c1 + "-" + c2);
                }
            }
        }
        Date stop = new Date();
        long result = (stop.getTime() - start.getTime()) / 1000;
        System.out.println("Zajęło: " + result + " sekund. " + "Liczba Wykonanych porównań: " + total);

        return stringL;

    }


    public boolean cheWord(String s1, String s2) {
        String ps1 = s1.toLowerCase();
        String ps2 = s2.toLowerCase();

        char[] p1 = ps1.toCharArray();
        char[] p2 = ps2.toCharArray();

        Arrays.sort(p1);
        Arrays.sort(p2);

        String f1 = new String(p1);
        String f2 = new String(p2);


        return f1.equals(f2);
    }
}
