package com.fastoffer.backend.exceptions;

import com.fastoffer.backend.dtos.ControllerErrorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {InvalidAccountException.class})
    public ResponseEntity<ControllerErrorDto> handleUserExistedException(InvalidAccountException ex) {
        log.warn("User already existed:", ex);
        return ResponseEntity.ok(new ControllerErrorDto(400, ex.getMessage()));
    }
}
