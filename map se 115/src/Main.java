import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String filename = args.length == 1 ? args[0] : getInputFileName();

            Scanner fileScanner = new Scanner(new java.io.File(filename));

            int cityCount = Integer.parseInt(fileScanner.nextLine());
            CountryMap map = new CountryMap(cityCount);

            String[] cityNames = fileScanner.nextLine().split(" ");
            for (String name : cityNames) {
                map.addCity(new City(name, cityCount));
            }


        }
    }
}
