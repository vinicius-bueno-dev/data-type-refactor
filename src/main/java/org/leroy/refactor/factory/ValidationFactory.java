package org.leroy.refactor.factory;

import org.leroy.refactor.constant.DataType;
import org.leroy.refactor.exception.UnsupportedDataTypeException;
import org.leroy.refactor.factory.validators.*;


public class ValidationFactory {
    public Validator getValidator(String parameterDataType) throws UnsupportedDataTypeException {
        DataType dataType = DataType.fromName(parameterDataType);

        return switch (dataType) {
            case INTEGER -> new IntegerValidator();
            case DATE -> new DateValidator();
            case DATE_FULL-> new DateTimeValidator();
            case DOUBLE -> new DoubleValidator();
            case BOOLEAN -> new BooleanValidator();
            case UNKNOWN -> throw new UnsupportedDataTypeException(parameterDataType);
        };
    }
}
