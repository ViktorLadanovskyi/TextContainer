import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo(path = "D:/test/Hello.txt")
public class TextContainer {
    String text = "Hello";

    @Saver
    public void save(String path){
        File file = new File(path);
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
