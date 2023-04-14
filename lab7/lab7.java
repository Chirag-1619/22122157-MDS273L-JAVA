import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class lab7 {
    public static void main(String[] args){
        double SepalLengths = {}
        String csvFile = "C:/Users/DELL/Downloads/Iris.csv";
        String line = "";
        String csvSplitBy = ",";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);

            }

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
    
}
