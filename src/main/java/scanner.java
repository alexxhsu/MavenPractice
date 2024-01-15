import java.io.*;
import java.util.Scanner;


public class scanner {
    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "/Users/justin/Desktop/碩益實習/demo/data.csv";
        //file 物件
        File getCSVFiles = new File(filePath);
        Scanner sc =new Scanner(getCSVFiles);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            String curretToken = sc.next();
            System.out.print(curretToken+"|");
        }
        sc.close();
    }
}
