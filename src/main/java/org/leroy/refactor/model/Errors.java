package org.leroy.refactor.model;

import java.util.HashMap;
import java.util.Map;

public class Errors {
    private final Map<String, String> errorMap = new HashMap<>();

    public void rejectValue(String field, String errorMessage) {
        errorMap.put(field, errorMessage);
    }

    public Map<String, String> getErrors() {
        return errorMap;
    }

    public boolean hasErrors() {
        return !errorMap.isEmpty();
    }
}
