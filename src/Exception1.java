import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String [] args){
        try{
            readFile("text.txt");
            readFile("text1.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File is not Found");
        }
    }
    public static void readFile(String filename) throws FileNotFoundException {

        File file =new File(filename);
        if (!file.exists()){
            throw new FileNotFoundException();
        }
        try (Scanner scanner = new Scanner(file)){
            int lineNum=1;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println("Line "+ lineNum +":"+ line);
                lineNum++;
            }
        }
    }
}
