package org.leroy.refactor.factory.validators;

import org.leroy.refactor.constant.ExceptionMessages;
import org.leroy.refactor.exception.ValidationException;
import org.leroy.refactor.utils.ValidationUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        try {
            new SimpleDateFormat(ValidationUtils.DATE_FORMAT).parse(value);
        } catch (ParseException e) {
            throw new ValidationException(ExceptionMessages.DATE_VALIDATION_EXCEPTION.getMessage() + value);
        }
    }
}
