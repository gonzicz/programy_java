import java.util.ArrayList;
import java.util.List;

public class ShowTextController {
    private String word;
    private List<String[][]> symbolList = new ArrayList<String[][]>();
    private String[] resultArray = new String[7];

    public ShowTextController(String word) {
        this.word = word;
        inicjalization();
    }

    static List<String[][]> ConversionOfAWordIntoAnArrayOfSymbols(String word) {  // zamiana słowa na tablicę symboli
        List<String[][]> symbolList = new ArrayList<String[][]>();
        Letters letters = new Letters();
        char[] actualArray = word.toCharArray();
        for (char symbol : actualArray) {
            symbolList.add(letters.list.get((int) symbol - 65));
        }
        return symbolList;
    }

    static String[] creatingAString(int height, List<String[][]> symbolList) {
        String lineOfTheGraphicText = "";
        String[] wynik = new String[7];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < symbolList.size(); j++) {
                lineOfTheGraphicText += addingAStringToTheExistingLineOfTheGraphicText(symbolList.get(j), i);
            }
            wynik[i] = lineOfTheGraphicText;
            lineOfTheGraphicText = "";
        }
        return wynik;
    }

    public static String addingAStringToTheExistingLineOfTheGraphicText(String[][] tab, int i) { // dodanie stringa do istniejącego wiersza napisu graficznego
        String result = "";
        for (int j = 0; j < tab[i].length; j++) {
            result += tab[i][j];
        }
        return result;
    }

    public String[] getResultArray() {
        return resultArray;
    }

    private void inicjalization() {
        symbolList = ConversionOfAWordIntoAnArrayOfSymbols(this.word);
        resultArray = creatingAString(7, symbolList);

    }

}
