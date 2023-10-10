package org.leroy.refactor.exception.handler;

import org.leroy.refactor.constant.ValidationResponseMessages;
import org.leroy.refactor.exception.UnsupportedDataTypeException;
import org.leroy.refactor.exception.ValidationException;
import org.leroy.refactor.model.ValidationResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ValidationException.class})
    public ResponseEntity<ValidationResponseDTO> handleValidationException(Exception e) {
        return new ResponseEntity<>(new ValidationResponseDTO(false, ValidationResponseMessages.FAILED.getMessage() + e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({UnsupportedDataTypeException.class})
    public ResponseEntity<ValidationResponseDTO> handleUnsupportedDataTypeException(Exception e) {
        return new ResponseEntity<>(new ValidationResponseDTO(false, ValidationResponseMessages.UNSUPPORTED_DATA_TYPE.getMessage() + e.getLocalizedMessage()),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleInternalServerError(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}