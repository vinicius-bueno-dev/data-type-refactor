package org.leroy.refactor.constant;

public enum ExceptionMessages {

    INTEGER_VALIDATION_EXCEPTION("Invalid integer value: "),
    BOOLEAN_VALIDATION_EXCEPTION("Invalid boolean value: "),
    DATE_VALIDATION_EXCEPTION("Invalid date value: "),
    FULL_DATE_VALIDATION_EXCEPTION("Invalid date time value: "),
    DOUBLE_VALIDATION_EXCEPTION("Invalid double value: "),
    UNSUPPORTED_DATA_TYPE_EXCEPTION("Unsupported data type: ");

    private String message;
    ExceptionMessages(String message){
    }

    public String getMessage(){
        return this.message;
    }
}
