package org.leroy.refactor.controller;

import org.leroy.refactor.model.ParameterParam;
import org.leroy.refactor.model.ValidationResponseDTO;
import org.leroy.refactor.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateDataTypeController {

    @Autowired
    private ValidatorService validatorService;

    @PostMapping("/validate")
    public ResponseEntity<ValidationResponseDTO> validate(@RequestBody ParameterParam param){
        return new ResponseEntity<>(validatorService.validateBeforeSave(param), HttpStatus.OK);
    }

}
