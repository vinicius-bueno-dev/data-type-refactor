package org.leroy.refactor.constant;

public enum ValidationResponseMessages {
    FAILED("Validation Failed: "),
    UNSUPPORTED_DATA_TYPE("Unsupported data type: "),
    SUCCESS("Validation success");


    private final String message;
    ValidationResponseMessages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}
