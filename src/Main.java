import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File archivo = new File("oscar_age_female.csv");
        Scanner source = new Scanner(archivo);

        FileWriter results = new FileWriter("results.txt",true);

        String firstLine = source.nextLine();
        while (source.hasNextLine()) {
             String line = source.nextLine();

            String[] row = line.split(",");

                String name = row[3];
                String year = row[1];
                String age = row[2];
                String movie = row[4];
                String separator = "===============";
                results.write("Name: " + name + "\n");
                results.write("Year: " + year + "\n");
                results.write("Age: " + age + "\n");
                results.write("Movie: " + movie + "\n");
                results.write(separator + "\n");

        }
        results.close();
        source.close();

        System.out.println("hola");
    }
}