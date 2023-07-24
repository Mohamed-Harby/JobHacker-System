package OOPTasks.src.onlineshop;

public class StringValidationUtil {
    public static boolean isNull(String string) {
        return string == null;
    }

    public static boolean isEmpty(String string) {
        return string.trim().isEmpty();
    }
}
