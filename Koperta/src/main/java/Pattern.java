/*
    Zaimplementuj metodę prepareSquareWithDiagonals, która zwróci w zmiennej typu String narysowany kwadrat wraz z
    przekątnymi, zgodnie z podanym rozmiarem i znakiem do rysowania.
    Przykład dla sign ='@' i size = 5

    @ @ @ @ @
    @ @   @ @
    @   @   @
    @ @   @ @
    @ @ @ @ @
 */
public class Pattern {
    public String prepareSquareWithDiagonals(char sign, int size) {
        String pattern = "";
        // pętla iterująca po wierszach
        for (int i = 0; i < size; i++) {
            // pętle iterująca po komórkach
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {                            // krawędzie górna dolna
                    if (j != size - 1) {                                  // wszystkie komórki poza ostatnią
                        pattern = pattern + sign + " ";
                    } else {
                        pattern = pattern + sign + "\n";                  // ostatnia komórka
                    }
                } else if (i != 0) {                                      // środek
                    if (j == 0) {                                         // krawędź boczna lewa
                        pattern = pattern + sign + " ";
                    } else if (i == j || i == size - j - 1) {             // przekątne
                        pattern = pattern + sign + " ";
                    } else if (j == 0 && i == size - 1 || j == size - 1) { // krawędz boczna prawa
                        pattern = pattern + sign + "\n";
                    } else {                                               // wypełnienie puste
                        pattern = pattern + "  ";
                    }
                }
            }
        }
        System.out.println(pattern);
        return pattern;
    }

    public static void main(String[] args) {
        new Pattern().prepareSquareWithDiagonals('#', 7);
    }
}
