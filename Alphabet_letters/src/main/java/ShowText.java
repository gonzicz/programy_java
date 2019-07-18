/**
 * Przygotuj aplikację konsolową wyświetlając litery alfabetu w formie graficznej na podstawie wprowadzonego przez
 * użytkownika tekstu. Przykładowo jeśli użytkownik wpisze imię Jan na konsoli powinien wyświetlić się napis

     *   ***   *    *
     *  *   *  * *  *
     *  * * *  *  * *
 *   *  *   *  *   **
  * *   *   *  *    *

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowText {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String word = input.nextLine().toUpperCase();
        int HEIGHT_OF_THE_WORD = 7;
        String[] resultArray = new String[HEIGHT_OF_THE_WORD];

        List<String[][]> symbolList = ConversionOfAWordIntoAnArrayOfSymbols(word);
        resultArray= creatingAString(HEIGHT_OF_THE_WORD,symbolList);

        for (String wiersz : resultArray) {
            System.out.println(wiersz);
        }
    }

    public static String addingAStringToTheExistingLineOfTheGraphicText(String[][] tab, int i) { // dodanie stringa do istniejącego wiersza napisu graficznego
        String result ="";
        for (int j = 0; j < tab[i].length; j++) {
            result += tab[i][j];
        }
        return result;
    }

    static List<String[][]>  ConversionOfAWordIntoAnArrayOfSymbols( String word){  // zamiana słowa na tablicę symboli
        List<String[][]> symbolList = new ArrayList<String[][]>();
        Letters letters = new Letters();
        char[] actualArray = word.toCharArray();
        for (char symbol : actualArray) {
            symbolList.add(letters.list.get((int) symbol - 65));
        }
        return symbolList;
    }

    static String [] creatingAString (int height, List<String[][]> symbolList){
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
}
