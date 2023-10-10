package org.leroy.refactor.utils;

public class ValidationUtils {
    public static final String DATE_FORMAT = "dd/MM/yy";
    public static final String DATE_TIME_FORMAT = "dd/MM/yy HH:mm";
    public static void validateBoolean(String paramVal) throws Exception {
        if (!"true".equals(paramVal) && !"false".equals(paramVal)) {
            throw new Exception("Invalid boolean");
        }
    }
}
