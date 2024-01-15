import java.io.*;
import java.util.Scanner;

public class split {
    public static void main(String[] args)throws FileNotFoundException
    {
        String line ="";
        final String delimiter = ",";
        try {
            String filePath = "/Users/justin/Desktop/碩益實習/demo/src/data.csv";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line=reader.readLine())!=null) {
                String[] tokens =line.split(delimiter);
                for(String token : tokens){
                    System.out.print(token+"|");
                    
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    };    
}
