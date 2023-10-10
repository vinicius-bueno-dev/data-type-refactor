package org.leroy.refactor.factory.validators;

import org.leroy.refactor.constant.ExceptionMessages;
import org.leroy.refactor.exception.ValidationException;

public class IntegerValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new ValidationException(ExceptionMessages.INTEGER_VALIDATION_EXCEPTION.getMessage() + value);
        }
    }
}
