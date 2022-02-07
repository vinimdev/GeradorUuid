import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.UUID;

public class GeradorUuid {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
        System.setOut(out);


        for(int i = 0; i < 2942; i++) {
            out.println(UUID.randomUUID().toString());
        }
    }
}
