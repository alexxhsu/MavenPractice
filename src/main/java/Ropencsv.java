import com.opencsv.CSVReader;
import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ropencsv {
    public static void main(String[] args) throws  Exception
    {
        try {
            String filepath = "/Users/justin/Desktop/碩益實習/demo/src/data.csv";
            FileReader fileReader = new FileReader(filepath);

            CSVReader opensvReader = new CSVReader(fileReader); 
            String[] record; //字串陣列變數

            while ((record =opensvReader.readNext()) != null) {
                for (String token : record){
                    System.out.print(token+"\t");
                }
                System.out.println();
            }


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
