package com.example.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.dto.response.GenericMessage;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<GenericMessage<?>> handleCustomException(CustomException ex) {
		return ResponseEntity.internalServerError().body(new GenericMessage<>("error", ex.getMessage(), null, false));
	}

}
