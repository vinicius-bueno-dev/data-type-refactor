package org.leroy.refactor.factory.validators;

import org.leroy.refactor.exception.ValidationException;

public interface Validator {
    void validate(String value) throws ValidationException;
}
