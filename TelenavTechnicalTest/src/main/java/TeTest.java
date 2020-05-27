import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeTest {

    private String[] cities = {"Paris", "Cluj-Napoca", "Timisoara", "Berlin", "Madrid", "Londra", "Barcelona", "Venetia", "Viena", "Iasi"};

    public List<String> oddCharsNumCities() {
        List<String> oddCities = new ArrayList<>();
        String cityName;
        int cityNameLength;
        int counter = 0;

        for (String city : cities) {
            cityNameLength = city.length();
            cityName = city;
            if (cityNameLength % 2 == 1) {
                oddCities.add(counter, cityName);
                counter++;
            }
        }
        return oddCities;
    }


    public List<String> evenCharsNumCities() {
        List<String> evenCities = new ArrayList<>();
        String cityName;
        int cityNameLength;
        int counter = 0;

        for (String city : cities) {
            cityNameLength = city.length();
            cityName = city;
            if (cityNameLength % 2 == 0) {
                evenCities.add(counter, cityName);
                counter++;
            }
        }
        return evenCities;
    }


    public HashMap<String, List> cityDictionary() {
        HashMap<String, List> dictionary = new HashMap<>();
        dictionary.put("oddCities", oddCharsNumCities());
        dictionary.put("evenCities", evenCharsNumCities());
        return dictionary;
    }


    public void writeAlteredCitiesInFile(Object objToWrite, String path) throws IOException {
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path,true));
        buffWriter.write(objToWrite.toString() + '\n');
        buffWriter.close();
    }


    public String[] getCities() {
        return cities;
    }
}


