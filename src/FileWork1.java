
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork1 {
    public static void main(String [] args){

        try {
            writeToFile("test.txt");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
    public static void writeToFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()){
            file.createNewFile();

        }
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        try (FileWriter writer= new FileWriter(filename)) {
            while (!input.equals("exit")) {
                writer.write(input+ "/n");
                input = scanner.nextLine();
            }
        }

        System.out.println("Data is saved");


    }

}
