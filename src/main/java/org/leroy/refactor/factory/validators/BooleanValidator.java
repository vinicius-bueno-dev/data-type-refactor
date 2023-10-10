package org.leroy.refactor.factory.validators;

import org.leroy.refactor.constant.ExceptionMessages;
import org.leroy.refactor.exception.ValidationException;

public class BooleanValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new ValidationException(ExceptionMessages.BOOLEAN_VALIDATION_EXCEPTION.getMessage() + value);
        }
    }
}
