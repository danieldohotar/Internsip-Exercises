import java.util.Arrays;
import java.util.List;

public class TeTestChild extends TeTest {

    public List<String> sortByLength() {

        String[] sortedArrayBasedOnCharNum = getCities();
        List<String> sortedArrCharLengthList;
        String temp;
        for (int i = 0; i < getCities().length; i++) {
            for (int j = i + 1; j < getCities().length; j++) {
                if (getCities()[i].length() > getCities()[j].length()) {
                    temp = getCities()[i];
                    getCities()[i] = getCities()[j];
                    getCities()[j] = temp;
                }
            }
        }
        sortedArrCharLengthList = Arrays.asList(sortedArrayBasedOnCharNum);
        return sortedArrCharLengthList;
    }

    public List<String> removeDuplicateChars() {

        int counter = 0;
        String city;
        char[] cityChars;
        StringBuilder sb = new StringBuilder();
        String[] citiesWithRemovedDupli;
        List<String> NoDupliArrList;
        for (int i = 0; i < getCities().length; i++) {
            city = getCities()[i];
            cityChars = city.toCharArray();
            for (int k = 0; k < cityChars.length; k++) {
                int j;
                for (j = 0; j < cityChars.length; j++) {
                    if (cityChars[k] == cityChars[j]) {
                        break;
                    }
                }
                if (j == k) {
                    sb.append(cityChars[k]);
                }
            }
            sb.append(",");
        }
        citiesWithRemovedDupli = sb.toString().split(",");
        NoDupliArrList = Arrays.asList(citiesWithRemovedDupli);
        return NoDupliArrList;
    }
}








