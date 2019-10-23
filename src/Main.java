import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
	SaveText saveText = new SaveText();
        try {
            saveText.saveHelper();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
