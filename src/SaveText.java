import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaveText {
    public void saveHelper() throws InvocationTargetException, IllegalAccessException {
        TextContainer textContainer = new TextContainer();
        Class<?> cls = textContainer.getClass();

            if (cls.isAnnotationPresent(SaveTo.class)) {
                SaveTo saveTo = cls.getAnnotation(SaveTo.class);
                String path = saveTo.path();

                Method[] methods = cls.getDeclaredMethods();
                for (Method m : methods){
                    if(m.isAnnotationPresent(Saver.class)){
                        m.invoke(textContainer, path);
                    }
                }
            }
    }
}
