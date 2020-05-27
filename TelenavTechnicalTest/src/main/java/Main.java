import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        TeTest cities = new TeTest();
        TeTestChild otherCities = new TeTestChild();

        cities.writeAlteredCitiesInFile(cities.oddCharsNumCities(),"src/main/txt-files/First Exercises.txt");
        cities.writeAlteredCitiesInFile(cities.evenCharsNumCities(),"src/main/txt-files/First Exercises.txt");
        cities.writeAlteredCitiesInFile(cities.cityDictionary(), "src/main/txt-files/First Exercises.txt");
        cities.writeAlteredCitiesInFile(otherCities.sortByLength(),"src/main/txt-files/Second Exercises.txt");
        cities.writeAlteredCitiesInFile(otherCities.removeDuplicateChars(), "src/main/txt-files/Second Exercises.txt");






    }
}
