package org.leroy.refactor.constant;

public enum DataType {
    INTEGER(2, "integer"),
    DATE(3, "date"),
    DATE_FULL(4, "dateFull"),
    DOUBLE(5, "double"),
    BOOLEAN(7, "boolean"),
    UNKNOWN(-1, "unknown");

    private final int code;
    private final String name;

    DataType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DataType fromCode(int code) {
        for (DataType type : values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return UNKNOWN;
    }

    public static DataType fromName(String name) {
        for (DataType type : values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
