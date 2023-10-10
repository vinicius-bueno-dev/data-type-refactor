package org.leroy.refactor.factory.validators;

import org.leroy.refactor.constant.ExceptionMessages;
import org.leroy.refactor.exception.ValidationException;

public class DoubleValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new ValidationException(ExceptionMessages.DOUBLE_VALIDATION_EXCEPTION.getMessage() + value);
        }
    }
}
