import java.io.IOException;

/**
 * Created by AlexanderSavenok on 12/22/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        StringToString stringToString = new StringToString("src\\main\\resources\\file.txt", "src\\main\\resources\\output.txt");
        stringToString.transformFile();
    }

}
