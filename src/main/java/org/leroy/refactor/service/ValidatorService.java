package org.leroy.refactor.service;

import org.leroy.refactor.constant.ValidationResponseMessages;
import org.leroy.refactor.exception.UnsupportedDataTypeException;
import org.leroy.refactor.exception.ValidationException;
import org.leroy.refactor.factory.ValidationFactory;
import org.leroy.refactor.factory.validators.Validator;
import org.leroy.refactor.model.ParameterParam;
import org.leroy.refactor.model.ValidationResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {
    private final ValidationFactory validationFactory = new ValidationFactory();
    public ValidationResponseDTO validateBeforeSave(ParameterParam param) {
        Validator validator = validationFactory.getValidator(param.type());
        validator.validate(param.value());
        return new ValidationResponseDTO(true, ValidationResponseMessages.SUCCESS.getMessage());
    }
}
