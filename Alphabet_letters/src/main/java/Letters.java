import java.util.ArrayList;
import java.util.List;

public class Letters {
    Letters(){
        AddToList();
    }
    List<String[][]> list = new ArrayList<String[][]>();
    String[][] tabA = {{"  ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "x ", "x ", "x ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}};
    String[][] tabB = {{"x ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "x ", "x ", "x ", "   "}};
    String[][] tabC = {{"  ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"  ", "x ", "x ", "x ", "   "}};
    String[][] tabD = {{"x ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "  ", "  ", "  ", "x  "}, {"x ", "x ", "x ", "x ", "   "}};
    String[][] tabE = {{"x ", "x ", "x ", "x ", "x  "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "x ", "x ", "x ", "   "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "  ", "  ", "  ", "   "}, {"x ", "x ", "x ", "x ", "x  "}};
//        String[][] tabF
//        String[][] tabG
//        String[][] tabH
//        String[][] tabI
//        String[][] tabJ
//        String[][] tabK
//        String[][] tabL
//        String[][] tabM
//        String[][] tabN
//        String[][] tabO
//        String[][] tabP
//        String[][] tabQ
//        String[][] tabR
//        String[][] tabS
//        String[][] tabT
//        String[][] tabU
//        String[][] tabV
//        String[][] tabW
//        String[][] tabX
//        String[][] tabY
//        String[][] tabZ
    void AddToList(){
        list.add(tabA);
        list.add(tabB);
        list.add(tabC);
        list.add(tabD);
        list.add(tabE);
    }

}
