import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWork2 {
    public static void main(String [] args){
        try{
            writeRandom("test.txt");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static void writeRandom(String filename) throws IOException {
        File file = new File(filename);

        Random random = new Random();
        int num = random.nextInt(100)+1;
        if (!file.exists()){
            file.createNewFile();
        }
        try (FileWriter writer = new FileWriter(filename)){
            for(int i=0 ; i<10; i++ ){
                writer.write(num + "\n");
                num= random.nextInt(100)+1;
            }
        }
        System.out.println("10 random integers are recorded in: " + filename);
    }
}
